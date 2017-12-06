package com.javastar920905.template;

/**
 * Created by ouzhx on 2017/12/6.
 */
public class AnswerDirector {
  TestPaper testPaper;

  public AnswerDirector(TestPaper testPaper) {
    this.testPaper = testPaper;
  }

  public void answer() {
    testPaper.question1();
    testPaper.answer1();
    testPaper.question2();
    testPaper.answer2();
    testPaper.question3();
    testPaper.answer3();
  }
}
