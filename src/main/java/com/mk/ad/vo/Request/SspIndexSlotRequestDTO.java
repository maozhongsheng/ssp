package com.mk.ad.vo.Request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class SspIndexSlotRequestDTO implements Serializable {

    /**  媒体id*/
    private List<String> media_id;

    /**  广告类型id*/
    private List<String> slot_type;

    /**  广告位id*/
    private List<String> slot_id;

    /**  用户id*/
    private String user_id;


}
