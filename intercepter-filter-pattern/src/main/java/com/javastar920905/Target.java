package com.javastar920905;

/**
 * Created by ouzhx on 2016/12/26.
 *
 * - Target 对象是请求处理程序。
 */
public class Target {
  public void execute(String request) {
    System.out.println("execute a task:" + request);
  }
}
