package com.javastar920905.state.v3;

/**
 * Created by ouzhx on 2017/12/5.
 *
 * 中文工作状态
 */
public class NoonState extends WorkState {
  @Override
  public void writeProgram(Work work) {
    if (work.getHour() < 18) {
      System.out.println("当前时间:" + work.getHour() + " 精神饱满");
    } else {
      // 下班状态
      work.setWorkState(new EveningState());
      work.doWork();
    }
  }
}
