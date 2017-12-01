package com.javastar920905.strategy.evolution.did2;

import com.javastar920905.strategy.evolution.Apple;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class AppleSimpleFormatter implements AppleFormatter {
  @Override
  public String print(Apple apple) {
    return "An apple of " + apple.getWeight() + "g";
  }
}
