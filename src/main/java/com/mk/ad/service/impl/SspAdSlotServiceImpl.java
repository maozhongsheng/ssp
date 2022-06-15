package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.SspAdSlotMapper;
import com.mk.ad.service.SspAdSlotService;
import com.mk.ad.mapper.SspMediaMapper;
import com.mk.ad.mapper.SspShieldingRulesMapper;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.SspAdSlotRequestDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.Response.SspAdSlotResponseDTO;
import com.mk.ad.vo.SspAdSlot;
import com.mk.ad.vo.SspAdSlotExample;
import com.mk.ad.vo.SspMedia;
import com.mk.ad.vo.SspShieldingRules;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 广告位
 *
 * @author gj
 * @version 1.0
 * @date 2021/1/21 14:12
 */
@Slf4j
@Service
@Repository
public class SspAdSlotServiceImpl implements SspAdSlotService {

    @Autowired
    SspAdSlotMapper sspAdSlotMapper;

    @Autowired
    SspMediaMapper sspMediaMapper;

    @Autowired
    SspShieldingRulesMapper sspShieldingRulesMapper;


    @Override
    public LarkPageInfoVo<SspAdSlotResponseDTO> getSlotList(SspAdSlotRequestDTO sspAdSlotRequestDTO, String userId) {
        SspAdSlotExample example = new SspAdSlotExample();
        SspAdSlotExample.Criteria criteria = example.createCriteria();

        //广告位ID
        if(sspAdSlotRequestDTO.getId() != null){
            criteria.andIdEqualTo(sspAdSlotRequestDTO.getId());
        }

        //广告位名称-模糊查询
        if(StringUtils.isNotBlank(sspAdSlotRequestDTO.getSlot_name())){
            criteria.andSlot_nameLike("%"+sspAdSlotRequestDTO.getSlot_name()+"%");
        }

        //广告位类型
        if(sspAdSlotRequestDTO.getS_type() == null){
            sspAdSlotRequestDTO.setS_type(null);
        }else if(sspAdSlotRequestDTO.getS_type().size()==0){
            sspAdSlotRequestDTO.setS_type(null);
        }else if(sspAdSlotRequestDTO.getS_type() != null){
            criteria.andSlot_type_idIn(sspAdSlotRequestDTO.getS_type());
        }

        //广告位状态
        if(sspAdSlotRequestDTO.getS_status() == null){
            sspAdSlotRequestDTO.setS_status(null);
        }else if(sspAdSlotRequestDTO.getS_status().size()==0){
            sspAdSlotRequestDTO.setS_status(null);
        }else if(sspAdSlotRequestDTO.getS_status() != null){
            criteria.andSlot_statusIn(sspAdSlotRequestDTO.getS_status());
        }

        //审核状态
        if(sspAdSlotRequestDTO.getS_examine_status() == null){
            sspAdSlotRequestDTO.setS_examine_status(null);
        }else if(sspAdSlotRequestDTO.getS_examine_status().size()==0){
            sspAdSlotRequestDTO.setS_examine_status(null);
        }else if(sspAdSlotRequestDTO.getS_examine_status() != null){
            criteria.andSlot_examine_statusIn(sspAdSlotRequestDTO.getS_examine_status());
        }

        //渲染方式
        if(sspAdSlotRequestDTO.getR_type() != null){
            criteria.andRender_typeIn(sspAdSlotRequestDTO.getR_type());
        }

        //所属媒体
        if(sspAdSlotRequestDTO.getM_id() == null){
            sspAdSlotRequestDTO.setM_id(null);
        }else if(sspAdSlotRequestDTO.getM_id().size()==0){
            sspAdSlotRequestDTO.setM_id(null);
        }else if(sspAdSlotRequestDTO.getM_id() != null){
            criteria.andMedia_idIn(sspAdSlotRequestDTO.getM_id());
        }

        Integer system =  sspMediaMapper.selectsys(userId);
        if(3 == system){
            criteria.andUser_idEqualTo(userId);
        }

        criteria.andIs_deletedEqualTo(1);

        example.setOrderByClause("id DESC");

        PageHelper.startPage(sspAdSlotRequestDTO.getPage(), sspAdSlotRequestDTO.getLimit());
        List<SspAdSlot> sspAdSlotList = sspAdSlotMapper.selectByExample(example);
        PageInfo<SspAdSlot> pageInfo = new PageInfo<>(sspAdSlotList);
        List<SspAdSlotResponseDTO> list = sspAdSlotList.stream().map(msg -> {
            SspAdSlotResponseDTO event = new SspAdSlotResponseDTO();
            event.setId(msg.getId());
            event.setMedia_id(msg.getMedia_id());
            event.setBussiness_type_one(msg.getBussiness_type_one());
            event.setSlot_type_id(msg.getSlot_type_id());
            event.setAd_template_id(msg.getAd_template_id());
            event.setAd_template_type(msg.getAd_template_type());
            event.setSlot_name(msg.getSlot_name());
            event.setSlot_status(msg.getSlot_status());
            event.setBusiness_status(msg.getBusiness_status());
            event.setCooperation_type(msg.getCooperation_type());
            event.setRender_type(msg.getRender_type());
            event.setWeb_linked(msg.getWeb_linked());
            event.setApplication_download(msg.getApplication_download());
            event.setAd_pull_mode(msg.getAd_pull_mode());
            event.setCp_price(msg.getCp_price());
            event.setSlot_examine_status(msg.getSlot_examine_status());
            event.setCreate_time(msg.getCreate_time());
            event.setUpdate_time(msg.getUpdate_time());
            event.setIs_deleted(msg.getIs_deleted());
            String ad_type_received = msg.getAd_type_received();
            List<String> strings = Arrays.asList(ad_type_received);
            event.setAd_type_received(strings);
            SspMedia sspMedia = sspMediaMapper.selectByPrimaryKey(Long.parseLong(msg.getMedia_id().toString()));
            if(sspMedia != null){
                event.setMediaName(sspMedia.getMedia_name());
                event.setPlatform_type(sspMedia.getPlatform_type());
            }
            event.setUser_id(msg.getUser_id());
            Map result = sspAdSlotMapper.selectssp(msg.getUser_id());
            if(null!=result){
                event.setSsp_id(Long.valueOf(result.get("sspId").toString()));
                event.setSsp_name(result.get("sspName").toString());
            }else{
                event.setSsp_id(Long.valueOf(1));
                event.setSsp_name("超级管理员");
            }
            event.setBlock_keywords(msg.getBlock_keywords());
            event.setBlock_android_app(msg.getBlock_android_app());
            event.setBlock_ios_app(msg.getBlock_ios_app());
            event.setBlock_industry(msg.getBlock_industry());
            event.setSpecific(msg.getSpecific());
            event.setAwarding(msg.getAwarding());
            event.setCallback_url(msg.getCallback_url());
            event.setSecret_key(msg.getSecret_key());
            event.setAd_template_custom(msg.getAd_template_custom());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<SspAdSlotResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), sspAdSlotRequestDTO.getLimit(), sspAdSlotRequestDTO.getPage());
    }

