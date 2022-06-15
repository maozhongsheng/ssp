package com.mk.ad.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.mapper.SspAdSlotMapper;
import com.mk.ad.mapper.mymappper.MyDataMediaTypeMapper;
import com.mk.ad.service.SspMediaService;
import com.mk.ad.mapper.SspMediaMapper;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.MediaNameReuestDTO;
import com.mk.ad.vo.Request.SspMediaRequestDTO;
import com.mk.ad.vo.Response.MediaNameResponseDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.Response.SspMediaResponseDTO;
import com.mk.ad.vo.SspAdSlot;
import com.mk.ad.vo.SspMedia;
import com.mk.ad.vo.SspMediaExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 媒体
 *
 * @author yjn
 * @version 1.0
 * @date 2021/1/13 13:22
 */
@Slf4j
@Service
@Repository
public class SspMediaServiceImpl implements SspMediaService {

    @Autowired
    SspMediaMapper sspMediaMapper;

    @Autowired
    SspAdSlotMapper sspAdSlotMapper;

    @Autowired
    MyDataMediaTypeMapper myDataMediaTypeMapper;

    @Override
    public LarkPageInfoVo<SspMediaResponseDTO> getMediaList(SspMediaRequestDTO sspMediaRequestDTO, String userId) {
        SspMediaExample example = new SspMediaExample();
        SspMediaExample.Criteria criteria = example.createCriteria();

        //媒体id查询
        if(sspMediaRequestDTO.getId() != null){
            criteria.andIdEqualTo(sspMediaRequestDTO.getId());
        }

        //媒体名称查询
        if(StringUtils.isNotBlank(sspMediaRequestDTO.getMedia_name())){
            criteria.andMedia_nameLike("%"+sspMediaRequestDTO.getMedia_name()+"%");
        }

        //媒体平台查询
        if(sspMediaRequestDTO.getP_type() == null){
            sspMediaRequestDTO.setP_type(null);
        }else if(sspMediaRequestDTO.getP_type().size()==0){
            sspMediaRequestDTO.setP_type(null);
        }else if(sspMediaRequestDTO.getP_type() != null){
            criteria.andPlatform_typeIn(sspMediaRequestDTO.getP_type());
        }

        //媒体状态
        if(sspMediaRequestDTO.getM_status() == null){
            sspMediaRequestDTO.setM_status(null);
        }else if(sspMediaRequestDTO.getM_status().size()==0){
            sspMediaRequestDTO.setM_status(null);
        }else if(sspMediaRequestDTO.getM_status() != null){
            criteria.andMedia_examine_statusIn(sspMediaRequestDTO.getM_status());
        }


        //媒体行业查询
        if(sspMediaRequestDTO.getM_category() == null){
            sspMediaRequestDTO.setM_category(null);
        }else if(sspMediaRequestDTO.getM_category().size()==0){
            sspMediaRequestDTO.setM_category(null);
        }else if(sspMediaRequestDTO.getM_category() != null){
            criteria.andMedia_category_idIn(sspMediaRequestDTO.getM_category());
        }

        //媒体行业查询
        if(sspMediaRequestDTO.getM_type() == null){
            sspMediaRequestDTO.setM_type(null);
        }else if(sspMediaRequestDTO.getM_type().size()==0){
            sspMediaRequestDTO.setM_type(null);
        }else if(sspMediaRequestDTO.getM_type() != null){
            criteria.andMedia_type_idIn(sspMediaRequestDTO.getM_type());
        }


        if(sspMediaRequestDTO.getCooperationStatus() != null){
            criteria.andCooperation_statusEqualTo(sspMediaRequestDTO.getCooperationStatus());
        }

        if(sspMediaRequestDTO.getMediaTypeId() != null){
            criteria.andMedia_type_idEqualTo(sspMediaRequestDTO.getMediaTypeId());
        }
       Integer system =  sspMediaMapper.selectsys(userId);
        if(0 != system){
            criteria.andUser_idEqualTo(userId);
        }


        example.setOrderByClause("id DESC");

       // criteria.andMedia_examine_statusEqualTo(2);

        PageHelper.startPage(sspMediaRequestDTO.getPage(), sspMediaRequestDTO.getLimit());
        List<SspMedia> sspMediaList = sspMediaMapper.selectByExample(example);
        PageInfo<SspMedia> pageInfo = new PageInfo<>(sspMediaList);
        List<SspMediaResponseDTO> list = sspMediaList.stream().map(msg -> {
            SspMediaResponseDTO event = new SspMediaResponseDTO();
            event.setId(msg.getId());
            event.setPlatform_type(msg.getPlatform_type());
            event.setStore_id(msg.getStore_id());
            event.setDetail_url(msg.getDetail_url());
            event.setMedia_name(msg.getMedia_name());
            event.setMedia_type_id(msg.getMedia_type_id());
            event.setMedia_category_id(msg.getMedia_category_id());
            event.setKeywords(msg.getKeywords());
            event.setMedia_desc(msg.getMedia_desc());
            event.setPackage_name(msg.getPackage_name());
            event.setRelation_type(msg.getRelation_type());
            event.setRegister_certificate(msg.getRegister_certificate());
            event.setMandate_certificate(msg.getMandate_certificate());
            event.setCooperation_status(msg.getCooperation_status());
            event.setWeb_domain(msg.getWeb_domain());
            event.setWeb_record(msg.getWeb_record());
            event.setMedia_examine_status(msg.getMedia_examine_status());
            event.setRecord_url(msg.getRecord_url());
            event.setCreate_time(msg.getCreate_time());
            event.setUpdate_time(msg.getUpdate_time());
            event.setIs_deleted(msg.getIs_deleted());
            event.setMedia_type_name(myDataMediaTypeMapper.selectMediaById(msg.getMedia_type_id()));
            event.setUser_id(msg.getUser_id());
            event.setSha_data(msg.getSha_data());
            event.setStart_date(msg.getStart_date());
            event.setEnd_date(msg.getEnd_date());
            event.setUa_examples(msg.getUa_examples());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<SspMediaResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), sspMediaRequestDTO.getLimit(), sspMediaRequestDTO.getPage());
    }

