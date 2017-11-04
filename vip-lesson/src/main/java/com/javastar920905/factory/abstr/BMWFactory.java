package com.javastar920905.factory.abstr;

import com.javastar920905.factory.BMW;
import com.javastar920905.factory.Car;
import com.javastar920905.factory.function.Factory;

/**
 * Created by ouzhx on 2017/11/4.
 */
public class BMWFactory extends AbstractFactory {
    @Override public Car getCar() {
        return new BMW();
    }
}
