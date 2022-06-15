package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class NotificationCenterRequestDTO implements Serializable {


    private Integer id;

    private String status;

    private String type;

    private Integer limit = 10;

    private Integer page = 1;
    private static final long serialVersionUID = 1L;

}