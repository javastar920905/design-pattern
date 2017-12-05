package com.javastar920905.state.v2;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class TestState {
  public static void main(String[] args) {
    // 一个对象的行为取决于他的状态,必须根据状态改变自己行为 --考虑使用状态模式
    Context context = new Context(new StateA());
    // 不断请求同时更改状态
    context.request();
    context.request();
    context.request();
    context.request();

  }
}
