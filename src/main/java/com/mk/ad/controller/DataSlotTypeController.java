package com.mk.ad.controller;


import com.mk.ad.service.DataSlotTypeService;
import com.mk.ad.vo.DataSlotType;
import com.mk.ad.vo.Response.DataSlotTypeResponseDTO;
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
public class DataSlotTypeController {

    @Autowired
    public DataSlotTypeService dataSlotTypeService;


    @ApiOperation(value = "广告位字典查询")
    @RequestMapping(value = "/api/slotDataType/{slotTypeId}" , method = RequestMethod.POST)
    public ResponseResult getSlotType(@PathVariable("slotTypeId") Integer slotTypeId) throws Exception {
        List<DataSlotTypeResponseDTO> list = dataSlotTypeService.getSlotType(slotTypeId);
        return new ResponseResult(list);
    }


    @ApiOperation(value = "广告位字典查询")
    @RequestMapping(value = "/api/slotTypeList" , method = RequestMethod.POST)
    public ResponseResult slotTypeList(@RequestBody DataSlotType dataSlotType) throws Exception {
        List<DataSlotTypeResponseDTO> list = dataSlotTypeService.slotTypeList(dataSlotType);
        return new ResponseResult(list);
    }
}
