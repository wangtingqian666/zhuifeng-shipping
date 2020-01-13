package com.zhuifeng.shipping.service.impl;

import com.zhuifeng.shipping.mapper.MessageMapper;
import com.zhuifeng.shipping.pojo.MessagePojo;
import com.zhuifeng.shipping.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageImpl implements IMessageService {

    @Autowired
    MessageMapper messageMapper;

    /***
     * 保存留言信息
     * @param messagePojo
     * @return true :保存成功 false:保存失败
     */
    @Override
    public boolean saveMessage(MessagePojo messagePojo) {
        MessagePojo save = messageMapper.save(messagePojo);
        return null!=save;
    }
}
