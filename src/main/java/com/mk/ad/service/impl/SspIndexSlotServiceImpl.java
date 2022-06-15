package com.mk.ad.service.impl;

import com.mk.ad.service.SspIndexSlotService;
import com.mk.ad.mapper.SspMediaMapper;
import com.mk.ad.vo.Request.SspIndexSlotRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 广告位
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/21 14:12
 */
@Slf4j
@Service
@Repository
public class SspIndexSlotServiceImpl implements SspIndexSlotService {

    @Autowired
    SspMediaMapper sspMediaMapper;

    @Override
    public List<String> sspIndexSlotId(SspIndexSlotRequestDTO sspIndexSlotRequestDTO) {
        if(StringUtils.isEmpty(sspIndexSlotRequestDTO.getMedia_id().get(0)) && StringUtils.isEmpty(sspIndexSlotRequestDTO.getSlot_id().get(0)) && StringUtils.isEmpty(sspIndexSlotRequestDTO.getSlot_type().get(0))){
            return null;
        }
          if(StringUtils.isEmpty(sspIndexSlotRequestDTO.getSlot_type().get(0))){
              sspIndexSlotRequestDTO.setSlot_type(null);
          }
        if(StringUtils.isEmpty(sspIndexSlotRequestDTO.getSlot_id().get(0))){
            sspIndexSlotRequestDTO.setSlot_id(null);
        }
        if(StringUtils.isEmpty(sspIndexSlotRequestDTO.getMedia_id().get(0))){
            sspIndexSlotRequestDTO.setMedia_id(null);
        }

        List<String> sspIndexSlotId = sspMediaMapper.sspIndexSlotId(sspIndexSlotRequestDTO);
        return sspIndexSlotId;
    }

    @Override
    public List<String> sspIndexMediaId(SspIndexSlotRequestDTO sspIndexSlotRequestDTO) {
        List<String> sspIndexMediaId = sspMediaMapper.sspIndexMediaId(sspIndexSlotRequestDTO);
        return sspIndexMediaId;
    }

    @Override
    public List sspIndexSlotName(SspIndexSlotRequestDTO sspIndexSlotRequestDTO) {
        List list = sspMediaMapper.sspIndexSlotName(sspIndexSlotRequestDTO);
        return list;
    }
}
