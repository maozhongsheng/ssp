package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;



@Data
public class DataSlotTypeResponseDTO implements Serializable {

    private Long id;

    private String slotTypeName;

    private Integer slotTypeId;

    private static final long serialVersionUID = 1L;
}
