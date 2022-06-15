package com.mk.ad.mapper.mymappper;

import com.mk.ad.mapper.DataAppStoreMapper;
import com.mk.ad.vo.DataAppStore;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MyDataAppStoreMapper extends DataAppStoreMapper {

    @Select("select id,store_name from data_app_store where platform_type = #{platform_type}")
    List<DataAppStore> selectMediaData(Integer platformType);
}