package com.javastar920905.abstractfactory.v2.department;

import com.javastar920905.abstractfactory.v2.entity.Department;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class AccessDepartmentService implements IDepartmentService {

  @Override
  public void insert(Department department) {
    System.out.println("在access 中插入一条department记录 ");

  }

  @Override
  public Department getDepartment(int id) {
    System.out.println("从access数据库获取一条id=xx的记录");
    return null;
  }
}
