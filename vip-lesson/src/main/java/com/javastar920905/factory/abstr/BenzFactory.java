package com.javastar920905.factory.abstr;

import com.javastar920905.factory.Benz;
import com.javastar920905.factory.Car;
import com.javastar920905.factory.function.Factory;

/**
 * Created by ouzhx on 2017/11/4.
 */
public class BenzFactory extends AbstractFactory{
    @Override public Car getCar() {
        return new Benz();
    }
}
