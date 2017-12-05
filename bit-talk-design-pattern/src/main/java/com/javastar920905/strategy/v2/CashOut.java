package com.javastar920905.strategy.v2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class CashOut {
  /**
   * 简单实现功能,添加折扣 (生活中商品会满减,限时促销活动)
   *
   *
   *
   * @param args
   */
  public static void main(String[] args) {
    int nums = 2;
    double price = 23.5;
    String busiType = "discount";
    double total = 0;
    switch (busiType) {
      case "discount":
        List<Float> discountList = Arrays.asList(7f, 8f, 9f);
        // 选择商品折扣
        float discount = discountList.get(0);
        total = nums * price * discount;
      case "满减":
        String cashreturnList = "[{total:300,return:10}, {total:800,return:50}]";
        for (String item : cashreturnList.split("")) {
          if ("item.total" == (nums * price + "")) {
            total = 0;// nums * price-"item.return";
            break;
          }
        }
    }
    System.out.println("合计" + total);
  }
}
