package com.javastar920905.state.v1;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class Work {
  private int hour;
  private boolean finish = false;

  public void writeProgram() {
    if (hour < 12) {
      System.out.println("当前时间" + hour + " 中午 精神百倍!");
    } else if (hour < 13) {
      System.out.println("当前时间:" + hour + " 饿了,午饭, 午休");
    } else if (hour < 17) {
      System.out.println("当前时间" + hour + " 状态还不错,继续努力");
    } else {
      if (finish) {
        System.out.println("任务完成" + finish + " 可以下班回家了");
      } else {
        // ...
        System.out.println("当前时间" + hour + " 又累又饿的加班");
      }
    }
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

  public static void main(String[] args) {
    // 紧急项目
    Work emergencyWork = new Work();
    emergencyWork.setHour(9);
    emergencyWork.writeProgram();

    emergencyWork.setHour(12);
    emergencyWork.writeProgram();

    emergencyWork.setHour(17);
    emergencyWork.writeProgram();

    // emergencyWork.setFinish(true);
    emergencyWork.setFinish(false);

    emergencyWork.setHour(19);
    emergencyWork.writeProgram();
  }
}
