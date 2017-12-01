package com.javastar920905.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class Feed implements Subject {
  private final List<Observer> observers = new ArrayList<>();

  /**
   * 注册一个新的观察者
   *
   * @param o
   */
  @Override
  public void registerObserver(Observer o) {
    this.observers.add(o);
  }

  /**
   * 通知它的观察者一个新闻的到来
   *
   * @param tweet
   */
  @Override
  public void notifyObservers(String tweet) {
    observers.forEach(o -> o.notify(tweet));
  }
}
