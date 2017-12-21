package com.javastar920905.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ouzhx on 2017/12/11.
 *
 * 枚举使用教程 https://www.cnblogs.com/happyPawpaw/archive/2013/04/09/3009553.html
 *
 * 定义汽车枚举类型
 */
public interface EnumConstants {

  class ListUtil {
    private ListUtil() {}

    /**
     * 文章来源 logo列表
     */
    public static List<Map<String, String>> carList = new ArrayList<>();

    static {
      // 将枚举类的成员封装为列表
      Arrays.stream(EnumConstants.CarEnum.values()).forEach(source -> {
        Map<String, String> sourceMap = new HashMap<>(1);
        sourceMap.put(source.getName(), source.getValue());
        carList.add(sourceMap);
      });
    }

    public static void main(String[] args) {
      System.out.println(carList.size());
      ListUtil.carList
          .forEach(map -> System.out.println(map.keySet().toString() + "  value=" + map.values()));
      
      /*
       * [奥迪] value=[com.javastar920905.factory.Audi]
       * [奔驰] value=[com.javastar920905.factory.Benz]
       * [宝马] value=[com.javastar920905.factory.BMW]
       */

    }
  }

  enum CarEnum implements EnumConstants {
    /**
     * 使用方式1 常量
     **/
    andi("奥迪", "com.javastar920905.factory.Audi"), benz("奔驰",
        "com.javastar920905.factory.Benz"), bmw("宝马", "com.javastar920905.factory.BMW");

    private String name;
    private String value;

    /**
     * 定义构造函数 目的是和方式1的 data(name,value)类型匹配
     **/
    CarEnum(String name, String value) {
      this.name = name;
      this.value = value;
    }

    /**
     * 普通方法
     **/
    public static String getName(String value) {
      for (CarEnum c : CarEnum.values()) {
        if (c.getValue().equals(value)) {
          return c.name;
        }
      }
      return null;
    }


    /**
     * 用法2 switch
     **/
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

    /**
     * getter setter
     **/
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
}