    @Override
    public SspMediaResponseDTO getMediatInfo(Long id) {
        SspMedia sspMedia = sspMediaMapper.selectByPrimaryKey(id);
        SspMediaResponseDTO smr = new SspMediaResponseDTO();
        smr.setId(sspMedia.getId());
        smr.setPlatform_type(sspMedia.getPlatform_type());
        smr.setStore_id(sspMedia.getStore_id());
        smr.setDetail_url(sspMedia.getDetail_url());
        smr.setMedia_name(sspMedia.getMedia_name());
        smr.setMedia_type_id(sspMedia.getMedia_type_id());
        smr.setMedia_category_id(sspMedia.getMedia_category_id());
        smr.setKeywords(sspMedia.getKeywords());
        smr.setMedia_desc(sspMedia.getMedia_desc());
        smr.setPackage_name(sspMedia.getPackage_name());
        smr.setRelation_type(sspMedia.getRelation_type());
        smr.setRegister_certificate(sspMedia.getRegister_certificate());
        smr.setMandate_certificate(sspMedia.getMandate_certificate());
        smr.setCooperation_status(sspMedia.getCooperation_status());
        smr.setWeb_domain(sspMedia.getWeb_domain());
        smr.setWeb_record(sspMedia.getWeb_record());
        smr.setMedia_examine_status(sspMedia.getMedia_examine_status());
        smr.setRecord_url(sspMedia.getRecord_url());
        smr.setIs_deleted(sspMedia.getIs_deleted());
        smr.setMedia_type_name(myDataMediaTypeMapper.selectMediaById(sspMedia.getMedia_type_id()));
        List<SspAdSlot> list = sspAdSlotMapper.selectMediaId(Long.parseLong(sspMedia.getId().toString()));
        smr.setList(list);
        smr.setUser_id(sspMedia.getUser_id());
        smr.setSha_data(sspMedia.getSha_data());
        smr.setStart_date(sspMedia.getStart_date());
        smr.setEnd_date(sspMedia.getEnd_date());
        smr.setUa_examples(sspMedia.getUa_examples());
        return smr;
    }

    @Override
    public Integer insertMediat(SspMedia sspMedia,String userId) {
        sspMedia.setMedia_examine_status(0);
        sspMedia.setUser_id(userId);
        sspMedia.setCreate_time(new Date());
        return sspMediaMapper.insert(sspMedia);
    }