    @Override
    public SspAdSlotResponseDTO getSlotInfo(Long id) {
        SspAdSlot sspAdSlot = sspAdSlotMapper.selectByPrimaryKey(id);
        SspAdSlotResponseDTO sasr = new SspAdSlotResponseDTO();
        sasr.setId(sspAdSlot.getId());
        sasr.setMedia_id(sspAdSlot.getMedia_id());
        SspMedia sspMedia = sspMediaMapper.selectByPrimaryKey(Long.parseLong(sspAdSlot.getMedia_id().toString()));
        sasr.setMediaName(sspMedia.getMedia_name());
        sasr.setBussiness_type_one(sspMedia.getMedia_name());
        sasr.setSlot_type_id(sspAdSlot.getSlot_type_id());
        sasr.setAd_template_id(sspAdSlot.getAd_template_id());
        sasr.setAd_template_type(sspMedia.getMedia_name());
        sasr.setSlot_name(sspAdSlot.getSlot_name());
        sasr.setSlot_status(sspAdSlot.getSlot_status());
        sasr.setBusiness_status(sspMedia.getCooperation_status());
        sasr.setCooperation_type(sspAdSlot.getCooperation_type());
        sasr.setRender_type(sspAdSlot.getRender_type());
        sasr.setWeb_linked(sspMedia.getMedia_name());
        sasr.setApplication_download(sspMedia.getMedia_name());
        sasr.setAd_pull_mode(sspAdSlot.getAd_pull_mode());
        sasr.setCp_price(sspAdSlot.getCp_price());
        sasr.setRequet_rate(sspMedia.getMedia_name());
        sasr.setSlot_examine_status(sspAdSlot.getSlot_examine_status());
        sasr.setIs_deleted(sspAdSlot.getIs_deleted());
        String ad_type_received = sspAdSlot.getAd_type_received();
        List strings = Arrays.asList(ad_type_received);
        if(strings == null){
            strings.clear();
        }
        sasr.setAd_type_received(strings);
        sasr.setUser_id(sspAdSlot.getUser_id());
        sasr.setBlock_keywords(sspAdSlot.getBlock_keywords());
        sasr.setBlock_android_app(sspAdSlot.getBlock_android_app());
        sasr.setBlock_ios_app(sspAdSlot.getBlock_ios_app());
        sasr.setBlock_industry(sspAdSlot.getBlock_industry());
        sasr.setSpecific(sspAdSlot.getSpecific());
        sasr.setAwarding(sspAdSlot.getAwarding());
        sasr.setCallback_url(sspAdSlot.getCallback_url());
        sasr.setSecret_key(sspAdSlot.getSecret_key());
        sasr.setAd_template_custom(sspAdSlot.getAd_template_custom());
        sasr.setSettlement_way(sspMedia.getSettlement_type());
        sasr.setUpper_id(sspAdSlot.getUpper_id());
        sasr.setUpper_slot(sspAdSlot.getUpper_slot());
        sasr.setUpper_ecpm(sspAdSlot.getUpper_ecpm());
        sasr.setDownstream_ecpm(sspAdSlot.getDownstream_ecpm());
       return sasr;
    }

