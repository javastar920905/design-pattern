package com.javastar920905.strategy.v3;

import com.javastar920905.simplefactory.v3.OperatorDev;
import com.javastar920905.simplefactory.v3.OperatorMinus;
import com.javastar920905.simplefactory.v3.OperatorMulti;
import com.javastar920905.simplefactory.v3.OperatorPlus;

/**
 * Created by ouzhx on 2017/12/5.
 */
public abstract class CasherFactory {
  /**
   * 收银功能
   * 
   * @return
   */
  public abstract double acceptCash(double money);

  /**
   * 用户需要认识 CasherFactory 需要调用acceptCash()方法前 调用createCashAccept()方法(具有复杂度)
   * 
   * @param type
   * @return
   */
  public static CasherFactory createCashAccept(String type) {
    // 这里可以使用反射优化switch
    switch (type) {
      case "discount":
        return new cashDiscount();
      case "returnning":
        return new cashReturnning();
      case "nomal":
        return new cashNomal();
    }
    return null;
  }
}
