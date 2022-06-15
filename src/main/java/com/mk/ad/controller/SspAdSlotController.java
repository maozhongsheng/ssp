package com.mk.ad.controller;


import com.mk.ad.service.SspAdSlotService;
import com.mk.ad.client.UserClient;
import com.mk.ad.utils.Constant;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.ResponseStatus;
import com.mk.ad.vo.Request.SspAdSlotRequestDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.vo.Response.SspAdSlotResponseDTO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * TODO
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/21 14:14
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class SspAdSlotController {

    @Autowired
    public SspAdSlotService sspAdSlotService;

    @Autowired
    private UserClient userClient;

    @ApiOperation(value = "广告位列表查询")
    @RequestMapping(value = "/api/slotList", method = RequestMethod.POST)
    public ResponseResult getSlotList(@RequestBody SspAdSlotRequestDTO sspAdSlotRequestDTO, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(userId == null){
            return new ResponseResult(15,"登录超时");
        }else {
            LarkPageInfoVo<SspAdSlotResponseDTO> list = sspAdSlotService.getSlotList(sspAdSlotRequestDTO, userId);
            return new ResponseResult(list);
        }
    }


    @ApiOperation(value = "广告位列表查询详情")
    @RequestMapping(value = "/api/slotListId/{id}", method = RequestMethod.POST)
    public ResponseResult getSlotInfo(@PathVariable("id") Long id) throws Exception {
        SspAdSlotResponseDTO sspAdSlotResponseDTO = sspAdSlotService.getSlotInfo(id);
        return new ResponseResult(sspAdSlotResponseDTO);
    }

    @ApiOperation(value = "广告位列表新建添加")
    @RequestMapping(value = "/api/slotAdd", method = RequestMethod.POST)
    public ResponseResult insertSlot(@RequestBody SspAdSlotRequestDTO sspAdSlot, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(userId == null){
            return new ResponseResult(15,"登录超时");
        }else {
            Integer result = sspAdSlotService.insertSlot(sspAdSlot, userId);
            if (result == 0) {
                return new ResponseResult(ResponseStatus.SERVICE_ERROR);

            }
            return new ResponseResult();
        }
    }

    @ApiOperation(value = "广告位列表修改")
    @RequestMapping(value = "/api/slotEdit", method = RequestMethod.POST)
    public ResponseResult UpdatSlot(@RequestBody SspAdSlotRequestDTO sspAdSlot) throws Exception {
        Integer result =sspAdSlotService.UpdatSlot(sspAdSlot);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "广告位列表删除")
    @RequestMapping(value = "/api/slotRemove/{id}", method = RequestMethod.POST)
    public ResponseResult removeSlot(@PathVariable("id") String id) throws Exception {
        String[] gpIds = id.split(",");
        List<Long> list = new ArrayList<>();
        for(String str:gpIds){
            list.add(Long.parseLong(str));
        }
        return new ResponseResult(sspAdSlotService.removeSlot(list));
    }

    @ApiOperation(value = "广告位列表修改状态")
    @RequestMapping(value = "/api/upDataSlotStatus/{id}/{slot_status}", method = RequestMethod.POST)
    public ResponseResult upDataSlotStatus(@PathVariable("id") Long id ,@PathVariable("slot_status") Integer slot_status) throws Exception {
        Integer result =sspAdSlotService.upDataSlotStatus(id,slot_status);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

}
