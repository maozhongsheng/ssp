package com.mk.ad.service;

import com.mk.ad.vo.Response.DataAppStoreResponseDTO;

import java.util.List;


/**
 * 媒体字典
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/27 19:25
 */
public interface DataAppStoreService {


    List<DataAppStoreResponseDTO> getMediaData(Integer platformType);
}
