package com.mk.ad.service.impl;


import com.mk.ad.mapper.DataAppStoreMapper;
import com.mk.ad.mapper.mymappper.MyDataAppStoreMapper;
import com.mk.ad.service.DataAppStoreService;
import com.mk.ad.vo.DataAppStore;
import com.mk.ad.vo.Response.DataAppStoreResponseDTO;
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
 * @date 2021/1/26 14:12
 */
@Slf4j
@Service
@Repository
public class DataAppStoreServiceImpl implements DataAppStoreService {

    @Autowired
    DataAppStoreMapper dataAppStoreMapper;

    @Autowired
    MyDataAppStoreMapper myDataAppStoreMapper;


    @Override
    public List<DataAppStoreResponseDTO> getMediaData(Integer platformType) {
        List<DataAppStoreResponseDTO> list1 = new ArrayList<>();

        List<DataAppStore> list = myDataAppStoreMapper.selectMediaData(platformType);

        for (DataAppStore dataAppStore:list){
            DataAppStoreResponseDTO dataAppStoreResponseDTO = new DataAppStoreResponseDTO();
            dataAppStoreResponseDTO.setId(dataAppStore.getId());
            dataAppStoreResponseDTO.setStoreName(dataAppStore.getStore_name());
            list1.add(dataAppStoreResponseDTO);
        }
        return list1;
    }
}
