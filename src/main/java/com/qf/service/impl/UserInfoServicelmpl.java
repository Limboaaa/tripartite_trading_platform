package com.qf.service.impl;

import com.qf.dao.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.tooklit.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServicelmpl implements UserInfoService{
    @Autowired
    UserInfoMapper userInfoMapper;

    public boolean registerUser(UserInfo userInfo) {
        String pwd = MD5.encodePassword(userInfo.getPassword());
        MD5.encodePassword(pwd);
        int register = userInfoMapper.registerUser(userInfo);
        return register>0;
    }
}
