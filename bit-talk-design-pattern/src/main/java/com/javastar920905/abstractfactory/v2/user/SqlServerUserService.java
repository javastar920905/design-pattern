package com.javastar920905.abstractfactory.v2.user;

import com.javastar920905.abstractfactory.v1.User;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class SqlServerUserService implements IUserService {
  @Override
  public void insert(User user) {
    System.out.println("在serversql 中插入一条user记录 ");
  }

  @Override
  public User getUser(int id) {
    System.out.println("从serversql数据库获取一条id=xx的记录");
    return null;
  }
}
