package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataAdTemplateResponseDTO implements Serializable {

    private Long id;

    private String adTemplateName;

    private Integer type;

    private String ratio;

    private String size;

    private static final long serialVersionUID = 1L;
}
