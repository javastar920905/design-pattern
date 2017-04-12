package com.javastar.pattern.demo.factory;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class ShapeTest {
  public static void main(String[] args) {
    ShapeFactory factory = new ShapeFactory();
    Shape shape = factory.getShape(ShapeFactory.circle);
    shape.draw();
    Shape shape2 = factory.getShape(ShapeFactory.rectangle);
    shape2.draw();
    Shape shape3 = factory.getShape(ShapeFactory.square);
    shape3.draw();
  }
}
