package com.javastar920905.factory.function;

import com.javastar920905.factory.BMW;
import com.javastar920905.factory.Car;

/**
 * Created by ouzhx on 2017/11/4.
 */
public class BMWFactory implements Factory {
    @Override public Car getCar() {
        return new BMW();
    }
}