    @Override
    public Integer insertSlot(SspAdSlotRequestDTO sspAdSlot, String userId) {
        if(StringUtils.isEmpty(sspAdSlot.getSr_id())){
            SspAdSlot sspAd = new SspAdSlot();
            sspAd.setMedia_id(sspAdSlot.getMedia_id());
            sspAd.setBussiness_type_one(sspAdSlot.getBussiness_type_one());
            sspAd.setSlot_type_id(sspAdSlot.getSlot_type_id());
            sspAd.setAd_template_id(sspAdSlot.getAd_template_id());
            sspAd.setSlot_name(sspAdSlot.getSlot_name());
            sspAd.setAd_template_custom(sspAdSlot.getAd_template_custom());
            sspAd.setAd_template_type(sspAdSlot.getAd_template_type());
            sspAd.setRender_type(sspAdSlot.getRender_type());
            sspAd.setWeb_linked(sspAdSlot.getWeb_linked());
            sspAd.setApplication_download(sspAdSlot.getApplication_download());
            sspAd.setAd_pull_mode(sspAdSlot.getAd_pull_mode());
            sspAd.setBlock_keywords(sspAdSlot.getBlock_keywords());
            sspAd.setBlock_android_app(sspAdSlot.getBlock_android_app());
            sspAd.setBlock_ios_app(sspAdSlot.getBlock_ios_app());
            sspAd.setBlock_industry(sspAdSlot.getBlock_industry());
            sspAd.setSpecific(sspAdSlot.getSpecific());
            sspAd.setAwarding(sspAdSlot.getAwarding());
            sspAd.setCallback_url(sspAdSlot.getCallback_url());
            sspAd.setSecret_key(sspAdSlot.getSecret_key());
            List ad_type_received = sspAdSlot.getAd_type_received();
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i<ad_type_received.size() ; i++){
                if(i<ad_type_received.size()-1){
                    sb.append(ad_type_received.get(i) + ",");
                }else {
                    sb.append(ad_type_received.get(i));
                }
            }
            String bu = sb.toString();
            sspAd.setAd_type_received(bu);
            sspAd.setIs_deleted(1);
            sspAd.setSlot_status(1);
            sspAd.setUser_id(userId);
            sspAd.setSlot_examine_status(0);
            sspAd.setCreate_time(new Date());
            return sspAdSlotMapper.insertSelective(sspAd);
        }else {
            SspAdSlot sspAd = new SspAdSlot();
            sspAd.setMedia_id(sspAdSlot.getMedia_id());
            sspAd.setBussiness_type_one(sspAdSlot.getBussiness_type_one());
            sspAd.setSlot_type_id(sspAdSlot.getSlot_type_id());
            sspAd.setAd_template_id(sspAdSlot.getAd_template_id());
            sspAd.setSlot_name(sspAdSlot.getSlot_name());
            sspAd.setAd_template_custom(sspAdSlot.getAd_template_custom());
            sspAd.setAd_template_type(sspAdSlot.getAd_template_type());
            sspAd.setRender_type(sspAdSlot.getRender_type());
            sspAd.setWeb_linked(sspAdSlot.getWeb_linked());
            sspAd.setApplication_download(sspAdSlot.getApplication_download());
            sspAd.setAd_pull_mode(sspAdSlot.getAd_pull_mode());
            sspAd.setBlock_keywords(sspAdSlot.getBlock_keywords());
            sspAd.setBlock_android_app(sspAdSlot.getBlock_android_app());
            sspAd.setBlock_ios_app(sspAdSlot.getBlock_ios_app());
            sspAd.setBlock_industry(sspAdSlot.getBlock_industry());
            sspAd.setSpecific(sspAdSlot.getSpecific());
            sspAd.setAwarding(sspAdSlot.getAwarding());
            sspAd.setCallback_url(sspAdSlot.getCallback_url());
            sspAd.setSecret_key(sspAdSlot.getSecret_key());
            List ad_type_received = sspAdSlot.getAd_type_received();
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i<ad_type_received.size() ; i++){
                if(i<ad_type_received.size()-1){
                    sb.append(ad_type_received.get(i) + ",");
                }else {
                    sb.append(ad_type_received.get(i));
                }
            }
            String bu = sb.toString();
            sspAd.setAd_type_received(bu);
            sspAd.setIs_deleted(1);
            sspAd.setSlot_status(1);
            sspAd.setUser_id(userId);
            sspAd.setSlot_examine_status(0);
            sspAd.setCreate_time(new Date());
            sspAdSlotMapper.insertSelective(sspAd);


