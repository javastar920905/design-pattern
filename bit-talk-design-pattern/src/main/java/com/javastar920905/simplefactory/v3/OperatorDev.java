package com.javastar920905.simplefactory.v3;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class OperatorDev extends CalcFactory {
  @Override
  public double getResult() {
    return numberA / numberB;
  }

}
