package com.javastar920905.abstractfactory.v1;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class SqlServerUser {
  public void insert(User user) {
    System.out.println("在serversql表中插入一条user记录 ");
  }

  public User getUser(int id) {
    System.out.println("从数据库获取一条id=xx的记录");
    return null;
  }

  public static void main(String [] args){
   SqlServerUser sqlServerUser=new SqlServerUser();
   sqlServerUser.insert(new User());
   sqlServerUser.getUser(99);


  }
}