            Integer sid = sspAdSlotMapper.getslotId();
            SspShieldingRules sspShieldingRules = new SspShieldingRules();
            sspShieldingRules.setId(Integer.valueOf(sspAdSlot.getSr_id()));
            sspShieldingRules.setRelated_media(sspAdSlot.getMedia_id().toString());
            sspShieldingRules.setRelated_advertising(sid.toString());

            return sspShieldingRulesMapper.updateByPrimaryKeySelective(sspShieldingRules);
        }

    }

    @Override
    public Integer UpdatSlot(SspAdSlotRequestDTO sspAdSlot) {
        SspAdSlot sspAd = new SspAdSlot();
        sspAd.setId(sspAdSlot.getId());
        sspAd.setMedia_id(sspAdSlot.getMedia_id());
        sspAd.setBussiness_type_one(sspAdSlot.getBussiness_type_one());
        sspAd.setSlot_type_id(sspAdSlot.getSlot_type_id());
        sspAd.setAd_template_id(sspAdSlot.getAd_template_id());
        sspAd.setSlot_name(sspAdSlot.getSlot_name());
        sspAd.setAd_template_custom(sspAdSlot.getAd_template_custom());
        sspAd.setAd_type_received(sspAdSlot.getAd_template_type());
        sspAd.setRender_type(sspAdSlot.getRender_type());
        sspAd.setWeb_linked(sspAdSlot.getWeb_linked());
        sspAd.setApplication_download(sspAdSlot.getApplication_download());
        sspAd.setAd_pull_mode(sspAdSlot.getAd_pull_mode());
        sspAd.setBlock_keywords(sspAdSlot.getBlock_keywords());
        sspAd.setBlock_android_app(sspAdSlot.getBlock_android_app());
        sspAd.setBlock_ios_app(sspAdSlot.getBlock_ios_app());
        sspAd.setBlock_industry(sspAdSlot.getBlock_industry());
        sspAd.setSpecific(sspAdSlot.getSpecific());
        sspAd.setAwarding(sspAdSlot.getAwarding());
        sspAd.setCallback_url(sspAdSlot.getCallback_url());
        sspAd.setSecret_key(sspAdSlot.getSecret_key());
        List ad_type_received = sspAdSlot.getAd_type_received();
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i<ad_type_received.size() ; i++){
            if(i<ad_type_received.size()-1){
                sb.append(ad_type_received.get(i) + ",");
            }else {
                sb.append(ad_type_received.get(i));
            }
        }
        String bu = sb.toString();
        sspAd.setAd_type_received(bu);
        sspAd.setIs_deleted(1);
        sspAd.setSlot_status(0);
        return sspAdSlotMapper.updateByPrimaryKeySelective(sspAd);
    }

    @Override
    public Integer upDataSlotStatus(Long id, Integer slot_status) {
        return sspAdSlotMapper.upDataSlotStatus(id,slot_status);
    }

    @Override
    public int removeSlot(List<Long> list) {
        return sspAdSlotMapper.removeSlot(list);
    }




}
