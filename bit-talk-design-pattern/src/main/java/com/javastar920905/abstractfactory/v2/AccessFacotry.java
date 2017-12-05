package com.javastar920905.abstractfactory.v2;

import com.javastar920905.abstractfactory.v2.department.AccessDepartmentService;
import com.javastar920905.abstractfactory.v2.department.IDepartmentService;
import com.javastar920905.abstractfactory.v2.user.AccessUserService;
import com.javastar920905.abstractfactory.v2.user.IUserService;

/**
 * Created by ouzhx on 2017/12/5.
 *
 * 专门用于实现access 数据库访问的实现
 */
public class AccessFacotry implements IFactory {
  /**
   * 创建访问User表对象的抽象工厂
   *
   * @return
   */
  @Override
  public IUserService createUserService() {
    return new AccessUserService();
  }

  /**
   * 创建和访问部门表的抽象工厂
   *
   * @return
   */
  @Override
  public IDepartmentService createDepartmentService() {
    return new AccessDepartmentService();
  }
}
