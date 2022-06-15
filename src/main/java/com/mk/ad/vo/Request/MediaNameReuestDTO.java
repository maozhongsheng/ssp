package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MediaNameReuestDTO implements Serializable {
    private List<String> media_id;

    private static final long serialVersionUID = 1L;

}