package com.mk.ad.controller;


import com.mk.ad.service.DataMediaCategoryService;
import com.mk.ad.vo.Response.DataMediaCategoryResponseDTO;
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
 * @date 2021/1/27 19:22
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class DataMediaCategoryController {

    @Autowired
    public DataMediaCategoryService dataMediaCategoryService;

    @ApiOperation(value = "媒体字典查询")
    @RequestMapping(value = "/api/mediaDataClasses/{typeId}", method = RequestMethod.POST)
    public ResponseResult getMediatDataType(@PathVariable("typeId") Integer typeId) throws Exception {
        List<DataMediaCategoryResponseDTO> list = dataMediaCategoryService.getMediatDataType(typeId);
        return new ResponseResult(list);
    }
}