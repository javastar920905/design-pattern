package com.javastar920905.dutychain.v2;

import com.javastar920905.dutychain.v1.Request;

/**
 * Created by ouzhx on 2017/12/6.
 * 
 * 经理只能处理请假 半天以内的申请,无法处理加薪申请
 */
public class Manage1Handler extends Handler {

  @Override
  public void handRequest(Request request) {
    if (request.getRequestType().equals("请假")) {
      if (request.getRequestContent().equals("半天以内")) {
        System.out.println("看情况(项目进度)批准");
        return;
      }
    }
    System.out.println("其他请求处理不了,交给上级处理");
    nextHander.handRequest(request);
  }
}
