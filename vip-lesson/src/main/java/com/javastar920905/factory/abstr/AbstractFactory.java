package com.javastar920905.factory.abstr;

import com.javastar920905.factory.Car;

/**
 * Created by ouzhx on 2017/11/4.
 */
public abstract class AbstractFactory {
  protected abstract Car getCar();

  /* 这段代码用户动态配置 即可 */
  public Car getCar(String name) {
    if ("BMW".equals(name)) {
      return new BMWFactory().getCar();
    } else if ("Benz".equals(name)) {
      return new BenzFactory().getCar();
    } else if ("Audi".equals(name)) {
      return new AudiFactory().getCar();
    } else {
      System.out.print("暂无该产品");
      return null;
    }
  }
}
