package com.javastar920905.strategy.evolution.did;

import com.javastar920905.strategy.evolution.Apple;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class AppleGreenColorPredicate implements ApplePredicate {
  @Override
  public boolean test(Apple apple) {
    return "green".equals(apple.getColor());
  }
}
