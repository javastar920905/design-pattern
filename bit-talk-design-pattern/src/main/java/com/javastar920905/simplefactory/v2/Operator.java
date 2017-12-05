package com.javastar920905.simplefactory.v2;

import java.util.Scanner;

/**
 * Created by ouzhx on 2017/12/5.
 * 
 * 实现类业务与输出分离
 */
public class Operator {
  public static double getResult(int numberA, int numberB, String operator) {
    switch (operator) {
      case "+":
        return numberA + numberB;
      case "-":
        return numberA - numberB;
      case "*":
        return numberA * numberB;
      case "/":
        return numberA / numberB;
    }
    return 0;
  }

  /**
   * 考虑业务封装 (将业务逻辑与输出拆分,降低耦合度--实现了逻辑运算重用,运算结果可以输出为控制台,web,手机...)
   *
   * 缺点: 拓展性不强 添加运算符号时(需要改动运算方法,拓展功能时,影响了原有的加减乘除功能)
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("请输入数字1:");
    int numberA = in.nextInt();
    System.out.println("选择运算符合(+,-,*,/)");
    String operater = in.next();
    System.out.println("请输入数字2:");
    int numberB = in.nextInt();
    System.out.println("结果是:" + getResult(numberA, numberB, operater));

  }
}
