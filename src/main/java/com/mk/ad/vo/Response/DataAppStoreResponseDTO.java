package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataAppStoreResponseDTO implements Serializable {
    private Long id;

    private String storeName;

    private static final long serialVersionUID = 1L;
}
