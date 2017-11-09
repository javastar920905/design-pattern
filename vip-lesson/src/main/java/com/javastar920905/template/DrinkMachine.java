package com.javastar920905.template;

/**
 * Created by ouzhx on 2017/11/9. 冲饮料
 * 
 * 流程相同,具体细节不同(比如饮料制作流程)
 */
public abstract class DrinkMachine {
  // 不能重写
  public final void create() {
    // 1 把水烧开
    boilWater();
    // 2 准备备注,放入原材料 X
    dropCup();
    // 3 用水冲泡
    brew();
    // 4 添加作料 Y
    addCondiment();
  }

  public abstract void dropCup();

  public abstract void addCondiment();

  public void brew() {
    System.out.println("用开水冲泡");
  }

  public void boilWater() {
    System.out.println("烧开水,直到100度倒出热开水");
  }
}
