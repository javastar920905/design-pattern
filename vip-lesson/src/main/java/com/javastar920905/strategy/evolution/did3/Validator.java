package com.javastar920905.strategy.evolution.did3;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class Validator {
  private final ValidationStrategy strategy;

  public Validator(ValidationStrategy v) {
    this.strategy = v;
  }

  /**
   * 校验方法, 行为参数化
   *
   * @param s
   * @return
   */
  public boolean validate(String s) {
    return strategy.execute(s);
  }
}
