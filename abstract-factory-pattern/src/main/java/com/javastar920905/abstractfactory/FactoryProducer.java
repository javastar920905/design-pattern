package com.javastar920905.abstractfactory;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class FactoryProducer {
  public static AbstractFactory getfactory(String factoryName) {
    if (factoryName == null) {
      return null;
    }
    if (factoryName.equalsIgnoreCase("color")) {
      return new ColorFactory();
    } else if (factoryName.equalsIgnoreCase("shape")) {
      return new ShapeFactory();
    }
    return null;
  }
}
