package com.javastar920905.strategy.v3;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class cashDiscount extends CasherFactory {
  private double discount = 0.8;

  /**
   * 收银功能 打折收费*折扣
   * 
   * @param money
   * @return
   */
  @Override
  public double acceptCash(double money) {
    return money * discount;
  }
}
