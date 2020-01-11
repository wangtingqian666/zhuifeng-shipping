package com.zhuifeng.shipping.service;

import com.zhuifeng.shipping.pojo.MessagePojo;

public interface IMssageService {//留言板
    //保存留言信息  并查看是否保存成功
    public boolean saveMessage(MessagePojo messagePojo);
}
