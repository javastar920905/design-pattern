package com.javastar920905.strategy.evolution.did2;

import com.javastar920905.strategy.evolution.Apple;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class AppleFancyFormatter implements AppleFormatter {
  @Override
  public String print(Apple apple) {
    String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
    return "A " + characteristic + " " + apple.getColor() + " apple";
  }
}
