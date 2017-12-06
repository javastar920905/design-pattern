package com.javastar920905.appearance.v2;

import com.javastar920905.appearance.v1.NationalDebt;
import com.javastar920905.appearance.v1.Realty;
import com.javastar920905.appearance.v1.Stock1;
import com.javastar920905.appearance.v1.Stock2;

/**
 * Created by ouzhx on 2017/12/6.
 *
 * 添加基金类(外观类) (外观类需要了解 所有子产品的特性,进行组合,以备外界调用)
 */
public class Fund {
  Stock1 stock1;
  Stock2 stock2;
  Realty realty;
  NationalDebt debt;

  public Fund() {
    this.stock1 = new Stock1();
    this.stock2 = new Stock2();
    this.realty = new Realty();
    this.debt = new NationalDebt();
  }

  /**
   * 基金经理买卖股票
   */
  public void buyFund() {
    stock1.buy();
    stock2.buy();
    realty.buy();
    debt.buy();
  }

  public void sellFund() {
    stock2.sell();
    stock1.sell();
    debt.sell();
    realty.sell();
  }

  public static void main(String[] args) {
    Fund jijin = new Fund();

    // 此时用户可以不需要了解股票 甚至对股票一无所知,
    // 买了基金就回家睡觉,剩下的由基金公司完成,外观模式
    jijin.buyFund();

    jijin.sellFund();
  }
}
