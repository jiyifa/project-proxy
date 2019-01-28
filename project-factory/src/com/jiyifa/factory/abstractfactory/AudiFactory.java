package com.jiyifa.factory.abstractfactory;

import com.jiyifa.factory.Audi;
import com.jiyifa.factory.Car;
import com.jiyifa.factory.methodfactory.Factory;

public class AudiFactory extends AbstractFactory{
    @Override
    public Car getCar() {
        return new Audi();
    }
}
