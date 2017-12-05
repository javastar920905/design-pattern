package com.javastar920905.strategy.v3;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class CashStrategyContextV2 {
  CasherFactory factory;

  /**
   * 将构造函数 改成简单工厂,封装复杂度
   * 
   * @param type
   */
  public CashStrategyContextV2(String type) {
    switch (type) {
      case "discount":
        this.factory = new cashDiscount();
        break;
      case "returnning":
        this.factory = new cashReturnning();
        break;
      case "nomal":
        this.factory = new cashNomal();
        break;
    }
  }

  public double acceptCash(double money) {
    return factory.acceptCash(money);
  }

  /**
   * 将CasherFactory 中的工厂方法 修改为策略模式(用户只需要认识CashStrategyContextV2 类就好了)
   * 
   * @param args
   */
  public static void main(String[] args) {
    CashStrategyContextV2 context;
    context = new CashStrategyContextV2("discount");
    System.out.println(context.acceptCash(1200));

    context = new CashStrategyContextV2("nomal");
    System.out.println(context.acceptCash(1200));

    context = new CashStrategyContextV2("returnning");
    System.out.println(context.acceptCash(1200));

  }

}
