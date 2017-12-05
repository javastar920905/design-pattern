package com.javastar920905.simplefactory.v3;



import java.util.Scanner;

/**
 * Created by ouzhx on 2017/12/5.
 */
public abstract class TestCalcFactory {
  /**
   * 这样如果
   * 
   * 有一天想修改加法运算 只需要修改OperatorPlus
   * 
   * 如果想添加一种新的运算(平方根,立方根,对数,指数...), 只需要添加相应的子类即可,同时修改工厂添加新的case
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("选择运算符合(+,-,*,/)");
    // 计算类型具备了扩展度
    CalcFactory calc = CalcFactory.createCalc(in.next());
    System.out.println("请输入数字1:");
    int numberA = in.nextInt();
    System.out.println("请输入数字2:");
    int numberB = in.nextInt();
    calc.setNumberA(numberA);
    calc.setNumberB(numberB);
    System.out.println("结果是:" + calc.getResult());

  }
}
