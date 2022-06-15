package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class AdminSspFinancialRequestDTO implements Serializable {
    private Long id;

    private String userId;

    private Integer sspId;

    private String adxNameCompany;

    private Integer adxType;

    private String payee;

    private String bankAccount;

    private String bankDeposit;

    private Integer isDeleted;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
