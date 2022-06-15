package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataAppStoreRequestDTO implements Serializable {
    private Long id;

    private String storeName;

    private Integer platformType;

    private static final long serialVersionUID = 1L;
}
