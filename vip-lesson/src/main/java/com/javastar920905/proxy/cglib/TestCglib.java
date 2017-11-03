package com.javastar920905.proxy.cglib;

/**
 * Created by Administrator on 2017/11/3.
 */
public class TestCglib {
  public static void main(String[] args) {
    Ouou proxyObj = (Ouou) new Meipo().getInstance(Ouou.class);
    proxyObj.findLove();

  }
}
