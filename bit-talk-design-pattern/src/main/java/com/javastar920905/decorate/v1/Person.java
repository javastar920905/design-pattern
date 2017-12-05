package com.javastar920905.decorate.v1;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public void wearTshit() {
    System.out.println("穿 T-shit");
  }

  public void wearShoes() {
    System.out.println("穿 鞋子");
  }

  public void show() {
    System.out.println("我是" + name);
  }
}
