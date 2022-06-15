package com.mk.ad.service;


import com.mk.ad.vo.Request.DataMediaTypeRequestDTO;
import com.mk.ad.vo.Response.DataMediaTypeResponseDTO;

import java.util.List;

/**
 * 媒体字典
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/28 13:15
 */
public interface DataMediaTypeService {
    List<DataMediaTypeResponseDTO> getMediaType(DataMediaTypeRequestDTO dataMediaTypeRequestDTO);


}
