package com.zhuifeng.shipping.service.impl;

import com.zhuifeng.shipping.mapper.UserMapper;
import com.zhuifeng.shipping.pojo.UserPojo;
import com.zhuifeng.shipping.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;
    //登录
    @Override
    public UserPojo login(UserPojo userPojo) {
        return userMapper.login(userPojo);
    }

    //注册
    @Override
    public void userRegister(UserPojo userPojo) {
        userMapper.userRegister(userPojo);
    }

}
