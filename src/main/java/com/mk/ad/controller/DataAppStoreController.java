package com.mk.ad.controller;


import com.mk.ad.service.DataAppStoreService;
import com.mk.ad.vo.Response.DataAppStoreResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * TODO
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/26 14:14
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class DataAppStoreController {

    @Autowired
    public DataAppStoreService dataAppStoreService;

    @ApiOperation(value = "媒体字典查询")
    @RequestMapping(value = "/api/mediaData/{platformType}" , method = RequestMethod.POST)
    public ResponseResult getMediaData(@PathVariable("platformType") Integer platformType) throws Exception {
        List<DataAppStoreResponseDTO> list = dataAppStoreService.getMediaData(platformType);
        return new ResponseResult(list);
    }
}
