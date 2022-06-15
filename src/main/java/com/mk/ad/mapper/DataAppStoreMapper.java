package com.mk.ad.mapper;

import com.mk.ad.vo.DataAppStore;
import com.mk.ad.vo.DataAppStoreExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DataAppStoreMapper {
    long countByExample(DataAppStoreExample example);

    int deleteByExample(DataAppStoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DataAppStore record);

    int insertSelective(DataAppStore record);

    List<DataAppStore> selectByExample(DataAppStoreExample example);

    DataAppStore selectByPrimaryKey(Integer platformType);

    int updateByExampleSelective(@Param("record") DataAppStore record, @Param("example") DataAppStoreExample example);

    int updateByExample(@Param("record") DataAppStore record, @Param("example") DataAppStoreExample example);

    int updateByPrimaryKeySelective(DataAppStore record);

    int updateByPrimaryKey(DataAppStore record);

}