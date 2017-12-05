package com.javastar920905.observer.v2;

/**
 * Created by ouzhx on 2017/12/5.
 */
public interface Subject {
  void addObserver(Observer observer);

  void delObserver(Observer observer);

  void notifyMsg();

}
