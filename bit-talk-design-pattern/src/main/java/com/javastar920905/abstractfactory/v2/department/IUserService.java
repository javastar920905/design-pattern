package com.javastar920905.abstractfactory.v2.department;

import com.javastar920905.abstractfactory.v1.User;

/**
 * Created by ouzhx on 2017/12/5.
 */
public interface IUserService {
  public void insert(User user);

  public User getUser(int id);
}
