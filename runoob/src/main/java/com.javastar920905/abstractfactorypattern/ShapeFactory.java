package com.javastar920905.abstractfactorypattern;

import com.javastar920905.abstractfactorypattern.shapeimpl.Circle;
import com.javastar920905.abstractfactorypattern.shapeimpl.Rectangle;
import com.javastar920905.abstractfactorypattern.shapeimpl.Square;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class ShapeFactory extends AbstractFactory {
  public static final String circle = "circle";
  public static final String rectangle = "rectangle";
  public static final String square = "square";

  // 获取不同shape的对象,每新增一个新的产品,只需要添加一个对应的产品实现类
  public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase(circle)) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase(rectangle)) {
      return new Rectangle();
    } else if (shapeType.equalsIgnoreCase(square)) {
      return new Square();
    }
    return null;
  }

  Color getColor(String color) {
    return null;
  }

}
