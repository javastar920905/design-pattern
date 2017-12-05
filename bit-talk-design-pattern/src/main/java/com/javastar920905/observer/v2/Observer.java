package com.javastar920905.observer.v2;

import com.javastar920905.observer.v1.Secretary;

/**
 * Created by ouzhx on 2017/12/5.
 */
public abstract class Observer {
  protected String name;
  protected Secretary secretary;

  public Observer(String name, Subject sub) {
    this.name = name;
    this.secretary = secretary;
  }

  public abstract void update();
}
