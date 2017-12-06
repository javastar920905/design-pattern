package com.javastar920905.dutychain.v2;

import com.javastar920905.dutychain.v1.Request;

/**
 * Created by ouzhx on 2017/12/6.
 */
public abstract class Handler {
  protected Handler nextHander;

  /**
   * 设置直接上级领导
   * 
   * @param
   */
  public void setNextHander(Handler hander) {
    this.nextHander = hander;
  }

  public abstract void handRequest(Request request);
}
