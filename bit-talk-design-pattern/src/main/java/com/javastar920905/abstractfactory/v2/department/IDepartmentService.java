package com.javastar920905.abstractfactory.v2.department;

import com.javastar920905.abstractfactory.v2.entity.Department;

/**
 * Created by ouzhx on 2017/12/5.
 *
 * 抽象产品2 (为什么设计为抽象: 因为他需要有多种实现,sqlserver和access访问的实现)
 */
public interface IDepartmentService {
  public void insert(Department department);

  public Department getDepartment(int id);
}
