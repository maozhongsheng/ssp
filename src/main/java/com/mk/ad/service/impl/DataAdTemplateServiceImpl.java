package com.mk.ad.service.impl;


import com.mk.ad.mapper.DataAdTemplateMapper;
import com.mk.ad.mapper.mymappper.MyDataAdTemplateMapper;
import com.mk.ad.service.DataAdTemplateService;
import com.mk.ad.vo.DataAdTemplate;
import com.mk.ad.vo.Response.DataAdTemplateResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 广告位字典
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/28 13:16
 */
@Slf4j
@Service
@Repository
public class DataAdTemplateServiceImpl implements DataAdTemplateService {

    @Autowired
    DataAdTemplateMapper dataAdTemplateMapper;

    @Autowired
    MyDataAdTemplateMapper myDataAdTemplateMapper;

    @Override
    public List<DataAdTemplateResponseDTO> getSlotTemplate(Long id) {
        List<DataAdTemplateResponseDTO> list1 = new ArrayList<>();
        DataAdTemplateResponseDTO dataAdTemplateResponseDTO = new DataAdTemplateResponseDTO();
        List<DataAdTemplate> list = myDataAdTemplateMapper.selectDataAdTemplate(id);

        for (DataAdTemplate dataAdTemplate:list){

            dataAdTemplateResponseDTO.setId(dataAdTemplate.getId());
            dataAdTemplateResponseDTO.setAdTemplateName(dataAdTemplate.getAd_template_name());
            dataAdTemplateResponseDTO.setType(dataAdTemplate.getType());
            dataAdTemplateResponseDTO.setRatio(dataAdTemplate.getRatio());
            dataAdTemplateResponseDTO.setSize(dataAdTemplate.getSize());
            list1.add(dataAdTemplateResponseDTO);
        }
        return list1;
    }
}
