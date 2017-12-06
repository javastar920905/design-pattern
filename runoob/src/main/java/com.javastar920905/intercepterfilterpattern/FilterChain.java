package com.javastar920905.intercepterfilterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ouzhx on 2016/12/26.
 *
 *  过滤器链带有多个过滤器，并在 Target 上按照定义的顺序执行这些过滤器。
 */
public class FilterChain {
  private List<Filter> filters = new ArrayList<Filter>();
  private Target target;

  public void addFilter(Filter filter) {
    this.filters.add(filter);
  }

  public void execute(String request) {
    for (Filter filter : filters) {
      filter.execute(request);
    }
    target.execute(request);
  }

  public void setTarget(Target target) {
    this.target = target;
  }
}
