package com.mk.ad.mapper.mymappper;

import com.mk.ad.mapper.DataSlotTypeMapper;
import com.mk.ad.vo.DataSlotType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MyDataSlotTypeMapper extends DataSlotTypeMapper {


    @Select("select id,slot_type_name from data_slot_type where slot_type_id = #{slot_type_id}")
    List<DataSlotType> selectDataSlot(Integer slotTypeId);

    @Select("select slot_type_name,slot_type_id from data_slot_type")
    List<DataSlotType> slotTypeList(DataSlotType dataSlotType);
}
