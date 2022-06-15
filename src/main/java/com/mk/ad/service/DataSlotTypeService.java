package com.mk.ad.service;


import com.mk.ad.vo.DataSlotType;
import com.mk.ad.vo.Response.DataSlotTypeResponseDTO;

import java.util.List;

/**
 * 广告位字典
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/28 13:15
 */
public interface DataSlotTypeService {

    List<DataSlotTypeResponseDTO> getSlotType(Integer slotTypeId);

    List<DataSlotTypeResponseDTO> slotTypeList(DataSlotType dataSlotType);
}
