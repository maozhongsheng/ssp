package com.mk.ad.mapper.mymappper;

import com.mk.ad.mapper.DataAdTemplateMapper;
import com.mk.ad.vo.DataAdTemplate;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MyDataAdTemplateMapper extends DataAdTemplateMapper {

    @Select("select id,ad_template_name,type,ratio,size from data_ad_template where id = #{id}")
    List<DataAdTemplate> selectDataAdTemplate(Long id);
}
