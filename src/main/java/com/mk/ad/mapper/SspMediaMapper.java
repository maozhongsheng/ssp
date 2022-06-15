package com.mk.ad.mapper;

import com.mk.ad.vo.Request.SspClientIndexDTO;
import com.mk.ad.vo.SspMedia;
import com.mk.ad.vo.SspMediaExample;
import com.mk.ad.vo.Request.MediaNameReuestDTO;
import com.mk.ad.vo.Request.SspIndexSlotRequestDTO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SspMediaMapper {
    long countByExample(SspMediaExample example);

    int deleteByExample(SspMediaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SspMedia record);

    int insertSelective(SspMedia record);

    List<SspMedia> selectByExample(SspMediaExample example);

    SspMedia selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SspMedia record, @Param("example") SspMediaExample example);

    int updateByExample(@Param("record") SspMedia record, @Param("example") SspMediaExample example);

    int updateByPrimaryKeySelective(SspMedia record);

    int updateByPrimaryKey(SspMedia record);

    List<String> sspIndexSlotId(SspIndexSlotRequestDTO sspIndexSlotRequestDTO);

    Integer selectsys(String id);
    List<SspMedia> mediaNameList(MediaNameReuestDTO mediaNameReuestDTO);

    List<String> sspIndexMediaId(SspIndexSlotRequestDTO sspIndexSlotRequestDTO);

    String mediaByTagid(String tagid);

    String sspSelectMediaName(SspClientIndexDTO sspClientIndexDTO);

    List sspIndexSlotName(SspIndexSlotRequestDTO sspIndexSlotRequestDTO);

    String getAgentByMediaId(String mediaId);
}