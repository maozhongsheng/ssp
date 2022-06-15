package com.mk.ad.controller;


import com.mk.ad.service.SspClientIndexService;
import com.mk.ad.vo.Request.SspClientIndexDTO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class SspClientIndexController {

    @Autowired
    public SspClientIndexService sspClientIndexService;

    @ApiOperation(value = "SSP根据媒体id查询媒体名称")
    @RequestMapping(value = "/api/sspSelectMediaName", method = RequestMethod.POST)
    public String sspSelectMediaName(@RequestBody SspClientIndexDTO sspClientIndexDTO) throws Exception {
        String sspSelectMediaName = sspClientIndexService.sspSelectMediaName(sspClientIndexDTO);
        return  sspSelectMediaName;
    }

    @ApiOperation(value = "SSP根据广告位id查询广告位名称")
    @RequestMapping(value = "/api/sspSelectSlotName", method = RequestMethod.POST)
    public String sspSelectSlotName(@RequestBody SspClientIndexDTO sspClientIndexDTO) throws Exception {
        String sspSelectSlotName = sspClientIndexService.sspSelectSlotName(sspClientIndexDTO);
        return  sspSelectSlotName;
    }

    @ApiOperation(value = "SSP根据广告位类型id查询广告位类型名称")
    @RequestMapping(value = "/api/sspSelectSlotTypeName", method = RequestMethod.POST)
    public String sspSelectSlotTypeName(@RequestBody SspClientIndexDTO sspClientIndexDTO) throws Exception {
        String sspSelectSlotTypeName = sspClientIndexService.sspSelectSlotTypeName(sspClientIndexDTO);
        return  sspSelectSlotTypeName;
    }

    @ApiOperation(value = "SSP根据媒体id查询代理商id")
    @RequestMapping(value = "/api/agentByMediaId", method = RequestMethod.POST)
    public String agentByMediaId(@RequestBody String MediaId) throws Exception {
        String agentId = sspClientIndexService.getAgentByMediaId(MediaId);
        return  agentId;
    }
}
