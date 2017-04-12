package com.javastar.pattern.demo.factory;

import com.javastar.pattern.demo.factory.impl.Circle;
import com.javastar.pattern.demo.factory.impl.Rectangle;
import com.javastar.pattern.demo.factory.impl.Square;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class ShapeFactory {
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
}
