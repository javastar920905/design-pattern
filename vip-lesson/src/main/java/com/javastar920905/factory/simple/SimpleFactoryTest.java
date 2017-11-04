package com.javastar920905.factory.simple;

import com.javastar920905.factory.Car;

/**
 * Created by Administrator on 2017/11/3.
 */
public class SimpleFactoryTest {
  public static void main(String[] args) {
    // 这边就是我们的消费者,产品符合用户需求即可 工厂统一专业化管理(没有工厂就是三无产品,没有生产标准)
    Car car = new SimpleCarFactory().getCar("BMW");
    System.out.println(car.logo());
    Car car2 = new SimpleCarFactory().getCar("Audi");
    System.out.println(car2.logo());
    Car car3 = new SimpleCarFactory().getCar("Benz");
    System.out.println(car3.logo());
  }
}
