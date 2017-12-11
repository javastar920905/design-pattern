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

  /** 当前类需要关注具体的实现 客户端使用不方便 **/
  public Car getCar(Class clazz) {
    try {
      return (Car) Class.forName(clazz.getName()).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;
  }


  /** 这个name 可以定义为常量使用 隔离了开发代码量 以及 客户端调用 **/
  public Car getCarByReflect(String name) {
    // 使用反射优化
    try {
      return (Car) Class.forName(name).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return null;

  }
}
