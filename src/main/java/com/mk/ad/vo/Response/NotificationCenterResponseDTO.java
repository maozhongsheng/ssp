package com.mk.ad.vo.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class NotificationCenterResponseDTO implements Serializable {

    private Integer id;

    private Integer status;

    private Integer type;

    private String notification_title;

    private String notice_text;

    private Integer top;

    private String  create_time;


    private static final long serialVersionUID = 1L;

}