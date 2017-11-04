package com.javastar920905.factory.abstr;

/**
 * Created by ouzhx on 2017/11/4.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        DefaultFactory factory = new DefaultFactory();
        factory.getCar();//默认

        factory.getCar("Benz");

        //解决了编写代码和调用代码的人 双方的痛楚
        // 抽象工厂= 提高了工厂专业度(工厂方法)+又方便了消费者(简单工厂)
    }
}
