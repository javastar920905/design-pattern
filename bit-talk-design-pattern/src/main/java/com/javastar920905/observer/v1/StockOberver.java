package com.javastar920905.observer.v1;

/**
 * Created by ouzhx on 2017/12/5.
 * 
 * 看股票的同事 (为了不让老板发现,需要前台MM帮忙观察)
 */
public class StockOberver {
  private String name;
  private Secretary secretary;

  public StockOberver(String name, Secretary secretary) {
    this.name = name;
    this.secretary = secretary;
  }

  public void update() {
    System.out.println("");
  }
}
