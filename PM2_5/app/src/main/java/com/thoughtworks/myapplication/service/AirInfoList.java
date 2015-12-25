package com.thoughtworks.myapplication.service;

import com.thoughtworks.myapplication.domain.PM25;


public class AirInfoList {

    public static String getAirInfo(PM25 pm25){
        StringBuffer result = new StringBuffer();

        if (pm25.getPositionName() == null) {
            result.append("地址：未知\n") ;
        }else {
            result.append("地址：" + pm25.getPositionName() + "\n");
        }
        result.append("检测时间：" + pm25.getTime() + "\n");

        if (pm25.getPollutant() == null) {
            result.append("首要污染物：未知\n");
        }else {
            result.append("首要污染物：" + pm25.getPollutant() + "\n");
        }

        result.append("颗粒物（粒径小于等于2.5μm）1小时平均：" + pm25.getPM25() + "\n");
        result.append("颗粒物（粒径小于等于10μm）1小时平均：" + pm25.getPM10() + "\n");
        result.append("二氧化硫1小时平均：" + pm25.getSO2() + "\n");
        result.append("二氧化氮1小时平均：" + pm25.getNO2() + "\n");
        result.append("一氧化碳1小时平均：" + pm25.getCO() + "\n");
        result.append("臭氧1小时平均：" + pm25.getO3() + "\n");
        return result.toString();
    }
}
