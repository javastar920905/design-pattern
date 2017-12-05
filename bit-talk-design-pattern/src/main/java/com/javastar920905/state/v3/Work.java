package com.javastar920905.state.v3;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class Work {
  private WorkState workState;
  private int hour;
  private boolean finish = false;

  public Work() {
    // 默认是上午9点上状态
    this.workState = new MorningState();
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public boolean isFinish() {
    return finish;
  }

  public void setFinish(boolean finish) {
    this.finish = finish;
  }

  public WorkState getWorkState() {
    return workState;
  }

  public void setWorkState(WorkState workState) {
    this.workState = workState;
  }

  public void doWork() {
    System.out.println("继续工作...code");
  }
}
