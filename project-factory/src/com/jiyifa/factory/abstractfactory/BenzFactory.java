package com.jiyifa.factory.abstractfactory;

import com.jiyifa.factory.Benz;
import com.jiyifa.factory.Car;
import com.jiyifa.factory.methodfactory.Factory;

public class BenzFactory extends AbstractFactory{
    @Override
    public Car getCar() {
        return new Benz();
    }
}
