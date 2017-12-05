package com.javastar920905.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ouzhx on 2017/12/5. 公司前台
 */
public class Secretary {
  private List<StockOberver> observers = new ArrayList<>();
  private String action;

  /**
   * 有几个同事委托前台帮忙 留意boss
   * 
   * @param oberver
   */
  public void addObserver(StockOberver oberver) {
    observers.add(oberver);
  }

  // 通知同事
  public void notifyMsg() {
    observers.stream().forEach(oberver -> oberver.update());
  }

  /** 前台通过电话说的内容 **/
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }
}
