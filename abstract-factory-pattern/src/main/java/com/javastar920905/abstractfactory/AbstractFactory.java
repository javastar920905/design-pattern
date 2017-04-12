package com.javastar920905.abstractfactory;

/**
 * Created by ouzhx on 2016/12/26. 创建抽象类获取工厂,然后将接口的工厂类 继承该抽象类
 *
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 */
public abstract class AbstractFactory {
  abstract Color getColor(String color);

  abstract Shape getShape(String shape);
}
