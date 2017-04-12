package com.javastar920905;

/**
 * Created by ouzhx on 2016/12/26. 过滤管理器（Filter Manager） - 过滤管理器管理过滤器和过滤器链。
 */
public class FilterManager {
  FilterChain filterChain;

  public FilterManager(Target target) {
    filterChain = new FilterChain();
    filterChain.setTarget(target);
  }

  public void setFilter(Filter filter) {
    filterChain.addFilter(filter);
  }

  public void filterRequest(String request) {
    filterChain.execute(request);
  }
}
