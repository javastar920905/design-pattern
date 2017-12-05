package com.javastar920905.strategy.v3;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class CashStrategyContext {
  CasherFactory factory;

  public CashStrategyContext(CasherFactory factory) {
    this.factory = factory;
  }

  public double acceptCash(double money) {
    return factory.acceptCash(money);
  }

  /**
   * 将CasherFactory 中的工厂方法 修改为策略模式
   * 
   * 
   * 缺点: 将复杂度留给了用户(用户需要知道 各个cash类才能使用)
   * 
   * @param args
   */
  public static void main(String[] args) {
    CashStrategyContext context;
    context = new CashStrategyContext(new cashNomal());
    System.out.println(context.acceptCash(1200));

    context = new CashStrategyContext(new cashDiscount());
    System.out.println(context.acceptCash(1200));

    context = new CashStrategyContext(new cashReturnning());
    System.out.println(context.acceptCash(1200));

  }

}
