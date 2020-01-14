package com.zhuifeng.shipping.utils;

public class StringNull {//判断是否为空

    public static boolean isEmpty(String str){
        str=str.trim();
        return null!=str||"".equals(str);
    }
}
