package com.javastar920905.simplefactory.v3;


/**
 * Created by ouzhx on 2017/12/5.
 * 
 * 具备高可扩展,可维护性
 */
public abstract class CalcFactory {
  protected double numberA;
  protected double numberB;

  /**
   * 计算方法, 由子类覆盖
   * 
   * @return
   */
  public abstract double getResult();

  /**
   * 简单工厂方法
   * 
   * @param operator
   * @return
   */
  public static CalcFactory createCalc(String operator) {
    switch (operator) {
      case "+":
        return new OperatorPlus();
      case "-":
        return new OperatorMinus();
      case "*":
        return new OperatorMulti();
      case "/":
        return new OperatorDev();
    }
    return null;
  }

  public double getNumberA() {
    return numberA;
  }

  public void setNumberA(double numberA) {
    this.numberA = numberA;
  }

  public double getNumberB() {
    return numberB;
  }

  public void setNumberB(double numberB) {
    this.numberB = numberB;
  }
}
