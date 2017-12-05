package com.javastar920905.observer.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class Secretray implements Subject {
  private List<Observer> observers = new ArrayList<>();
  private String action;

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void delObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyMsg() {
    observers.stream().forEach(observer -> observer.update());
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }
}
