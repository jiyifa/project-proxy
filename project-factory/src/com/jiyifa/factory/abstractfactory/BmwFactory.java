package com.jiyifa.factory.abstractfactory;

import com.jiyifa.factory.Bmw;
import com.jiyifa.factory.Car;
import com.jiyifa.factory.methodfactory.Factory;

public class BmwFactory extends AbstractFactory{
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
