package com.jiyifa.factory.simple;

import com.jiyifa.factory.Audi;
import com.jiyifa.factory.Benz;
import com.jiyifa.factory.Bmw;
import com.jiyifa.factory.Car;

//对于这个工厂来说（太强大了）
//这个工厂啥都能干（不符合现实）
//编码也是一种艺术（融汇贯通），艺术来源于生活，回归生活
public class SimpleFactory{
    //实现统一管理，专业化管理
    //如果没有工厂模式，小作坊没有执行标准的
    //如果买到三无产品（没有标准）
    //卫生监督局工作难度会大大减轻
    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new Bmw();
        }else if("Benz".equalsIgnoreCase(name)){
            return new Benz();
        }else if("Audi".equalsIgnoreCase(name)){
            return new Audi();
        }else {
            System.out.println("这个产品产不出来");
            return null;
        }
    }
}
