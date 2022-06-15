package com.mk.ad.controller;


import com.mk.ad.service.DataAdTemplateService;
import com.mk.ad.vo.Response.DataAdTemplateResponseDTO;
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
public class DataAdTemplateController {

    @Autowired
    public DataAdTemplateService dataAdTemplateService;


    @ApiOperation(value = "广告位字典查询")
    @RequestMapping(value = "/api/slotDataTemplate", method = RequestMethod.POST)
    public ResponseResult getSlotTemplate(@RequestParam Long id) throws Exception {
        List<DataAdTemplateResponseDTO> list = dataAdTemplateService.getSlotTemplate(id);
        return new ResponseResult(list);
    }
}