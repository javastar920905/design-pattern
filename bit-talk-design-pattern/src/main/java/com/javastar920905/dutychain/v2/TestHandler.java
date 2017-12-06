package com.javastar920905.dutychain.v2;

import com.javastar920905.dutychain.v1.Request;

/**
 * Created by ouzhx on 2017/12/6.
 */
public class TestHandler {
  public static void main(String[] args) {
    Handler h1 = new Manage1Handler();
    Handler h2 = new Manage2Handler();
    Handler boss = new BossHandler();

    // 设置责任链
    h1.setNextHander(h2);
    h2.setNextHander(boss);

    // 员工提交申请
    Request request = new Request();
    request.setRequestType("请假");
    request.setRequestContent("半天以内");
    h1.handRequest(request);

  }
}
