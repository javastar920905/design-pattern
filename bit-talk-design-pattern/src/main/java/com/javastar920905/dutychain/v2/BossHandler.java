package com.javastar920905.dutychain.v2;

import com.javastar920905.dutychain.v1.Request;

/**
 * Created by ouzhx on 2017/12/6.
 * 
 * 处理所有申请
 */
public class BossHandler extends Handler {

  @Override
  public void handRequest(Request request) {
    if (request.getRequestType().equals("请假")) {
      System.out.println("看情况(项目进度)批准");
      return;
    } else if (request.getRequestType().equals("加薪")) {
      System.out.println("看营业额和员工效益 而定");
    }

  }
}
