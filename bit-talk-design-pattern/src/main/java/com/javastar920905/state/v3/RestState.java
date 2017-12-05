package com.javastar920905.state.v3;

/**
 * Created by ouzhx on 2017/12/5.
 *
 * 休息状态
 */
public class RestState extends WorkState {
  @Override
  public void writeProgram(Work work) {
    System.out.println("当前时间:" + work.getHour() + " 不行了,要睡觉了");
  }
}
