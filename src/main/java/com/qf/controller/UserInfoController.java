package com.qf.controller;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserInfoController{
    @Autowired
    UserInfoService userInfoService;
    //注册
    @RequestMapping("registerController")
    public Object register(@RequestBody UserInfo userInfo) {
        System.out.println(userInfo);
        boolean registerUser = userInfoService.registerUser(userInfo);
        return registerUser;
    }
}
