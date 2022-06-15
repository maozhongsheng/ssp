package com.mk.ad.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mk.ad.service.ShieldingRulesService;
import com.mk.ad.mapper.SspShieldingRulesMapper;

import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.ShieldingRulesRequestDTO;
import com.mk.ad.vo.Response.PageImpl;
import com.mk.ad.vo.Response.ShieldingRulesResponseDTO;
import com.mk.ad.vo.SspShieldingRules;
import com.mk.ad.vo.SspShieldingRulesExample;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


/**
 * 屏蔽规则
 *
 * @author mzs
 * @version 1.1
 * @date 2021/6/29 14:14
 */
@Slf4j
@Service
@Repository
public class ShieldingRulesServiceImpl implements ShieldingRulesService {
    @Autowired
    private SspShieldingRulesMapper sspShieldingRulesMapper;

    @Override
    public LarkPageInfoVo<ShieldingRulesResponseDTO> shieldingRulesList(ShieldingRulesRequestDTO shieldingRulesRequestDTO, String userId) {

        SspShieldingRulesExample example = new SspShieldingRulesExample();
        SspShieldingRulesExample.Criteria criteria = example.createCriteria();

        if(StringUtils.isNotBlank(shieldingRulesRequestDTO.getName())){
            criteria.andNameLike("%"+shieldingRulesRequestDTO.getName()+"%");
        }
        criteria.andIs_deleteEqualTo(0);
        criteria.andUser_idEqualTo(userId);
        example.setOrderByClause("create_time DESC");
        PageHelper.startPage(shieldingRulesRequestDTO.getPage(), shieldingRulesRequestDTO.getLimit());
        List<SspShieldingRules> sspShieldingRules = sspShieldingRulesMapper.selectByExample(example);
        PageInfo<SspShieldingRules> pageInfo = new PageInfo<>(sspShieldingRules);
        List<ShieldingRulesResponseDTO> list = sspShieldingRules.stream().map(msg -> {
            ShieldingRulesResponseDTO event = new ShieldingRulesResponseDTO();
            event.setId(msg.getId());
            SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式

            event.setCreateTime(dd.format(msg.getCreate_time()));
            event.setName(msg.getName());
            String n1 = "";
            String n2 = "";
            String n3 = "";
            if(StringUtils.isNotBlank(msg.getClassification())){
                n1 = "行业";
            }
            if(StringUtils.isNotBlank(msg.getKey_word())){
                n2 = "关键词";
            }
            if(StringUtils.isNotBlank(msg.getIos_package())||StringUtils.isNotBlank(msg.getAndroid_package())){
                n3 = "包名";
            }
            if("".equals(n1) && "".equals(n2) && "".equals(n3)){
                event.setShielding_dimension(null);
            }
            if(!"".equals(n1) && "".equals(n2) && "".equals(n3) ){
                event.setShielding_dimension(n1);
            }
            if(!"".equals(n1) && !"".equals(n2) && "".equals(n3) ){
                event.setShielding_dimension(n1 + "," + n2);
            }
            if(!"".equals(n1) && !"".equals(n2) && !"".equals(n3)){
                event.setShielding_dimension(n1 + "," + n2 + "," + n3);
            }
            if(!"".equals(n1) && "".equals(n2) && !"".equals(n3)){
                event.setShielding_dimension(n1 + "," + n3);
            }
            if("".equals(n1) && !"".equals(n2) && !"".equals(n3)){
                event.setShielding_dimension(n2 + "," + n3);
            }
            if("".equals(n1) && "".equals(n2) && !"".equals(n3)){
                event.setShielding_dimension(n3);
            }
            if("".equals(n1) && !"".equals(n2) && "".equals(n3)){
                event.setShielding_dimension(n2);
            }
            if(StringUtils.isNotEmpty(msg.getRelated_media())){
                String[] split  = msg.getRelated_media().split(",");
                String[] split1 = msg.getRelated_advertising().split(",");
                event.setRelated_advertising(split.length+"个媒体"+"-"+split1.length+"广告位");
            }else{
                event.setRelated_advertising(0+"个媒体"+"-"+0+"广告位");
            }
            return event;
        }).collect(Collectors.toList());
        return new PageImpl<ShieldingRulesResponseDTO>().pageZset(list, (int) pageInfo.getTotal(), shieldingRulesRequestDTO.getLimit(), shieldingRulesRequestDTO.getPage());
    }

    @Override
    public Integer deleteShielding(ShieldingRulesRequestDTO shieldingRulesRequestDTO) {
        Integer result = sspShieldingRulesMapper.deleteShielding(shieldingRulesRequestDTO.getId());
        return result;
    }

    @Override
    public Integer insertShieldingRules(ShieldingRulesRequestDTO shieldingRulesRequestDTO, String userId) {
        SspShieldingRules sspShieldingRules = new SspShieldingRules();
        sspShieldingRules.setCreate_time(new Date());
        sspShieldingRules.setUser_id(userId);
        sspShieldingRules.setName(shieldingRulesRequestDTO.getName());
        sspShieldingRules.setClassification(shieldingRulesRequestDTO.getClassification());
        sspShieldingRules.setKey_word(shieldingRulesRequestDTO.getKey_word());
        sspShieldingRules.setIos_package(shieldingRulesRequestDTO.getIos_package());
        sspShieldingRules.setAndroid_package(shieldingRulesRequestDTO.getAndroid_package());
        sspShieldingRules.setRelated_media(shieldingRulesRequestDTO.getRelated_media());
        sspShieldingRules.setRelated_advertising(shieldingRulesRequestDTO.getRelated_advertising());
        sspShieldingRules.setIs_delete(0);
        Integer result = sspShieldingRulesMapper.insertSelective(sspShieldingRules);
        return result;
    }

