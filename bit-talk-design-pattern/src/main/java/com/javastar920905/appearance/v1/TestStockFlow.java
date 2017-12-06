package com.javastar920905.appearance.v1;

/**
 * Created by ouzhx on 2017/12/6.
 * 
 * 购买股票流程测试
 */
public class TestStockFlow {
  public static void main(String[] args) {
    Stock1 stock1 = new Stock1();
    Stock2 stock2 = new Stock2();
    Realty realty = new Realty();
    NationalDebt debt = new NationalDebt();


    // 购买
    stock1.buy();
    stock2.buy();
    realty.buy();
    debt.buy();

    // 售出
    stock1.sell();
    stock2.sell();
    realty.sell();
    debt.sell();


  }
}
