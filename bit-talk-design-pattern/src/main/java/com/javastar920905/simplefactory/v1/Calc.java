package com.javastar920905.simplefactory.v1;

import java.util.Scanner;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class Calc {
  /**
   * 程序满足了当前需求,实现一个计算器
   * 
   * 缺点(程序不容易维护,不容易扩展,不容易复用)
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

    String result = "";
    switch (operater) {
      case "+":
        result = numberA + numberB + "";
        break;
      case "-":
        result = numberA - numberB + "";
        break;
      case "*":
        result = numberA * numberB + "";
        break;
      case "/":
        result = numberA / numberB + "";
        break;
    }
    System.out.println("结果是:" + result);

  }
}
