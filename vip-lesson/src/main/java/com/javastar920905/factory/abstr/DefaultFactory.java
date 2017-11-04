package com.javastar920905.factory.abstr;

import com.javastar920905.factory.Car;

/**
 * Created by ouzhx on 2017/11/4.
 */
public class DefaultFactory extends AbstractFactory {
    @Override protected Car getCar() {
        return super.getCar("Audi");
    }

}
