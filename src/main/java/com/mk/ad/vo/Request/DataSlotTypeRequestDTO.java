package com.mk.ad.vo.Request;


import lombok.Data;

import java.io.Serializable;

@Data
public class DataSlotTypeRequestDTO implements Serializable {

    private Long id;

    private String slotTypeName;

    private Integer slotTypeId;

    private static final long serialVersionUID = 1L;
}
