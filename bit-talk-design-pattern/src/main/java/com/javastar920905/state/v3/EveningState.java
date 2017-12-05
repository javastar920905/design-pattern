package com.javastar920905.state.v3;

/**
 * Created by ouzhx on 2017/12/5.
 *
 * 晚上工作状态
 */
public class EveningState extends WorkState {
  @Override
  public void writeProgram(Work work) {
    if (work.getHour() < 22) {
      System.out.println("当前时间:" + work.getHour() + " 精神饱满");
    } else {
      work.setWorkState(new RestState());
      work.doWork();
    }
  }
}
