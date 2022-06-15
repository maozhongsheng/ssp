package com.mk.ad.service.impl;


import com.mk.ad.mapper.mymappper.MyDataMediaCategoryMapper;
import com.mk.ad.service.DataMediaCategoryService;
import com.mk.ad.mapper.DataMediaCategoryMapper;
import com.mk.ad.vo.DataMediaCategory;
import com.mk.ad.vo.Response.DataMediaCategoryResponseDTO;
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
 * @date 2021/1/27 19:24
 */
@Slf4j
@Service
@Repository
public class DataMediaCategoryServiceImpl implements DataMediaCategoryService {


    @Autowired
    DataMediaCategoryMapper dataMediaCategoryMapper;

    @Autowired
    MyDataMediaCategoryMapper myDataMediaCategoryMapper;




    @Override
    public List<DataMediaCategoryResponseDTO> getMediatDataType(Integer typeId) {
        List<DataMediaCategoryResponseDTO> list1 = new ArrayList<>();

        List<DataMediaCategory> list = myDataMediaCategoryMapper.selectMediatDataType(typeId);

        for (DataMediaCategory dataMediaCategory:list){
            DataMediaCategoryResponseDTO dataMediaCategoryResponseDTO = new DataMediaCategoryResponseDTO();
            dataMediaCategoryResponseDTO.setId(dataMediaCategory.getId());
            dataMediaCategoryResponseDTO.setCategoryName(dataMediaCategory.getCategory_name());
            list1.add(dataMediaCategoryResponseDTO);
        }
        return list1;
    }
}
