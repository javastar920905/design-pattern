package com.javastar920905.template;

/**
 * Created by ouzhx on 2017/11/9.
 */
public class Tea extends DrinkMachine {
  @Override
  public void dropCup() {
    System.out.println("将茶叶放入杯子中");
  }

  @Override
  public void addCondiment() {
    System.out.println("添加蜂蜜");
  }
}
