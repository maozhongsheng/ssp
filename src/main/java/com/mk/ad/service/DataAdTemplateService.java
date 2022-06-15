package com.mk.ad.service;

import com.mk.ad.vo.Response.DataAdTemplateResponseDTO;

import java.util.List;



/**
 * 广告位字典
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/28 13:15
 */
public interface DataAdTemplateService {
    List<DataAdTemplateResponseDTO> getSlotTemplate(Long id);
}
