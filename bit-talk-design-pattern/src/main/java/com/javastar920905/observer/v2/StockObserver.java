package com.javastar920905.observer.v2;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
  public void update() {
    System.out.println("停止查看股票" + secretary.getAction() + " name" + name);
  }
}