    @Override
    public Integer UpdateMediat(SspMedia sspMedia) {
        return sspMediaMapper.updateByPrimaryKeySelective(sspMedia);
    }

    @Override
    public LarkPageInfoVo<SspMediaResponseDTO> getMediaAdoptList(SspMediaRequestDTO sspMediaRequestDTO, String userId) {
        SspMediaExample example = new SspMediaExample();
        SspMediaExample.Criteria criteria = example.createCriteria();

        if(sspMediaRequestDTO.getId() != null){
            criteria.andIdEqualTo(sspMediaRequestDTO.getId());
        }

        //一级分类-精确查找
        if(StringUtils.isNotBlank(sspMediaRequestDTO.getMedia_name())){
            criteria.andMedia_nameLike("%"+sspMediaRequestDTO.getMedia_name()+"%");
        }

        if(sspMediaRequestDTO.getPlatformType() != null){
            criteria.andPlatform_typeEqualTo(sspMediaRequestDTO.getPlatformType());
        }

        if(sspMediaRequestDTO.getCooperationStatus() != null){
            criteria.andCooperation_statusEqualTo(sspMediaRequestDTO.getCooperationStatus());
        }

        if(sspMediaRequestDTO.getMediaTypeId() != null){
            criteria.andMedia_type_idEqualTo(sspMediaRequestDTO.getMediaTypeId());
        }

        criteria.andUser_idEqualTo(userId);

        criteria.andMedia_examine_statusEqualTo(1);

        example.setOrderByClause("id DESC");

        PageHelper.startPage(sspMediaRequestDTO.getPage(), sspMediaRequestDTO.getLimit());
        List<SspMedia> sspMediaList = sspMediaMapper.selectByExample(example);
        PageInfo<SspMedia> pageInfo = new PageInfo<>(sspMediaList);
        List<SspMediaResponseDTO> list = sspMediaList.stream().map(msg -> {
            SspMediaResponseDTO event = new SspMediaResponseDTO();
            event.setId(msg.getId());
            event.setPlatform_type(msg.getPlatform_type());
            event.setStore_id(msg.getStore_id());
            event.setDetail_url(msg.getDetail_url());
            event.setMedia_name(msg.getMedia_name());
            event.setMedia_type_id(msg.getMedia_type_id());
            event.setMedia_category_id(msg.getMedia_category_id());
            event.setKeywords(msg.getKeywords());
            event.setMedia_desc(msg.getMedia_desc());
            event.setPackage_name(msg.getPackage_name());
            event.setRelation_type(msg.getRelation_type());
            event.setRegister_certificate(msg.getRegister_certificate());
            event.setMandate_certificate(msg.getMandate_certificate());
            event.setCooperation_status(msg.getCooperation_status());
            event.setWeb_domain(msg.getWeb_domain());
            event.setWeb_record(msg.getWeb_record());
            event.setMedia_examine_status(msg.getMedia_examine_status());
            event.setRecord_url(msg.getRecord_url());
            event.setCreate_time(msg.getCreate_time());
            event.setUpdate_time(msg.getUpdate_time());
            event.setIs_deleted(msg.getIs_deleted());
            event.setMedia_type_name(myDataMediaTypeMapper.selectMediaById(msg.getMedia_type_id()));
            event.setUser_id(msg.getUser_id());
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<SspMediaResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), sspMediaRequestDTO.getLimit(), sspMediaRequestDTO.getPage());
    }

    @Override
    public List<MediaNameResponseDTO> mediaNameList(MediaNameReuestDTO mediaNameReuestDTO) {

        List<MediaNameResponseDTO> list = new ArrayList<>();
        List<SspMedia> sspMedia = sspMediaMapper.mediaNameList(mediaNameReuestDTO);
        for (SspMedia ssp : sspMedia) {
            MediaNameResponseDTO smr = new MediaNameResponseDTO();
            smr.setMedia_name(ssp.getMedia_name());
            list.add(smr);
        }

        return list;
    }

    @Override
    public String mediaByTagid(String tagid) {
      String media =   sspMediaMapper.mediaByTagid(tagid);
        return media;
    }


}


