# 引用好玩的java设计模式  http://url.cn/5wuTMvH

# 场景
刘备要到江东娶老婆了,诸葛亮给赵云(伴郎)三个锦囊妙计

## 设计模式涉及 3个角色
先说这个场景中的要素：三个妙计，一个锦囊，一个赵云(妙计是放置在锦囊里面,赵云就是一个干活的人)

### 三个妙计是同一个类型的东西 (用接口和抽象类表示)
public abstract class IStrategy {
  public abstract void algorithm();
}
IStrategy,每个妙计都是一个可执行的算法  n个妙计就有n个实现类

### 三个妙计是有了，那需要有个地方放这些妙计呀，放锦囊呀
public class StrategeContext {
  IStrategy strategy;

  public void algorithm() {
    strategy.algorithm();
  }
}

### 伴郎使用妙计
public static void main(String[] args) {
    StrategeContext context;
    context = new StrategeContext(new StrategyA());
    context.algorithm();

    context = new StrategeContext(new StrategyB());
    context.algorithm();
  }
