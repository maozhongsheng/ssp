package com.mk.ad.service;


import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.SspAdSlotRequestDTO;
import com.mk.ad.vo.Response.SspAdSlotResponseDTO;

import java.util.List;

/**
 * 广告位
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/21 14:12
 */
public interface SspAdSlotService {
    LarkPageInfoVo<SspAdSlotResponseDTO> getSlotList(SspAdSlotRequestDTO sspAdSlotRequestDTO, String userId);

    SspAdSlotResponseDTO getSlotInfo(Long id);

    Integer insertSlot(SspAdSlotRequestDTO sspAdSlot, String userId);

    Integer UpdatSlot(SspAdSlotRequestDTO sspAdSlot);

    int removeSlot(List<Long> list);

    Integer upDataSlotStatus(Long id, Integer slot_status);
}
