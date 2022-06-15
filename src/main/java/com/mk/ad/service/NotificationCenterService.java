package com.mk.ad.service;

import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.NotificationCenterRequestDTO;
import com.mk.ad.vo.Response.NotificationCenterResponseDTO;

/**
 * 账户
 *
 * @author mzs
 * @version 1.1
 * @date 2021/6/29 14:14
 */
public interface NotificationCenterService {


    LarkPageInfoVo<NotificationCenterResponseDTO> notificationCenterList(NotificationCenterRequestDTO notificationCenterRequestDTO, String userId);

    Integer updateNotificationCenter(NotificationCenterRequestDTO notificationCenterRequestDTO);
}
