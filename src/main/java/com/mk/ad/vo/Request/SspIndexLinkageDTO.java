package com.mk.ad.vo.Request;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SspIndexLinkageDTO implements Serializable {


    /**  媒体id*/
    private List<String> media_id;
}
