package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShieldingRulesRequestDTO implements Serializable {

    private Integer id;

    private String name;

    private String classification;

    private String key_word;

    private String ios_package;

    private String android_package;

    private String related_media;

    private String related_advertising;

    private Integer limit = 10;

    private Integer page = 1;
    private static final long serialVersionUID = 1L;

}