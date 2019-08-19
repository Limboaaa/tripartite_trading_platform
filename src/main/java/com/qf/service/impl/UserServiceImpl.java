package com.qf.service.impl;


import com.qf.common.ServerResponse;
import com.qf.dao.UserMapper;
import com.qf.pojo.User;
import com.qf.service.IUserService;
import com.qf.tooklit.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author GuiYuan Zhang
 * @date 2019/8/19
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private  UserMapper userMapper;

    public ServerResponse<User> login(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if(resultCount == 0 ){
            return ServerResponse.createByErrorMessage("用户名不存在");
    }
        String md5password = MD5.encodePassword(password);
        User user = userMapper.selectLogin(username, md5password);
        if (user==null){
            return ServerResponse.createByErrorMessage("密码错误");
        }else{
            user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
            return ServerResponse.createBySuccess("登录成功",user);
        }
    }

        public ServerResponse<String> register(User user) {

        return null;
    }

    public ServerResponse<String> checkValid(String str, String type) {
        return null;
    }

    public ServerResponse selectQuestion(String username) {
        return null;
    }

    public ServerResponse<String> checkAnswer(String username, String question, String answer) {
        return null;
    }

    public ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken) {
        return null;
    }

    public ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user) {
        return null;
    }

    public ServerResponse<User> updateInformation(User user) {
        return null;
    }

    public ServerResponse<User> getInformation(Integer userId) {
        return null;
    }

    public ServerResponse checkAdminRole(User user) {
        return null;
    }
}
