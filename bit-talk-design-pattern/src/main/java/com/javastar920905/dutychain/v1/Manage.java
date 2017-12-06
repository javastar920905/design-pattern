package com.javastar920905.dutychain.v1;

/**
 * Created by ouzhx on 2017/12/6.
 * 
 * 上级领导,同时包含各自上级的引用
 */
public class Manage {
  protected String name;

  public Manage(String name) {
    this.name = name;
  }

  public void getResult(Request request) {
    if (request.getRequestType().equals("请假")) {

    } else {
      System.out.println("我无权处理");
    }
  }
}
