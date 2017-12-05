package com.javastar920905.decorate.v2;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class DeracotrA extends Deractor {

  @Override
  public void operation() {
    super.operation();
    System.out.println("DeracotrA 追加操作");
  }
}
