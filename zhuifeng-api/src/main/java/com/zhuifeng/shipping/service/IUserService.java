package com.zhuifeng.shipping.service;

import com.zhuifeng.shipping.pojo.UserPojo;

public interface IUserService {

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
    public void userRegister(UserPojo userPojo);
}
