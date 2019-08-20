package com.qf.controller;

import com.qf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tangjinsong
 * @Classname UserInfoController
 * @Description TODO
 * @Date 2019/8/20 15:27
 * @Created by tangjinsong
 */
@RequestMapping("userinfo")
@Controller
public class UserInfoController {

        //注册
    @RequestMapping("reg")
    @ResponseBody
    public Object reg(@RequestBody User user){


        System.out.println(user.getRole());
        return 0;
    }


    @RequestMapping("login")
    @ResponseBody
    public Object login(@RequestBody User user){


        System.out.println(user.getUsername()+user.getPassword());
        return 1;
    }
}
