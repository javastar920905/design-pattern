package com.javastar920905.template;

/**
 * Created by ouzhx on 2017/11/9.
 */
public class Coffee extends DrinkMachine {
  @Override
  public void dropCup() {
    System.out.println("将咖啡倒入杯子中");
  }

  @Override
  public void addCondiment() {
    System.out.println("添加牛奶和糖");
  }
}
