package com.mk.ad.mapper;

import com.mk.ad.vo.Request.SspClientIndexDTO;
import com.mk.ad.vo.SspAdSlot;
import com.mk.ad.vo.SspAdSlotExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SspAdSlotMapper {
    long countByExample(SspAdSlotExample example);

    int deleteByExample(SspAdSlotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SspAdSlot record);

    int insertSelective(SspAdSlot record);

    List<SspAdSlot> selectByExampleWithBLOBs(SspAdSlotExample example);

    List<SspAdSlot> selectByExample(SspAdSlotExample example);

    SspAdSlot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SspAdSlot record, @Param("example") SspAdSlotExample example);

    int updateByExampleWithBLOBs(@Param("record") SspAdSlot record, @Param("example") SspAdSlotExample example);

    int updateByExample(@Param("record") SspAdSlot record, @Param("example") SspAdSlotExample example);

    int updateByPrimaryKeySelective(SspAdSlot record);

    int updateByPrimaryKeyWithBLOBs(SspAdSlot record);

    int updateByPrimaryKey(SspAdSlot record);

    Integer upDataSlotStatus(Long id, Integer slot_status);

    int removeSlot(@Param("list") List<Long> list);

    List<SspAdSlot> selectMediaId(long parseLong);

    Integer getslotId();

    String sspSelectSlotName(SspClientIndexDTO sspClientIndexDTO);

    Map selectssp(String user_id);
}