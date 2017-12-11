package com.javastar920905.strategy.v4;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class StrategeContext {
  IStrategy strategy;

  public StrategeContext(IStrategy strategy) {
    this.strategy = strategy;
  }

  public void algorithm() {
    strategy.algorithm();
  }

  /**
   * 由于实例化不同的策略,所以获取的结果不同
   * 
   * @param args
   */
  public static void main(String[] args) {
    StrategeContext context;
    context = new StrategeContext(new StrategyA());
    context.algorithm();

    context = new StrategeContext(new StrategyB());
    context.algorithm();
  }
}
