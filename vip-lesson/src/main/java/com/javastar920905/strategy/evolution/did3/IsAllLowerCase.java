package com.javastar920905.strategy.evolution.did3;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class IsAllLowerCase implements ValidationStrategy {
  @Override
  public boolean execute(String s) {
    return s.matches("[a-z]+");
  }
}
