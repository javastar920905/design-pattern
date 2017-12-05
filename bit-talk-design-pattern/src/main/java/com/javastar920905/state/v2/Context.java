package com.javastar920905.state.v2;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class Context {
  private State state;

  public Context(State state) {
    this.state = state;
  }


  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void request() {
    state.handle(this);
  }
}
