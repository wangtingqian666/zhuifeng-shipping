package com.zhuifeng.shipping.utils;

import java.util.UUID;

public class UuidUtils {
   public static String getUUid(){
       return UUID.randomUUID().toString().replace("-","");
   }
}
