package com.mk.ad.service;

import com.mk.ad.vo.Request.SspClientIndexDTO;

public interface SspClientIndexService {
    String sspSelectMediaName(SspClientIndexDTO sspClientIndexDTO);

    String sspSelectSlotName(SspClientIndexDTO sspClientIndexDTO);

    String sspSelectSlotTypeName(SspClientIndexDTO sspClientIndexDTO);

    String getAgentByMediaId(String mediaId);
}
