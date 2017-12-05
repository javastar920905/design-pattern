package com.javastar920905.abstractfactory.v3;

import com.javastar920905.abstractfactory.v1.User;
import com.javastar920905.abstractfactory.v2.IFactory;
import com.javastar920905.abstractfactory.v2.SqlServerFacotry;
import com.javastar920905.abstractfactory.v2.department.IDepartmentService;
import com.javastar920905.abstractfactory.v2.entity.Department;
import com.javastar920905.abstractfactory.v2.user.IUserService;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class TestDataAccess {
  public static void main(String[] args) {
    IUserService userService = DataAccess.createUserService();

    userService.insert(new User());
    userService.getUser(1);

    IDepartmentService departmentService = DataAccess.createDepartmentService();
    departmentService.insert(new Department());
    departmentService.getDepartment(1);
  }
}
