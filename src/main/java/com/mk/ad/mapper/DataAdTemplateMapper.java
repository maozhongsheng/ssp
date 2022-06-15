package com.mk.ad.mapper;

import com.mk.ad.vo.DataAdTemplate;
import com.mk.ad.vo.DataAdTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataAdTemplateMapper {
    long countByExample(DataAdTemplateExample example);

    int deleteByExample(DataAdTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DataAdTemplate record);

    int insertSelective(DataAdTemplate record);

    List<DataAdTemplate> selectByExample(DataAdTemplateExample example);

    DataAdTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DataAdTemplate record, @Param("example") DataAdTemplateExample example);

    int updateByExample(@Param("record") DataAdTemplate record, @Param("example") DataAdTemplateExample example);

    int updateByPrimaryKeySelective(DataAdTemplate record);

    int updateByPrimaryKey(DataAdTemplate record);
}