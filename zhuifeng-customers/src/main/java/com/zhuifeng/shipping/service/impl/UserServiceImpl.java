package com.zhuifeng.shipping.service.impl;

import com.zhuifeng.shipping.mapper.UserMapper;
import com.zhuifeng.shipping.pojo.UserPojo;
import com.zhuifeng.shipping.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public UserPojo login(UserPojo userPojo) {
        return userMapper.login(userPojo);
    }
}
