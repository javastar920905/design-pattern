package com.javastar920905.abstractfactory.v2;

import com.javastar920905.abstractfactory.v2.department.IDepartmentService;
import com.javastar920905.abstractfactory.v2.department.SqlServerDepartmentService;
import com.javastar920905.abstractfactory.v2.user.IUserService;
import com.javastar920905.abstractfactory.v2.user.SqlServerUserService;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class SqlServerFacotry implements IFactory {
  /**
   * 创建访问User表对象的抽象工厂
   *
   * @return
   */
  @Override
  public IUserService createUserService() {
    return new SqlServerUserService();
  }

  /**
   * 创建和访问部门表的抽象工厂
   *
   * @return
   */
  @Override
  public IDepartmentService createDepartmentService() {
    return new SqlServerDepartmentService();
  }
}
