package com.javastar920905.builder;

import java.awt.*;

/**
 * Created by ouzhx on 2017/12/5.
 * 
 * 为要创建的产品对象 指定抽象接口
 */
public abstract class PersonBuilder {
  protected Graphics graphics;

  public PersonBuilder(Graphics graphics) {
    this.graphics = graphics;
  }


  public abstract void buildHead();

  public abstract void buildBody();

  public abstract void buildArmLeft();

  public abstract void buildArmRight();

  public abstract void buildLegLeft();

  public abstract void buildLegRight();
}
