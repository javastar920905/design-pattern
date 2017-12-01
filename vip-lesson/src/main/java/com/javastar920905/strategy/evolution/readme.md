##由一个需求演变 进化到策略模式
###v1 筛选绿苹果
演示一个需求的演变 com.javastar920905.strategy.evolution.FilterApples



优化-使用策略模式修改代码
--
使用策略模式 (把不同的选择运算或算法,封装(称为"策略")): 换句话说，你把 filterApples 方法的行为参数化了
代码包 com.javastar920905.strategy.evolution.did
1 定义接口 com.javastar920905.strategy.evolution.did.ApplePredicate
2 多个子类实现接口,表示将行为封装起来 


