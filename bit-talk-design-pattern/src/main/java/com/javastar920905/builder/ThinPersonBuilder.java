package com.javastar920905.builder;

import java.awt.*;

/**
 * Created by ouzhx on 2017/12/5.
 */
public class ThinPersonBuilder extends PersonBuilder {
  public ThinPersonBuilder(Graphics graphics) {
    super(graphics);
  }

  @Override
  public void buildHead() {
    System.out.println("瘦个子头部");
  }

  @Override
  public void buildBody() {
    System.out.println("瘦个子身体");
  }

  @Override
  public void buildArmLeft() {
    System.out.println("瘦个子左手");
  }

  @Override
  public void buildArmRight() {
    System.out.println("瘦个子右手");
  }

  @Override
  public void buildLegLeft() {
    System.out.println("瘦个子左脚");
  }

  @Override
  public void buildLegRight() {
    System.out.println("瘦个子右脚");
  }
}
