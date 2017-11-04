package com.javastar920905.factory.function;

import com.javastar920905.factory.Benz;
import com.javastar920905.factory.Car;

/**
 * Created by ouzhx on 2017/11/4.
 */
public class BenzFactory implements Factory {
    @Override public Car getCar() {
        return new Benz();
    }
}
