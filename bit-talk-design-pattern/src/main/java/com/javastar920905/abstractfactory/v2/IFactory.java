package com.javastar920905.abstractfactory.v2;

import com.javastar920905.abstractfactory.v2.department.IDepartmentService;
import com.javastar920905.abstractfactory.v2.user.IUserService;

/**
 * Created by ouzhx on 2017/12/5.
 *
 * (抽象工厂接口)定义所有的产品创建的抽象方法
 * 
 * 抽象工厂好处: 方便替换产品系列
 */
public interface IFactory {
  /**
   * 创建访问User表对象的抽象工厂
   * 
   * @return
   */
  IUserService createUserService();


  /**
   * 创建和访问部门表的抽象工厂
   * 
   * @return
   */
  IDepartmentService createDepartmentService();
}
