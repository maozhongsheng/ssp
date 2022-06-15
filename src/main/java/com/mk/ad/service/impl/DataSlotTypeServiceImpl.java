package com.mk.ad.service.impl;


import com.mk.ad.mapper.mymappper.MyDataSlotTypeMapper;
import com.mk.ad.service.DataSlotTypeService;
import com.mk.ad.mapper.DataSlotTypeMapper;
import com.mk.ad.vo.DataSlotType;
import com.mk.ad.vo.Response.DataSlotTypeResponseDTO;
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
public class DataSlotTypeServiceImpl implements DataSlotTypeService {

    @Autowired
    DataSlotTypeMapper dataSlotTypeMapper;

    @Autowired
    MyDataSlotTypeMapper myDataSlotTypeMapper;


    @Override
    public List<DataSlotTypeResponseDTO> getSlotType(Integer slotTypeId) {

        List<DataSlotTypeResponseDTO> list1 = new ArrayList<>();

        List<DataSlotType> list = myDataSlotTypeMapper.selectDataSlot(slotTypeId);

        for (DataSlotType dataSlotType:list){
            DataSlotTypeResponseDTO dataSlotTypeResponseDTO = new DataSlotTypeResponseDTO();
            dataSlotTypeResponseDTO.setId(dataSlotType.getId());
            dataSlotTypeResponseDTO.setSlotTypeName(dataSlotType.getSlot_type_name());
            list1.add(dataSlotTypeResponseDTO);
        }
        return list1;
    }

    @Override
    public List<DataSlotTypeResponseDTO> slotTypeList(DataSlotType dataSlotType) {
        List<DataSlotTypeResponseDTO> list1 = new ArrayList<>();

        List<DataSlotType> list = myDataSlotTypeMapper.slotTypeList(dataSlotType);

        for (DataSlotType dataSlotType1 :list){
            DataSlotTypeResponseDTO dataSlotTypeResponseDTO = new DataSlotTypeResponseDTO();
            dataSlotTypeResponseDTO.setSlotTypeName(dataSlotType1.getSlot_type_name());
            dataSlotTypeResponseDTO.setSlotTypeId(dataSlotType1.getSlot_type_id());
            list1.add(dataSlotTypeResponseDTO);
        }
        return list1;
    }
}
