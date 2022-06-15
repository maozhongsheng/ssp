package com.mk.ad.mapper.mymappper;

import com.mk.ad.mapper.DataMediaTypeMapper;
import com.mk.ad.vo.DataMediaType;
import com.mk.ad.vo.Request.DataMediaTypeRequestDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MyDataMediaTypeMapper extends DataMediaTypeMapper {


    @Select("select id,type_name from data_media_type")
    List<DataMediaType> selectMediaType(DataMediaTypeRequestDTO dataMediaTypeRequestDTO);

    @Select("select type_name from data_media_type where id=#{id}")
    String selectMediaById(Integer id);
}
