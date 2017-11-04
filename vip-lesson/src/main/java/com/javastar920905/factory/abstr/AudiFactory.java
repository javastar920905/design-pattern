package com.javastar920905.factory.abstr;

import com.javastar920905.factory.Audi;
import com.javastar920905.factory.Car;
import com.javastar920905.factory.function.Factory;

/**
 * Created by ouzhx on 2017/11/4.
 * 各个厂商需要实现行业标准
 */
public class AudiFactory extends AbstractFactory {
    @Override public Car getCar() {
        return new Audi();
    }
}
