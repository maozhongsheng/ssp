package com.mk.ad.controller;

import com.mk.ad.service.SspIndexSlotService;
import com.mk.ad.vo.Request.SspIndexSlotRequestDTO;
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
 * @date 2021/1/13 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class SspIndexSlotController {

    @Autowired
    public SspIndexSlotService sspIndexSlotService;

    @ApiOperation(value = "DSP根据条件查询广告位id")
    @RequestMapping(value = "/api/sspIndexSlotId", method = RequestMethod.POST)
    public List<String> sspIndexSlotId(@RequestBody SspIndexSlotRequestDTO sspIndexSlotRequestDTO) throws Exception {
        List<String> sspIndexSlotId = sspIndexSlotService.sspIndexSlotId(sspIndexSlotRequestDTO);
        return  sspIndexSlotId;
    }


    @ApiOperation(value = "SSP根据条件查询媒体id")
    @RequestMapping(value = "/api/sspIndexMediaId", method = RequestMethod.POST)
    public List<String> sspIndexMediaId(@RequestBody SspIndexSlotRequestDTO sspIndexSlotRequestDTO) throws Exception {
        List<String> sspIndexMediaId = sspIndexSlotService.sspIndexMediaId(sspIndexSlotRequestDTO);
        return  sspIndexMediaId;
    }



    @ApiOperation(value = "根据广告位类型id查询广告位id和名称")
    @RequestMapping(value = "/api/sspIndexSlotName", method = RequestMethod.POST)
    public ResponseResult sspIndexSlotName(@RequestBody SspIndexSlotRequestDTO sspIndexSlotRequestDTO) throws Exception {
        List list = sspIndexSlotService.sspIndexSlotName(sspIndexSlotRequestDTO);
        return new ResponseResult(list);
    }












}
