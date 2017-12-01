package com.javastar920905.observer;

/**
 * Created by ouzhx on 2017/12/1.
 *
 * 多家不同的报纸机构(根据新闻中不同关键字,分别定义不同的行为)
 */
public class NYTimes implements Observer {
  /**
   * 一个观察者接口，它将不同的观察者聚合在一起。
   * <p>
   * 它仅有一个名为 notify 的 方法，一旦接收到一条新的新闻，该方法就会被调用
   *
   * @param tweet
   */
  @Override
  public void notify(String tweet) {
    if (tweet != null && tweet.contains("money")) {
      System.out.println("Breaking news in NY! " + tweet);
    }
  }
}
