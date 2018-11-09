package com.huawei.it.m6.controller;/*
 * @author 片尾solo
 * @Date  2018/11/8  11:55
 */

import com.huawei.it.m6.service.IUserSevice;
import com.huawei.it.m6.vo.SesameResponse;
import com.huawei.it.m6.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private IUserSevice userService;

    @RequestMapping(value = "/get/{name}",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public SesameResponse get(@PathVariable("name") String name){
        logger.debug("enter the test method！"+name);
        UserVO vo = userService.getUserByName(name);
        return new SesameResponse("200",true,vo,null);
    }

    @RequestMapping(value = "/save",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public SesameResponse save(UserVO userVO){
        logger.debug("enter the test method！"+userVO.toString());
        return new SesameResponse(null,userService.save(userVO),null,null);
    }

}
