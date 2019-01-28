package com.jiyifa.factory.abstractfactory;

import com.jiyifa.factory.Car;

public class DefaultFactory extends AbstractFactory{
    private AudiFactory defaultFactory = new AudiFactory();
    @Override
    protected Car getCar() {
        return defaultFactory.getCar();
    }
}
