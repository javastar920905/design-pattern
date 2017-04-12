package com.javastar920905.filterimpl;

import com.javastar920905.Filter;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class AuthorizenFilter implements Filter {
  public void execute(String request) {
    System.out.println("AuthorizenFilter :" + request);
  }
}
