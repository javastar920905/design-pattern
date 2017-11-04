package com.javastar920905.factory.simple;

import com.javastar920905.factory.Audi;
import com.javastar920905.factory.BMW;
import com.javastar920905.factory.Benz;
import com.javastar920905.factory.Car;

/**
 * Created by Administrator on 2017/11/3.
 *
 * 这个工厂功能太强大了,能生产宝马,Audi... 不符合现实
 */
public class SimpleCarFactory {
  public Car getCar(String name) {
    if ("BMW".equals(name)) {
      return new BMW();
    } else if ("Benz".equals(name)) {
      return new Benz();
    } else if ("Audi".equals(name)) {
      return new Audi();
    } else {
      System.out.print("暂无该产品");
      return null;
    }
  }
}
