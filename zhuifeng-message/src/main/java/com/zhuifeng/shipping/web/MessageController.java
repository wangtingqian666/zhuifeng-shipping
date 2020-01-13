package com.zhuifeng.shipping.web;

import com.zhuifeng.shipping.pojo.MessagePojo;
import com.zhuifeng.shipping.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    @Autowired
    IMessageService messageService;

    /***
     * 跳转至对应的页面
     * @return
     */
    @RequestMapping("message")
    public String message(){
        return "message";
    }

    /***
     * 保存留言信息
     * @param messagePojo
     * @return
     */
    @RequestMapping("savemessage")
    public String saveMessage(MessagePojo messagePojo){
        boolean flg = messageService.saveMessage(messagePojo);
        return "message";
    }
}