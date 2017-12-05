package com.javastar920905.state.v2;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class StateB extends State {
  @Override
  public void handle(Context context) {
    context.setState(new StateA());
  }
}
