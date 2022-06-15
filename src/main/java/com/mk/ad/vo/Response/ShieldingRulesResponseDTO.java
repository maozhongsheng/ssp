package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShieldingRulesResponseDTO implements Serializable {

    private String name;

    private String shielding_dimension;

    private String related_advertising;

    private String related_media;

    private String android_package;

    private String ios_package;

    private String key_word;

    private String classification;

    private String createTime;

    private Integer id;

    private static final long serialVersionUID = 1L;

}