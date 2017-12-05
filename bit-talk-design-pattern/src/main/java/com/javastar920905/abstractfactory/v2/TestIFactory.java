package com.javastar920905.abstractfactory.v2;

import com.javastar920905.abstractfactory.v1.User;
import com.javastar920905.abstractfactory.v2.department.IDepartmentService;
import com.javastar920905.abstractfactory.v2.entity.Department;
import com.javastar920905.abstractfactory.v2.user.IUserService;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class TestIFactory {
  public static void main(String[] args) {
    IFactory factory = new SqlServerFacotry();
    IUserService userService = factory.createUserService();

    userService.insert(new User());
    userService.getUser(1);

    IDepartmentService departmentService = factory.createDepartmentService();
    departmentService.insert(new Department());
    departmentService.getDepartment(1);
  }
}
