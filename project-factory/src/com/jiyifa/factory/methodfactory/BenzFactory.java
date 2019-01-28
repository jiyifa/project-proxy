package com.jiyifa.factory.methodfactory;

import com.jiyifa.factory.Benz;
import com.jiyifa.factory.Car;

public class BenzFactory implements Factory{
    @Override
    public Car getCar() {
        return new Benz();
    }
}
