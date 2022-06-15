package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataMediaCategoryResponseDTO implements Serializable {

    private Long id;

    private String categoryName;

    private static final long serialVersionUID = 1L;
}
