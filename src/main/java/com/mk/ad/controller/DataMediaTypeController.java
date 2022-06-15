package com.mk.ad.controller;


import com.mk.ad.service.DataMediaTypeService;
import com.mk.ad.vo.Request.DataMediaTypeRequestDTO;
import com.mk.ad.vo.Response.DataMediaTypeResponseDTO;
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
 * @date 2021/1/28 11:15
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class DataMediaTypeController {

    @Autowired
    public DataMediaTypeService dataMediaTypeService;


    @ApiOperation(value = "媒体字典查询")
    @RequestMapping(value = "/api/mediaDataType", method = RequestMethod.POST)
    public ResponseResult getMediaType(@RequestBody DataMediaTypeRequestDTO dataMediaTypeRequestDTO) throws Exception {
        List<DataMediaTypeResponseDTO> list = dataMediaTypeService.getMediaType(dataMediaTypeRequestDTO);
        return new ResponseResult(list);
    }

}
