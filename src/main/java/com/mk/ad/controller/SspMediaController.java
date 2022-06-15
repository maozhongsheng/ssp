package com.mk.ad.controller;

import com.mk.ad.service.SspMediaService;
import com.mk.ad.client.UserClient;
import com.mk.ad.utils.Constant;
import com.mk.ad.utils.LarkPageInfoVo;
import com.mk.ad.utils.ResponseStatus;
import com.mk.ad.vo.Request.MediaNameReuestDTO;
import com.mk.ad.vo.Request.SspMediaRequestDTO;
import com.mk.ad.vo.Response.MediaNameResponseDTO;
import com.mk.ad.vo.Response.ResponseResult;
import com.mk.ad.vo.Response.SspMediaResponseDTO;
import com.mk.ad.vo.SspMedia;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * TODO
 *
 * @author yjn
 * @version 1.0
 * @date 2021/1/13 13:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class SspMediaController {

    @Autowired
    public SspMediaService sspMediaService;

    @Autowired
    private UserClient userClient;


    @ApiOperation(value = "媒体列表查询")
    @RequestMapping(value = "/api/mediaList", method = RequestMethod.POST)
    public ResponseResult getMediaList(@RequestBody SspMediaRequestDTO sspMediaRequestDTO, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(userId == null){
            return new ResponseResult(15,"登录超时");
        }else {
            LarkPageInfoVo<SspMediaResponseDTO> list = sspMediaService.getMediaList(sspMediaRequestDTO,userId);
            return new ResponseResult(list);
        }//token过期时间

    }


    @ApiOperation(value = "广告位通过媒体列表查询")
    @RequestMapping(value = "/api/mediaAdoptList", method = RequestMethod.POST)
    public ResponseResult getMediaAdoptList(@RequestBody SspMediaRequestDTO sspMediaRequestDTO, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(userId == null){
            return new ResponseResult(15);
        }else {
            LarkPageInfoVo<SspMediaResponseDTO> list = sspMediaService.getMediaAdoptList(sspMediaRequestDTO, userId);
            return new ResponseResult(list);
        }
    }


    @ApiOperation(value = "媒体列表查询详情")
    @RequestMapping(value = "/api/mediaListId/{id}", method = RequestMethod.POST)
    public ResponseResult getMediatInfo(@PathVariable("id") Long id) throws Exception {
        SspMediaResponseDTO sspMediaResponseDTO = sspMediaService.getMediatInfo(id);
        return new ResponseResult(sspMediaResponseDTO);
    }


    @ApiOperation(value = "媒体列表新建添加")
    @RequestMapping(value = "/api/mediaAdd", method = RequestMethod.POST)
    public ResponseResult insertMediat(@RequestBody SspMedia sspMedia, HttpServletRequest request) throws Exception {
        String token = request.getHeader(Constant.ACCESS_TOKEN);
        String userId = userClient.getUserId(token);
        if(userId == null){
            return new ResponseResult(15,"登录超时");
        }else {
            Integer result = sspMediaService.insertMediat(sspMedia, userId);
            if (result == 0) {
                return new ResponseResult(ResponseStatus.SERVICE_ERROR);
            }
            return new ResponseResult();
        }
    }


    @ApiOperation(value = "媒体列表修改")
    @RequestMapping(value = "/api/mediaEdit", method = RequestMethod.POST)
    public ResponseResult UpdateMediat(@RequestBody SspMedia sspMedia) throws Exception {
        Integer result =sspMediaService.UpdateMediat(sspMedia);
        if (result == 0) {
            return new ResponseResult(ResponseStatus.SERVICE_ERROR);
        }
        return new ResponseResult();
    }


    @ApiOperation(value = "分成收益查询媒体名称")
    @RequestMapping(value = "/api/mediaNameList", method = RequestMethod.POST)
    public ResponseResult mediaNameList(@RequestBody MediaNameReuestDTO mediaNameReuestDTO) throws Exception {
        List<MediaNameResponseDTO> list = sspMediaService.mediaNameList(mediaNameReuestDTO);
        return new ResponseResult(list);
    }



    @ApiOperation(value = "根据广告位id查询媒体id")
    @RequestMapping(value = "/api/mediaByTagid", method = RequestMethod.POST)
    public String mediaByTagid(@RequestBody String Tagid) throws Exception {
       String media= sspMediaService.mediaByTagid(Tagid);
        return media;
    }




}
