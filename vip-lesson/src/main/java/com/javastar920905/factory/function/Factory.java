package com.javastar920905.factory.function;

import com.javastar920905.factory.Car;

/**
 * Created by ouzhx on 2017/11/4.
 * 工厂接口,定义所有工厂的执行标准
 */
public interface Factory {
    /*所有汽车厂商上路标准
    * 尾气排放标准
    *
    * */
    Car getCar();


}
