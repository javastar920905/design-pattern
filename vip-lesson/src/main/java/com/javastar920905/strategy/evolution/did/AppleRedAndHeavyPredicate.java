package com.javastar920905.strategy.evolution.did;

import com.javastar920905.strategy.evolution.Apple;

/**
 * Created by ouzhx on 2017/12/1. 可以拓展多个策略了
 */
public class AppleRedAndHeavyPredicate implements ApplePredicate {
  @Override
  public boolean test(Apple apple) {
    return "red".equals(apple.getColor()) && apple.getWeight() > 150;
  }
}
