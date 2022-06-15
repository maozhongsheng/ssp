package com.mk.ad.service;

import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.MediaNameReuestDTO;
import com.mk.ad.vo.Request.SspMediaRequestDTO;
import com.mk.ad.vo.Response.MediaNameResponseDTO;
import com.mk.ad.vo.Response.SspMediaResponseDTO;
import com.mk.ad.vo.SspMedia;

import java.util.List;

/**
 * 媒体
 *
 * @author yjn
 * @version 1.0
 * @date 2021/1/13 13:22
 */
public interface SspMediaService {

     LarkPageInfoVo<SspMediaResponseDTO> getMediaList(SspMediaRequestDTO sspMediaRequestDTO, String userId);

     SspMediaResponseDTO getMediatInfo(Long id);

     Integer insertMediat(SspMedia sspMedia, String userId);

     Integer UpdateMediat(SspMedia sspMedia);

     LarkPageInfoVo<SspMediaResponseDTO> getMediaAdoptList(SspMediaRequestDTO sspMediaRequestDTO, String userId);

    List<MediaNameResponseDTO> mediaNameList(MediaNameReuestDTO mediaNameReuestDTO);

    String mediaByTagid(String tagid);
}
