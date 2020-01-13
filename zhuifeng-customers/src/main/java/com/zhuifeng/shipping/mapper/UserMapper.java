package com.zhuifeng.shipping.mapper;

import com.zhuifeng.shipping.pojo.UserPojo;

public interface UserMapper {

    /**
     * 验证登录
     * @param userPojo
     * @return
     */
    public UserPojo login(UserPojo userPojo);

    /**
     * 注册
     * @param userPojo
     */
    public void UserRegister(UserPojo userPojo);
}
