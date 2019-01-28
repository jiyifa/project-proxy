package com.jiyifa.factory.abstractfactory;

import com.jiyifa.factory.Car;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        DefaultFactory defaultFactory = new DefaultFactory();
        System.out.println(defaultFactory.getCar("Bmw"));

        //设计模式的经典之处，就在于，解决的编写代码的人和调用代码的人双方的痛处
        //解放我们的双手

        //工厂模式特点
        //1.隐藏复杂的逻辑过程，只关心执行结果。
    }
}
