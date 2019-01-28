package com.jiyifa.factory.methodfactory;

import com.jiyifa.factory.Bmw;
import com.jiyifa.factory.Car;

public class BmwFactory implements Factory{
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
