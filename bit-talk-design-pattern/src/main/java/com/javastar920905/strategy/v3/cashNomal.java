package com.javastar920905.strategy.v3;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class cashNomal extends CasherFactory {
  /**
   * 收银功能 正常收费返回原价
   * 
   * @param money
   * @return
   */
  @Override
  public double acceptCash(double money) {
    return money;
  }
}
