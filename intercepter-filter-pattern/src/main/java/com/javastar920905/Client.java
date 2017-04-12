package com.javastar920905;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class Client {
  FilterManager filterManager;

  public void setFilterManager(FilterManager filterManager) {
    this.filterManager = filterManager;
  }

  public void sendRequest(String request) {
    filterManager.filterRequest(request);
  }
}
