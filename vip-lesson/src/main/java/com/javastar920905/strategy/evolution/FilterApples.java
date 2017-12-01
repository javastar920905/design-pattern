package com.javastar920905.strategy.evolution;

import com.javastar920905.strategy.evolution.did.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class FilterApples {

  /**
   * 需求v1 --筛选绿苹果
   * 
   * @param inventory
   * @return
   */
  public static List<Apple> V1_filterGreenApples(List<Apple> inventory) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      // 这里只是筛选绿苹果 直接写死
      if ("green".equals(apple.getColor())) {
        result.add(apple);
      }
    }
    return result;
  }


  /**
   * v2-但是现在农民改主意了，他还想要筛选红苹果
   * 
   * @param inventory
   * @param color
   * @return
   */
  public static List<Apple> V2_filterApplesByColor(List<Apple> inventory, String color) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (apple.getColor().equals(color)) {
        result.add(apple);
      }
    }
    return result;
  }

  /**
   * v3-(额外加方法)要是能区分 轻的苹果和重的苹果就太好了。重的苹果一般是重量大于150克。
   * 
   * @param inventory
   * @param weight
   * @return
   */
  public static List<Apple> v3_filterApplesByWeight(List<Apple> inventory, int weight) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (apple.getWeight() > weight) {
        result.add(apple);
      }
    }
    return result;
  }


  /**
   * (整合v2+v3) 复制了大部分的v2代码来实现遍历库存(打破了DRY（Don’t Repeat Yourself，不要重复自己）的软件 工程原则)
   *
   * List<Apple> greenApples = filterApples(inventory, "green", 0, true);
   *
   * List<Apple> heavyApples = filterApples(inventory, "", 150, false);
   * 
   * @param inventory
   * @param color
   * @param weight
   * @param flag
   * @return
   */
  public static List<Apple> v4_filterApples(List<Apple> inventory, String color, int weight,
      boolean flag) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      // 这里做的判断复杂,尽量避免
      if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
        result.add(apple);
      }
    }
    return result;
  }


  /**
   * v4 使用策略模式 (把不同的选择运算或算法,封装(称为"策略")): 换句话说，你把 filterApples 方法的行为参数化了
   * 
   * 
   * 调用方式 List<Apple> redAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
   * 
   * @param inventory
   * @param p 选择策略
   * @return
   */
  public static List<Apple> v5_filterApples(List<Apple> inventory, ApplePredicate p) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      // p 策略封装了测试苹果条件, 实现行为参数化了
      if (p.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }
}
