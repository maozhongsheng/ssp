package com.mk.ad.controller;

import com.mk.ad.service.NotificationCenterService;
import com.mk.ad.client.UserClient;
import com.mk.ad.utils.Constant;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.ResponseStatus;
import com.mk.ad.vo.Request.NotificationCenterRequestDTO;
import com.mk.ad.vo.Response.NotificationCenterResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * TODO
 *
 * @author mzs
 * @version 1.1
 * @date 2021/6/29 14:14
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class NotificationCenterController {
    @Autowired
    private NotificationCenterService notificationCenterService;
    @Autowired
    private UserClient userClient;

    @ApiOperation(value = "通知中心列表查询")
    @RequestMapping(value = "/api/notificationCenterList", method = RequestMethod.POST)
    public ResponseResult NotificationCenterList(@RequestBody NotificationCenterRequestDTO notificationCenterRequestDTO, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);

        if(null == userId){
            return new ResponseResult(15);
        }

        LarkPageInfoVo<NotificationCenterResponseDTO> list = notificationCenterService.notificationCenterList(notificationCenterRequestDTO,userId);
        return new ResponseResult(list);

    }
    @ApiOperation(value = "通知中心修改读取信息")
    @RequestMapping(value = "/api/updateNotificationCenter", method = RequestMethod.POST)
    public ResponseResult updateNotificationCenter(@RequestBody NotificationCenterRequestDTO notificationCenterRequestDTO) throws Exception {

        Integer result = notificationCenterService.updateNotificationCenter(notificationCenterRequestDTO);

        if (0 == result) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }
}
