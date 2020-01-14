package com.zhuifeng.shipping.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateConverter implements Converter<String, Date> {
    private SimpleDateFormat getSimpleDateFormat(String source) {
        SimpleDateFormat sdf = null;
        if (source.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
        } else if (source.matches("^\\d{4}/\\d{2}/\\d{2}$")) {
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        }else if(source.matches("^\\d{4}\\d{2}\\d{2}$")){
            sdf=new SimpleDateFormat("yyyyMMdd");
        }else {
            sdf=new SimpleDateFormat();
        }
        return sdf;
    }

    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf=getSimpleDateFormat(source);
        Date date=null;
        try {
            date=sdf.parse(source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }
}
