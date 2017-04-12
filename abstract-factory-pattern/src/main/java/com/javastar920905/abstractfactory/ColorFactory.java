package com.javastar920905.abstractfactory;

import com.javastar920905.abstractfactory.colorimpl.Blue;
import com.javastar920905.abstractfactory.colorimpl.Green;
import com.javastar920905.abstractfactory.colorimpl.Red;
import com.javastar920905.abstractfactory.shapeimpl.Circle;
import com.javastar920905.abstractfactory.shapeimpl.Rectangle;
import com.javastar920905.abstractfactory.shapeimpl.Square;

import static com.javastar920905.abstractfactory.ShapeFactory.circle;
import static com.javastar920905.abstractfactory.ShapeFactory.rectangle;
import static com.javastar920905.abstractfactory.ShapeFactory.square;

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
