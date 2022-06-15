package com.mk.ad.mapper;

import com.mk.ad.vo.SspShieldingRules;
import com.mk.ad.vo.SspShieldingRulesExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SspShieldingRulesMapper {
    long countByExample(SspShieldingRulesExample example);

    int deleteByExample(SspShieldingRulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SspShieldingRules record);

    int insertSelective(SspShieldingRules record);

    List<SspShieldingRules> selectByExample(SspShieldingRulesExample example);

    SspShieldingRules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SspShieldingRules record, @Param("example") SspShieldingRulesExample example);

    int updateByExample(@Param("record") SspShieldingRules record, @Param("example") SspShieldingRulesExample example);

    int updateByPrimaryKeySelective(SspShieldingRules record);

    int updateByPrimaryKey(SspShieldingRules record);

    Integer deleteShielding(Integer id);


    List selectName();

    List<Map> selectMedia(Map pream);

    List<Map> selectSlot(Map pream);

    List<Map> selectSlotAll(Map pream);

    Integer selectRepeat(String ad_id);

    List<Map> selectAll(Map pream);

    Integer selectId();
}