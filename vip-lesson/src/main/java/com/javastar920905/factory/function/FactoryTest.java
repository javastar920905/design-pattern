package com.javastar920905.factory.function;

/**
 * Created by ouzhx on 2017/11/4.
 */
public class FactoryTest {
    //用户消费,找对应工厂
    public static void main(String[] args) {
        //工厂方法模式,各个厂商拥有各自工厂,生产工艺也不同(专业化程度提高)
        Factory factory = new AudiFactory();
        System.out.print(factory.getCar().logo());
        Factory factory2 = new BMWFactory();
        System.out.print(factory2.getCar().logo());
        Factory factory3 = new BenzFactory();
        System.out.print(factory3.getCar().logo());

        //有个问题 需要用户关心各个工厂的生产商,对用户增加选择难度
        //增加了代码使用复杂度

        //这时候就需要一个默认工厂,抽象工厂,抽象类可以默认做一些事情
    }
}
