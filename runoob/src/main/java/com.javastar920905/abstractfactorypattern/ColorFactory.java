package com.javastar920905.abstractfactorypattern;

import com.javastar920905.abstractfactorypattern.colorimpl.Blue;
import com.javastar920905.abstractfactorypattern.colorimpl.Green;
import com.javastar920905.abstractfactorypattern.colorimpl.Red;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class ColorFactory extends AbstractFactory {
  public static final String red = "red";
  public static final String green = "green";
  public static final String blue = "blue";

  // 获取不同shape的对象,每新增一个新的产品,只需要添加一个对应的产品实现类
  public Shape getShape(String shapeType) {
    return null;
  }

  Color getColor(String color) {
    if (color == null) {
      return null;
    }
    if (color.equalsIgnoreCase(red)) {
      return new Red();
    } else if (color.equalsIgnoreCase(green)) {
      return new Green();
    } else if (color.equalsIgnoreCase(blue)) {
      return new Blue();
    }
    return null;
  }

}
