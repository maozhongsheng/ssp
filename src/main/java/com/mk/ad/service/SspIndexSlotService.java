package com.mk.ad.service;

import com.mk.ad.vo.Request.SspIndexSlotRequestDTO;

import java.util.List;

public interface SspIndexSlotService {
    List<String> sspIndexSlotId(SspIndexSlotRequestDTO sspIndexSlotRequestDTO);

    List<String> sspIndexMediaId(SspIndexSlotRequestDTO sspIndexSlotRequestDTO);

    List sspIndexSlotName(SspIndexSlotRequestDTO sspIndexSlotRequestDTO);
}
