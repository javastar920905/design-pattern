package com.javastar920905.strategy.evolution.did3;

import java.text.MessageFormat;

/**
 * Created by ouzhx on 2017/12/1.
 */
public class TestValidator {

  public static void main(String[] args) {
    Validator numericValidator = new Validator(new IsNumeric());
    boolean b1 = numericValidator.validate("aaaa");
    Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
    boolean b2 = lowerCaseValidator.validate("bbbb");
    System.out.println(MessageFormat.format("b1={},b2={}", b1, b2));
  }

}
