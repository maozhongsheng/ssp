package com.mk.ad.vo.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class SspAdSlotResponseDTO implements Serializable {

    private Long id;

    private Integer media_id;

    private String mediaName;

    private Integer platform_type;

    private String bussiness_type_one;

    private Integer slot_type_id;

    private Integer settlement_way;

    private String ad_template_id;

    private String ad_template_type;

    private String slot_name;

    private Integer slot_status;

    private Integer business_status;

    private Integer cooperation_type;

    private Integer render_type;

    private String web_linked;

    private String application_download;

    private Integer ad_pull_mode;

    private BigDecimal cp_price;

    private String requet_rate;

    private Integer slot_examine_status;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date create_time;

    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date update_time;

    private Integer is_deleted;

    private List ad_type_received;

    private Long ssp_id;

    private String ssp_name;

    private String user_id;

    private String block_keywords;

    private String block_android_app;

    private String block_ios_app;

    private String block_industry;

    private Integer specific;

    private Integer awarding;

    private String callback_url;

    private String secret_key;

    private String ad_template_custom;

    private String upper_id;

    private String upper_slot;

    private String upper_ecpm;

    private String downstream_ecpm;

    private static final long serialVersionUID = 1L;
}
