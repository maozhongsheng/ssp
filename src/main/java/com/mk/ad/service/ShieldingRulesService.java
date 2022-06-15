package com.mk.ad.service;

import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.vo.Request.ShieldingRulesRequestDTO;
import com.mk.ad.vo.Response.ShieldingRulesResponseDTO;

import java.util.List;
import java.util.Map;

/**
 * 账户
 *
 * @author mzs
 * @version 1.1
 * @date 2021/6/29 14:14
 */
public interface ShieldingRulesService {


    LarkPageInfoVo<ShieldingRulesResponseDTO> shieldingRulesList(ShieldingRulesRequestDTO shieldingRulesRequestDTO, String userId);

    Integer deleteShielding(ShieldingRulesRequestDTO shieldingRulesRequestDTO);

    Integer insertShieldingRules(ShieldingRulesRequestDTO shieldingRulesRequestDTO, String userId);

    Integer shieldingRulesName(ShieldingRulesRequestDTO shieldingRulesRequestDTO);

    Integer updateShieldingRules(ShieldingRulesRequestDTO shieldingRulesRequestDTO);

    ShieldingRulesResponseDTO shieldingRulesById(ShieldingRulesRequestDTO shieldingRulesRequestDTO);

    List<Map> shieldingRulesMedia(ShieldingRulesRequestDTO shieldingRulesRequestDTO,String userId);

    List<Map> shieldingRulesSlot(ShieldingRulesRequestDTO shieldingRulesRequestDTO, String userId);

    Integer shieldingRulesRepeat(ShieldingRulesRequestDTO shieldingRulesRequestDTO);

    Integer insertSlotShieldingRules(ShieldingRulesRequestDTO shieldingRulesRequestDTO, String userId);
}
