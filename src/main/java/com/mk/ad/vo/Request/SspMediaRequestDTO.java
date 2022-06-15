package com.mk.ad.vo.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mk.ad.vo.SspAdSlot;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SspMediaRequestDTO implements Serializable {
    private Long id;

    private Integer platformType;

    /**  id*/
    private String m_id;

    /**  平台*/
    private List<Integer> p_type;

    /**  状态*/
    private List<Integer> m_status;

    /**  行业*/
    private List<Integer> m_category;

    /**  行业*/
    private List<Integer> m_type;

    private Integer storeId;

    private String detailUrl;

    private String media_name;

    private Integer mediaTypeId;

    private String mediaTypeName;

    private Integer mediaCategoryId;

    private String keywords;

    private String mediaDesc;

    private String packageName;

    private Integer relationType;

    private String registerCertificate;

    private String mandateCertificate;

    private Integer cooperationStatus;

    private String webDomain;

    private String webRecord;

    private Integer mediaExamineStatus;

    private String recordUrl;

    private String ts_create_start;

    private String ts_create_end;

    private Integer isDeleted;

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

    private Integer limit = 10;

    private Integer page = 1;

    private File image;

    private static final long serialVersionUID = 1L;

}