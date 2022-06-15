package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mk.ad.vo.SspAdSlot;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SspMediaResponseDTO implements Serializable {
    private Long id;

    private Integer platform_type;

    private Integer store_id;

    private String detail_url;

    private String media_name;

    private Integer media_type_id;

    private String media_type_name;

    private Integer media_category_id;

    private String keywords;

    private String media_desc;

    private String package_name;

    private Integer relation_type;

    private String register_certificate;

    private String mandate_certificate;

    private Integer cooperation_status;

    private String web_domain;

    private String web_record;

    private Integer media_examine_status;

    private String record_url;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date create_time;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date update_time;

    private Integer is_deleted;

    private String user_id;

    private String sha_data;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date start_date;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date end_date;

    private String ua_examples;

    private List<SspAdSlot> list;



    private static final long serialVersionUID = 1L;

}