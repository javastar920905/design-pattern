package com.javastar920905.strategy.evolution.did2;

import com.javastar920905.strategy.evolution.Apple;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class TestAppleFormatter {
  public static void main(String[] args) {
    prettyPrintApple(Arrays.asList(new Apple()), new AppleSimpleFormatter());
  }

  /**
   * 可以为当前方法传递 多种formatter行为
   * 
   * @param inventory
   * @param formatter
   */
  public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
    for (Apple apple : inventory) {
      String output = formatter.print(apple);
      System.out.println(output);
    }
  }
}
