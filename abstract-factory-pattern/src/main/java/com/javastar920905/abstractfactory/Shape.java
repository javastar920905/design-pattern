package com.javastar920905.abstractfactory;

/**
 * Created by ouzhx on 2016/12/26.
 * 创建型设计模式: 抽象工厂模式
 * 定义一个创建对象的接口,让其子类决定创建哪个一工厂类,工厂模式使其创建过程中延迟到子类中 进行
 */
public interface Shape {
  void draw();
}
