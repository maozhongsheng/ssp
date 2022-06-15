package com.mk.ad.controller;

import com.mk.ad.service.ShieldingRulesService;
import com.mk.ad.client.UserClient;
import com.mk.ad.utils.Constant;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.ResponseStatus;
import com.mk.ad.vo.Request.ShieldingRulesRequestDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.vo.Response.ShieldingRulesResponseDTO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


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
public class ShieldingRulesController {
    @Autowired
    private ShieldingRulesService shieldingRulesService;
    @Autowired
    private UserClient userClient;

    @ApiOperation(value = "屏蔽规则列表")
    @RequestMapping(value = "/api/shieldingRulesList", method = RequestMethod.POST)
    public ResponseResult AccountManagement(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(null == userId){
            return new ResponseResult(15);
        }
        LarkPageInfoVo<ShieldingRulesResponseDTO> list = shieldingRulesService.shieldingRulesList(shieldingRulesRequestDTO,userId);
        return new ResponseResult(list);

    }
    @ApiOperation(value = "屏蔽规则根据id删除")
    @RequestMapping(value = "/api/deleteShielding", method = RequestMethod.POST)
    public ResponseResult deleteShielding(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO) throws Exception {
        Integer result = shieldingRulesService.deleteShielding(shieldingRulesRequestDTO);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();

    }
    @ApiOperation(value = "屏蔽规则新增")
    @RequestMapping(value = "/api/addShieldingRules", method = RequestMethod.POST)
    public ResponseResult insertShieldingRules(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(null == userId){
            return new ResponseResult(15);
        }
        Integer result = shieldingRulesService.insertShieldingRules(shieldingRulesRequestDTO, userId);
        if (0 == result) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "屏蔽规则校验接口")
    @RequestMapping(value = "/api/shieldingRulesName", method = RequestMethod.POST)
    public ResponseResult shieldingRulesName(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO) throws Exception {

        Integer result = shieldingRulesService.shieldingRulesName(shieldingRulesRequestDTO);
        if (0 == result) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult(result);
    }
    @ApiOperation(value = "屏蔽规则编辑")
    @RequestMapping(value = "/api/updateShieldingRules", method = RequestMethod.POST)
    public ResponseResult updateShieldingRules(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO) throws Exception {
        Integer result = shieldingRulesService.updateShieldingRules(shieldingRulesRequestDTO);
        if (0 == result) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }

    @ApiOperation(value = "屏蔽规则查看详情")
    @RequestMapping(value = "/api/shieldingRulesById", method = RequestMethod.POST)
    public ResponseResult shieldingRulesById(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO) throws Exception {
        ShieldingRulesResponseDTO shieldingRulesResponseDTO = shieldingRulesService.shieldingRulesById(shieldingRulesRequestDTO);
        return new ResponseResult(shieldingRulesResponseDTO);
    }

    @ApiOperation(value = "屏蔽规则媒体下拉框")
    @RequestMapping(value = "/api/shieldingRulesMedia", method = RequestMethod.POST)
    public ResponseResult shieldingRulesMedia(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(null == userId){
            return new ResponseResult(15);
        }
        List<Map> list = shieldingRulesService.shieldingRulesMedia(shieldingRulesRequestDTO,userId);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "屏蔽规则广告位下拉框")
    @RequestMapping(value = "/api/shieldingRulesSlot", method = RequestMethod.POST)
    public ResponseResult shieldingRulesSlot(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(null == userId){
            return new ResponseResult(15);
        }
        List<Map> list = shieldingRulesService.shieldingRulesSlot(shieldingRulesRequestDTO,userId);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "广告位覆盖是否存在")
    @RequestMapping(value = "/api/shieldingRulesRepeat", method = RequestMethod.POST)
    public ResponseResult shieldingRulesRepeat(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO) throws Exception {
        Integer i = shieldingRulesService.shieldingRulesRepeat(shieldingRulesRequestDTO);
        return new ResponseResult(i);
    }

    @ApiOperation(value = "广告位中屏蔽规则新增")
    @RequestMapping(value = "/api/addSlotShieldingRules", method = RequestMethod.POST)
    public ResponseResult insertSlotShieldingRules(@RequestBody ShieldingRulesRequestDTO shieldingRulesRequestDTO, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(null == userId){
            return new ResponseResult(15);
        }
        Integer result = shieldingRulesService.insertSlotShieldingRules(shieldingRulesRequestDTO, userId);
        if (0 == result) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult(result);
    }
}
