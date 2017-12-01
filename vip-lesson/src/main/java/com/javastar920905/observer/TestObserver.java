package com.javastar920905.observer;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class TestObserver {
  public static void main(String[] args) {
    Feed f = new Feed();
    f.registerObserver(new NYTimes());
    f.registerObserver(new Guardian());
    f.registerObserver(new LeMonde());
    //通知订阅者新的消息
    f.notifyObservers("The queen said her favourite book is Java 8 in Action!");
  }
}
