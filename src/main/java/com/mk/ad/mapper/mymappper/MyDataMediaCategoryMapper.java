package com.mk.ad.mapper.mymappper;

import com.mk.ad.mapper.DataMediaCategoryMapper;
import com.mk.ad.vo.DataMediaCategory;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MyDataMediaCategoryMapper extends DataMediaCategoryMapper {

    @Select("select id,category_name from data_media_category where type_id = #{type_id}")
    List<DataMediaCategory> selectMediatDataType(Integer typeId);
}
