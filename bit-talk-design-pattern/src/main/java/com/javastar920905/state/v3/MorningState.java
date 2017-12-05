package com.javastar920905.state.v3;

/**
 * Created by ouzhx on 2017/12/5.
 *
 * 早晨工作状态
 */
public class MorningState extends WorkState {
  @Override
  public void writeProgram(Work work) {
    if (work.getHour() < 12) {
      System.out.println("当前时间:" + work.getHour() + " 精神饱满");
    } else {
      // 超过 12点 则转为中午工作状态
      work.setWorkState(new NoonState());
      work.doWork();
    }
  }
}
