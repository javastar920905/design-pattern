package com.javastar920905.abstractfactory.v2.user;

import com.javastar920905.abstractfactory.v1.User;

/**
 * Created by ouzhx on 2017/12/5.
 *
 * 抽象产品1 (为什么设计为抽象: 因为他需要有多种实现,sqlserver和access访问的实现)
 */
public interface IUserService {
  public void insert(User user);

  public User getUser(int id);
}
