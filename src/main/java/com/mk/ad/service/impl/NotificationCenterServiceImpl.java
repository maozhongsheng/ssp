package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.service.NotificationCenterService;
import com.mk.ad.mapper.NotificationCenterMapper;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.NotificationCenter;
import com.mk.ad.vo.NotificationCenterExample;
import com.mk.ad.vo.Request.NotificationCenterRequestDTO;
import com.mk.ad.vo.Response.NotificationCenterResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


/**
 * 账户
 *
 * @author mzs
 * @version 1.1
 * @date 2021/6/29 14:14
 */
@Slf4j
@Service
@Repository
public class NotificationCenterServiceImpl implements NotificationCenterService {
    @Autowired
    private NotificationCenterMapper NotificationCenterMapper;


    @Override
    public LarkPageInfoVo<NotificationCenterResponseDTO> notificationCenterList(NotificationCenterRequestDTO notificationCenterRequestDTO, String userId) {

        NotificationCenterExample example = new NotificationCenterExample();
        NotificationCenterExample.Criteria criteria = example.createCriteria();

        if(StringUtils.isNotBlank(notificationCenterRequestDTO.getStatus())){
            criteria.andStatusEqualTo(Integer.valueOf(notificationCenterRequestDTO.getStatus()));
        }
        if(StringUtils.isNotBlank(notificationCenterRequestDTO.getType())){
            criteria.andTypeEqualTo(Integer.valueOf(notificationCenterRequestDTO.getType()));
        }
        List lis = new ArrayList();
        lis.add(userId);lis.add(1);
        criteria.andUser_idIn(lis);
        criteria.andIs_deleteEqualTo(0);
        example.setOrderByClause("top,create_time DESC");
        PageHelper.startPage(notificationCenterRequestDTO.getPage(), notificationCenterRequestDTO.getLimit());
        List<NotificationCenter> sspNotificationCenters = NotificationCenterMapper.selectByExample(example);
        PageInfo<NotificationCenter> pageInfo = new PageInfo<>(sspNotificationCenters);
        List<NotificationCenterResponseDTO> list = sspNotificationCenters.stream().map(msg -> {
            NotificationCenterResponseDTO event = new NotificationCenterResponseDTO();
            event.setId(msg.getId());
            event.setNotification_title(msg.getNotification_title());
            event.setNotice_text(msg.getNotice_text());
            event.setStatus(msg.getStatus());
            event.setTop(msg.getTop());
            event.setType(msg.getType());
            SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
            event.setCreate_time(dd.format(msg.getCreate_time()));
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<NotificationCenterResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), notificationCenterRequestDTO.getLimit(), notificationCenterRequestDTO.getPage());
    }

    @Override
    public Integer updateNotificationCenter(NotificationCenterRequestDTO notificationCenterRequestDTO) {
        NotificationCenter sspNotificationCenter = new NotificationCenter();
        sspNotificationCenter.setId(notificationCenterRequestDTO.getId());
        sspNotificationCenter.setStatus(1);
        return NotificationCenterMapper.updateByPrimaryKeySelective(sspNotificationCenter);
    }
}


