package com.javastar920905.appearance.v3;

/**
 * Created by ouzhx on 2017/12/6.
 * 
 * 外光类 统一门面
 */
public class Apprearence {
  SubSystem1 subSystem1;
  SubSystem2 subSystem2;
  SubSystem3 subSystem3;

  public Apprearence() {
    this.subSystem1 = new SubSystem1();
    this.subSystem2 = new SubSystem2();
    this.subSystem3 = new SubSystem3();
  }

  public void method1() {
    System.out.println("方法组1...");
    subSystem1.Method1();
    subSystem2.Method2();
    subSystem3.Method3();
  }

  public void method2() {
    System.out.println("方法组2...");
    subSystem2.Method2();
    subSystem3.Method3();
  }
}
