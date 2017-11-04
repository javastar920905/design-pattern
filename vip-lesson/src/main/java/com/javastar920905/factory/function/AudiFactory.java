package com.javastar920905.factory.function;

import com.javastar920905.factory.Audi;
import com.javastar920905.factory.Car;

/**
 * Created by ouzhx on 2017/11/4.
 * 各个厂商需要实现行业标准
 */
public class AudiFactory implements Factory {
    @Override public Car getCar() {
        return new Audi();
    }
}
