package com.javastar920905.template;

/**
 * Created by ouzhx on 2017/12/6.
 */
public class Test {
  public static void main(String[] args) {
    // 这里怕漏答
    TestPaper stu1 = new Answer1();
    stu1.question1();
    stu1.answer1();
    stu1.question2();
    stu1.answer2();
    stu1.question3();
    stu1.answer3();

    // 优化使用构建者模式
    System.out.println("使用构建者模式===========>");
    AnswerDirector director = new AnswerDirector(new Answer2());
    director.answer();

  }
}
