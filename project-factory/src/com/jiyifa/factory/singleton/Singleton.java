package com.jiyifa.factory.singleton;

//懒汉式（静态内部类）
//这种写法，即解决安全问题，又解决了性能问题
//这个代买没有浪费一个字
public class Singleton {
    //1.先声明一个静态内部类
    //private 私有的保证别人不能修改
    //static 保证全局唯一
    private static class LazyHolder{
        //final 为了防止内部误操作
        private static final Singleton INSTANCE = new Singleton();
    }
    //2.将默认构造方法私有化
    private  Singleton(){}

    //3.同样提供静态方法获取实例
    //final 确保别人不能覆盖
    public static final Singleton getInstance(){
        return LazyHolder.INSTANCE;
    }
}

//类装载到jvm中过程
//1.从上往下（必须声明在前，使用在后）
//先属性，后属性
//先静态，后动态