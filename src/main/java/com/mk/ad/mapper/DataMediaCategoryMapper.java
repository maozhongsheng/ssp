package com.mk.ad.mapper;

import com.mk.ad.vo.DataMediaCategory;
import com.mk.ad.vo.DataMediaCategoryExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataMediaCategoryMapper {
    long countByExample(DataMediaCategoryExample example);

    int deleteByExample(DataMediaCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DataMediaCategory record);

    int insertSelective(DataMediaCategory record);

    List<DataMediaCategory> selectByExample(DataMediaCategoryExample example);

    DataMediaCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DataMediaCategory record, @Param("example") DataMediaCategoryExample example);

    int updateByExample(@Param("record") DataMediaCategory record, @Param("example") DataMediaCategoryExample example);

    int updateByPrimaryKeySelective(DataMediaCategory record);

    int updateByPrimaryKey(DataMediaCategory record);
}