package com.mk.ad.service.impl;

import com.mk.ad.mapper.DataMediaTypeMapper;
import com.mk.ad.mapper.mymappper.MyDataMediaTypeMapper;
import com.mk.ad.service.DataMediaTypeService;
import com.mk.ad.vo.DataMediaType;
import com.mk.ad.vo.Request.DataMediaTypeRequestDTO;
import com.mk.ad.vo.Response.DataMediaTypeResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * 媒体字典
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/28 13:16
 */
@Slf4j
@Service
@Repository
public class DataMediaTypeServiceImpl implements DataMediaTypeService {

    @Autowired
    DataMediaTypeMapper dataMediaTypeMapper;

    @Autowired
    MyDataMediaTypeMapper myDataMediaTypeMapper;

    @Override
    public List<DataMediaTypeResponseDTO> getMediaType(DataMediaTypeRequestDTO dataMediaTypeRequestDTO) {
        List<DataMediaTypeResponseDTO> list1 = new ArrayList<>();

        List<DataMediaType> list = myDataMediaTypeMapper.selectMediaType(dataMediaTypeRequestDTO);

        for (DataMediaType dataMediaType:list){
            DataMediaTypeResponseDTO dataMediaTypeResponseDTO = new DataMediaTypeResponseDTO();
            dataMediaTypeResponseDTO.setId(dataMediaType.getId());
            dataMediaTypeResponseDTO.setTypeName(dataMediaType.getType_name());
            list1.add(dataMediaTypeResponseDTO);
        }
        return list1;
    }


}
