package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class SspClientIndexDTO implements Serializable {

    /**  媒体id*/
    private String media_id;

    /**  广告位id*/
    private String slot_id;

    /**  广告位类型id*/
    private String slot_type;
}
