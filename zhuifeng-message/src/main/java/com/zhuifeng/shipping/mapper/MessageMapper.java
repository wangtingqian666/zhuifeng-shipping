package com.zhuifeng.shipping.mapper;

import com.zhuifeng.shipping.pojo.MessagePojo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageMapper extends JpaRepository<MessagePojo,Integer> {

}
