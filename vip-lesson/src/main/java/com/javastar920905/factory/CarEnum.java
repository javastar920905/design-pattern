package com.javastar920905.factory;

/**
 * Created by ouzhx on 2017/12/11.
 *
 * 枚举使用教程 https://www.cnblogs.com/happyPawpaw/archive/2013/04/09/3009553.html
 *
 * 定义汽车枚举类型
 */
public enum CarEnum {
  /** 使用方式1 常量 **/
  andi("com.javastar920905.factory.Audi", "奥迪"), benz("com.javastar920905.factory.Benz",
      "奔驰"), bmw("com.javastar920905.factory.BMW", "宝马");

  private String value;
  private String name;

  /** 定义构造函数 目的是和方式1的 data(value)类型匹配 **/
  CarEnum(String value, String name) {
    this.value = value;
    this.name = name;
  }

  /** 普通方法 **/
  public static String getName(String value) {
    for (CarEnum c : CarEnum.values()) {
      if (c.getValue().equals(value)) {
        return c.name;
      }
    }
    return null;
  }


  /** 用法2 switch **/
  public class GetCar {
    CarEnum type = CarEnum.andi;

    public void change() {
      switch (type) {
        case andi:
          type = CarEnum.andi;
          break;
        case benz:
          type = CarEnum.benz;
          break;
        case bmw:
          type = CarEnum.bmw;
          break;
      }
    }
  }

  /** getter setter **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
