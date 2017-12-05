package com.javastar920905.strategy.v1;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class CashOut {
  /**
   * 简单实现功能
   * 
   * 未考虑扩展点 (生活中商品会打折,限时促销活动)
   * 
   * @param args
   */
  public static void main(String[] args) {
    int nums = 2;
    double price = 23.5;
    double total = nums * price;
    System.out.println("合计");
  }
}
