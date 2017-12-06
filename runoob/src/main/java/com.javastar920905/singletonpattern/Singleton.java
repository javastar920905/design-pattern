package com.javastar920905.singletonpattern;

/**
 * Created by ouzhx on 2016/12/26. 单实例 饿汉式加载,项目启动时new对象
 */
public class Singleton {

  // 只有在项目启动时 new一次对象,没有达到懒加载效果,但是非常简单实用
  // 当明确要求使用懒加载时可参考文档 :http://www.runoob.com/design-pattern/singleton-pattern.html
  private static final Singleton SINGLETON = new Singleton();

  // 构造函数私有,不让new
  private Singleton() {}

  public Singleton getInstance() {
    return SINGLETON;
  }

}
