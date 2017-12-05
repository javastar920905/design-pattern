package com.javastar920905.abstractfactory.v3;

import com.javastar920905.abstractfactory.v2.department.AccessDepartmentService;
import com.javastar920905.abstractfactory.v2.department.IDepartmentService;
import com.javastar920905.abstractfactory.v2.department.SqlServerDepartmentService;
import com.javastar920905.abstractfactory.v2.user.AccessUserService;
import com.javastar920905.abstractfactory.v2.user.IUserService;
import com.javastar920905.abstractfactory.v2.user.SqlServerUserService;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class DataAccess {
  /**
   * 数据库类型配置
   */
  private static final String db = "sqlServer";

  // private static final String db="access";


  public static IUserService createUserService() {

    switch (db) {
      case "sqlServer":
        return new SqlServerUserService();
      case "access":
        return new AccessUserService();
    }

    //TODO 这一段代码使用反射优化 ,字符串new对象
    String className = db + "UserService";
    return null;
  }

  public static IDepartmentService createDepartmentService() {
    switch (db) {
      case "sqlServer":
        return new SqlServerDepartmentService();
      case "access":
        return new AccessDepartmentService();
    }
    return null;
  }
}
