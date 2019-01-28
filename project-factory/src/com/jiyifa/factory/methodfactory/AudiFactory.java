package com.jiyifa.factory.methodfactory;

import com.jiyifa.factory.Audi;
import com.jiyifa.factory.Car;

public class AudiFactory implements Factory{
    @Override
    public Car getCar() {
        return new Audi();
    }
}
