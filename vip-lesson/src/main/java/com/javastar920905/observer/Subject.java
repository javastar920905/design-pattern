package com.javastar920905.observer;

/**
 * Created by ouzhx on 2017/12/1.
 */
public interface Subject {
  /**
   * 注册一个新的观察者
   * 
   * @param o
   */
  void registerObserver(Observer o);

  /**
   * 通知它的观察者一个新闻的到来
   * 
   * @param tweet
   */
  void notifyObservers(String tweet);
}
