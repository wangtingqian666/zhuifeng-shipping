package com.zhuifeng.shipping.mapper;

import com.zhuifeng.shipping.pojo.AddressPojo;
import com.zhuifeng.shipping.pojo.UserPojo;

import java.util.List;


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
    public void userRegister(UserPojo userPojo);

    /**
     * 根据用户id保存收货地址
     * @param addressPojo
     * @return true :保存成功 false:保存失败
     */
    public boolean insertAddByuid(AddressPojo addressPojo);

    /**
     *根据用户id查询他的所有收货地址
     * @param uid
     * @return
     */
    public List<AddressPojo> queryaddress(int uid);
}