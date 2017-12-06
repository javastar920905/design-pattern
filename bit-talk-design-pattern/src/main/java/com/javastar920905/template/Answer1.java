package com.javastar920905.template;

/**
 * Created by ouzhx on 2017/12/6.
 */
public class Answer1 extends TestPaper {
  /**
   * (动态实现)给集成的子类重写
   */
  @Override
  protected void answer1() {
    System.out.println("我叫 ouou");
  }

  @Override
  protected void answer2() {
    System.out.println("今年18");
  }

  @Override
  protected void answer3() {
    System.out.println("男");
  }
}
