package com.javastar920905.template;

/**
 * Created by ouzhx on 2017/11/9.
 */
public class TestTemplate {
  public static void main(String[] args) {
    // 制作咖啡
    Coffee coffee = new Coffee();
    coffee.create();

    System.out.println("      ------->");
    // 制作茶水
    Tea tea = new Tea();
    tea.create();
  }
}
