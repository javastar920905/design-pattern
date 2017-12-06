package com.javastar920905.dutychain.v1;

/**
 * Created by ouzhx on 2017/12/6.
 *
 * 员工提交加薪(请假...)申请
 */
public class Request {
  private String requestType;
  private String requestContent;

  public String getRequestType() {
    return requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  public String getRequestContent() {
    return requestContent;
  }

  public void setRequestContent(String requestContent) {
    this.requestContent = requestContent;
  }
}
