package com.javastar920905.observer.v1;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class TestObserver {
  public static void main(String[] args) {
    // 前台MM
    Secretary secretary = new Secretary();

    // 看股票的同事
    StockOberver oberver1 = new StockOberver("ouou", secretary);
    StockOberver oberver2 = new StockOberver("cly", secretary);

    // 前台记录下同事的电话
    secretary.addObserver(oberver1);
    secretary.addObserver(oberver2);

    secretary.setAction("老板回来了!");
    // 通知同事
    secretary.notifyMsg();
  }
}
