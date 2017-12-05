package com.javastar920905.abstractfactory.v2.user;

import com.javastar920905.abstractfactory.v1.User;
import com.javastar920905.abstractfactory.v2.user.IUserService;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class AccessUserService implements IUserService {
  @Override
  public void insert(User user) {
    System.out.println("在access 中插入一条user记录 ");

  }

  @Override
  public User getUser(int id) {
    System.out.println("从access数据库获取一条id=xx的记录");
    return null;
  }
}
