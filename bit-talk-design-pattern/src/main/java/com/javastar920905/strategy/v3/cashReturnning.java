package com.javastar920905.strategy.v3;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class cashReturnning extends CasherFactory {
  private double condition = 100;
  private double returnFee = 10;

  public cashReturnning() {}

  public cashReturnning(double condition, double returnFee) {
    this.condition = condition;
    this.returnFee = returnFee;
  }

  /**
   * 收银功能 满减
   * 
   * @param money
   * @return
   */
  @Override
  public double acceptCash(double money) {
    if (money > condition) {
      return money - returnFee;
    } else {
      return money;
    }
  }
}
