package com.javastar920905.template;

/**
 * Created by ouzhx on 2017/12/6.
 */
public abstract class TestPaper {
  /**
   * 能自己完成的就自己完成
   */
  public void question1() {
    System.out.println("你叫什么名字?");
  }

  /**
   * (动态实现)给集成的子类重写
   */
  protected abstract void answer1();

  public void question2() {
    System.out.println("你今年多少岁?");
  }

  protected abstract void answer2();

  public void question3() {
    System.out.println("你的性别?");
  }

  protected abstract void answer3();
}
