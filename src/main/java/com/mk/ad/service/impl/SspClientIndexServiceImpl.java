package com.mk.ad.service.impl;

import com.mk.ad.mapper.SspAdSlotMapper;
import com.mk.ad.service.SspClientIndexService;
import com.mk.ad.mapper.DataSlotTypeMapper;
import com.mk.ad.mapper.SspMediaMapper;
import com.mk.ad.vo.Request.SspClientIndexDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@Repository
public class SspClientIndexServiceImpl implements SspClientIndexService {

    @Autowired
    SspMediaMapper sspMediaMapper;

    @Autowired
    SspAdSlotMapper sspAdSlotMapper;

    @Autowired
    DataSlotTypeMapper dataSlotTypeMapper;


    @Override
    public String sspSelectMediaName(SspClientIndexDTO sspClientIndexDTO) {
       String sspSelectMediaName = sspMediaMapper.sspSelectMediaName(sspClientIndexDTO);
        return sspSelectMediaName;
    }

    @Override
    public String sspSelectSlotName(SspClientIndexDTO sspClientIndexDTO) {
        String sspSelectSlotName = sspAdSlotMapper.sspSelectSlotName(sspClientIndexDTO);
        return sspSelectSlotName;
    }

    @Override
    public String sspSelectSlotTypeName(SspClientIndexDTO sspClientIndexDTO) {
        String sspSelectSlotTypeName = dataSlotTypeMapper.sspSelectSlotTypeName(sspClientIndexDTO);
        return sspSelectSlotTypeName;
    }

    @Override
    public String getAgentByMediaId(String mediaId) {
        String agentId = sspMediaMapper.getAgentByMediaId(mediaId);
        return agentId;
    }
}