    @Override
    public Integer shieldingRulesName(ShieldingRulesRequestDTO shieldingRulesRequestDTO) {
        List name =  sspShieldingRulesMapper.selectName();
        Integer result = 0;
        if(name.contains(shieldingRulesRequestDTO.getName())){
            result = 2;
        }else{
            result = 1 ;
        }
        return result;
    }

    @Override
    public Integer updateShieldingRules(ShieldingRulesRequestDTO shieldingRulesRequestDTO) {
        SspShieldingRules sspShieldingRules = new SspShieldingRules();
        sspShieldingRules.setId(shieldingRulesRequestDTO.getId());
        sspShieldingRules.setName(shieldingRulesRequestDTO.getName());
        sspShieldingRules.setClassification(shieldingRulesRequestDTO.getClassification());
        sspShieldingRules.setKey_word(shieldingRulesRequestDTO.getKey_word());
        sspShieldingRules.setIos_package(shieldingRulesRequestDTO.getIos_package());
        sspShieldingRules.setAndroid_package(shieldingRulesRequestDTO.getAndroid_package());
        sspShieldingRules.setRelated_media(shieldingRulesRequestDTO.getRelated_media());
        sspShieldingRules.setRelated_advertising(shieldingRulesRequestDTO.getRelated_advertising());
        return  sspShieldingRulesMapper.updateByPrimaryKeySelective(sspShieldingRules);
    }

    @Override
    public ShieldingRulesResponseDTO shieldingRulesById(ShieldingRulesRequestDTO shieldingRulesRequestDTO) {
        SspShieldingRules sspShieldingRules = sspShieldingRulesMapper.selectByPrimaryKey(shieldingRulesRequestDTO.getId());
        ShieldingRulesResponseDTO shieldingRulesResponseDTO = new ShieldingRulesResponseDTO();
        shieldingRulesResponseDTO.setName(sspShieldingRules.getName());
        shieldingRulesResponseDTO.setClassification(sspShieldingRules.getClassification());
        shieldingRulesResponseDTO.setKey_word(sspShieldingRules.getKey_word());
        shieldingRulesResponseDTO.setIos_package(sspShieldingRules.getIos_package());
        shieldingRulesResponseDTO.setAndroid_package(sspShieldingRules.getAndroid_package());
        shieldingRulesResponseDTO.setRelated_media(sspShieldingRules.getRelated_media());
        shieldingRulesResponseDTO.setRelated_advertising(sspShieldingRules.getRelated_advertising());
        return shieldingRulesResponseDTO;
    }

    @Override
    public List<Map> shieldingRulesMedia(ShieldingRulesRequestDTO shieldingRulesRequestDTO,String userId) {
        Map pream = new HashMap();
        pream.put("id",userId);
        if(StringUtils.isNotBlank(shieldingRulesRequestDTO.getName())){
            pream.put("name",shieldingRulesRequestDTO.getName());
        }else{
            pream.put("name",null);
        }
        List<Map> result = sspShieldingRulesMapper.selectMedia(pream);

        return result;

    }

    @Override
    public List<Map> shieldingRulesSlot(ShieldingRulesRequestDTO shieldingRulesRequestDTO, String userId) {
        List<Map> result = new ArrayList();
        Map pream = new HashMap();
        if(StringUtils.isEmpty(shieldingRulesRequestDTO.getName())&& null == shieldingRulesRequestDTO.getId()){
            pream.put("user_id",userId);
            result = sspShieldingRulesMapper.selectAll(pream);
        }
        if(StringUtils.isNotBlank(shieldingRulesRequestDTO.getName())){
            pream.put("user_id",userId);
            pream.put("name",shieldingRulesRequestDTO.getName());
            result = sspShieldingRulesMapper.selectSlotAll(pream);
        }else if (null != shieldingRulesRequestDTO.getId()){
            pream.put("user_id",userId);
            pream.put("id",shieldingRulesRequestDTO.getId());
            result = sspShieldingRulesMapper.selectSlot(pream);
        }
        return result;
    }

    @Override
    public Integer shieldingRulesRepeat(ShieldingRulesRequestDTO shieldingRulesRequestDTO) {
        String related_advertising = shieldingRulesRequestDTO.getRelated_advertising();
        String[] sourceArray = related_advertising.split(",");
        for (int i = 0 ;i<sourceArray.length; i++) {
            Integer m =  sspShieldingRulesMapper.selectRepeat(sourceArray[i]);
            if(0 < m){
                return 2;
            }
        }

        return 1;
    }

    @Override
    public Integer insertSlotShieldingRules(ShieldingRulesRequestDTO shieldingRulesRequestDTO, String userId) {

        SspShieldingRules sspShieldingRules = new SspShieldingRules();
        sspShieldingRules.setCreate_time(new Date());
        sspShieldingRules.setUser_id(userId);
        sspShieldingRules.setName(shieldingRulesRequestDTO.getName());
        sspShieldingRules.setClassification(shieldingRulesRequestDTO.getClassification());
        sspShieldingRules.setKey_word(shieldingRulesRequestDTO.getKey_word());
        sspShieldingRules.setIos_package(shieldingRulesRequestDTO.getIos_package());
        sspShieldingRules.setAndroid_package(shieldingRulesRequestDTO.getAndroid_package());
        sspShieldingRules.setRelated_media(shieldingRulesRequestDTO.getRelated_media());
        sspShieldingRules.setRelated_advertising(shieldingRulesRequestDTO.getRelated_advertising());
        sspShieldingRules.setIs_delete(0);
        Integer result = sspShieldingRulesMapper.insertSelective(sspShieldingRules);
        if(0 == result){
            return  0;
        }
        Integer id = sspShieldingRulesMapper.selectId();
        return id;
    }
}


