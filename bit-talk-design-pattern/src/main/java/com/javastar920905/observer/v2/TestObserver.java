package com.javastar920905.observer.v2;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class TestObserver {
  public static void main(String[] args) {
    // 老板
    Boss boss = new Boss();

    // 看股票的同事
    StockObserver oberver1 = new StockObserver("ouou", boss);
    StockObserver oberver2 = new StockObserver("cly", boss);

    // 前台记录下同事的电话
    boss.addObserver(oberver1);
    boss.addObserver(oberver2);

    boss.delObserver(oberver2);

    boss.setAction("老板回来了!");
    // 通知同事
    boss.notifyMsg();
  }
}
