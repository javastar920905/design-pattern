# design-pattern
[readme.md 常用语法](https://www.cnblogs.com/zachary93/p/6106829.html)  
两个空格=换行  
"#" 多级标题  
"![Alt text](/path/to/img.jpg)" 贴图片  
"使用制表符或者至少4个空格进行缩进的行" 写代码  
"分割线 * - " 
## 模块说明
### bit-talk-design-pattern 
是阅读大话设计模式的摘抄代码 

大话设计模式,以日常故事场景引入设计模式,内容生动有趣,尤其是第一章节引入入胜

大话设计模式 http://url.cn/5Rsas3b

好玩的java设计模式 http://url.cn/5wuTMvH

### runoob 
是菜鸟教程学习时候的代码(时间久远,需要重新梳理)

首次接触设计模式,就是菜鸟教程上面学习的,菜鸟教程很适合薪水学习,以及当做常用查询手册使用
### vip-lesson 
报名一个java架构vip班的课程中,关于spring源码分析时涉及到的常用设计模式

新报名的课程,持续学习中
## 其他说明
新手学设计模式,代码都是直接摘抄,并非原创,记录下来供自己回顾 (代码搬运工)

如果有兴趣一起学习交流的,可以和我邮箱联系 javastar920905@163.com 

## 设计模式好处
1 个人感觉学习设计模式后,能让自己体会到代码的优美,当然最主要的还是教我们如何用面向对象思想
写出可维护以及可扩展性强的程序.

2 每个开源框架设计时都用到了设计模式,这样阅读源码时就知道作者为什么要这么写了

3 项目代码重构,个人参与的项目中,新增功能感觉很难了,需要学习设计模式,重构项目,是的项目的可扩展性和可维护性提高
重构前还打算看完这本书: 重构改善既有代码的设计 http://url.cn/5QD07yh  (其中测试先行的理念表示很赞同,但是一直不知道如何写好测试)

## 设计模式总结
...
设计模式分类 http://www.runoob.com/design-pattern/design-pattern-intro.html
### 枚举的使用教程
https://github.com/javastar920905/design-pattern/blob/master/vip-lesson/src/main/java/com/javastar920905/factory/CarEnum.java

### 策略模式场景解析
https://github.com/javastar920905/design-pattern/tree/master/bit-talk-design-pattern/src/main/java/com/javastar920905/strategy/v4

### 简单工厂+反射示例
https://github.com/javastar920905/design-pattern/blob/master/vip-lesson/src/main/java/com/javastar920905/factory/simple/SimpleCarFactory.java

### 抽象工厂 (...还需补充)
https://github.com/javastar920905/design-pattern/tree/master/vip-lesson/src/main/java/com/javastar920905/factory

### 代理模式 
https://github.com/javastar920905/design-pattern/tree/master/vip-lesson/src/main/java/com/javastar920905/proxy/cglib



## 重构指南
### 什么时候重构?
不要为了重构而重构,反对专门拨出时间进行重构
* 而是当你想添加功能的时候,发现添加功能困难,这时候考虑重构 (其实添加功能时,没有这么多时间给你重构, 妥协一下,开发完以后TODO 任务上线后来重构)
* 修补错误时重构
* 代码审查时重构
### 重构从哪些方面下手
检查方法,冗长的方法,思考可能要拓展的地方 (如:输出分离, 业务逻辑新增或者变化是否能够应付) http://url.cn/5QD07yh 
* 重复代码
* 过长函数
* 过大的类
* 过长的参数咧
* 容易维护和扩展
* 过多的注释说明方法不够小
### 重构思路
* 为即将修改的代码建立一组可靠的测试环境;每个小改动都测试一下,容易定位问题 (人都有可能犯错,需要可靠的测试保证)
* 抽离冗长的方法 if switch 
* 名字不好也要重构
* 考虑代码块是否放对位置
* 接口设计的不好也重构
* 运用设计模式
### 构建单元测试体系
* 需要花费相当长时间,系统不能停止运行来重构,需要今天一点点,明天一点点

有效的单元测试: https://yuedu.baidu.com/ebook/af87fb5f03768e9951e79b89680203d8ce2f6ae7?fr=aladdin&key=%E6%9C%89%E6%95%88%E7%9A%84%E5%8D%95%E5%85%83%E6%B5%8B%E8%AF%95&f=read

* 不追求100% 测试覆盖率
* (??)先写一个会失败（很明显是这样的测试),再写足够使测试通过的代码,然后写另一个失败的测试,他重复这个循环直到完成任务
* 测试作为一种设计代码的方式,提出了具体的目的
* bug成本: 引入一个bug:5美元, 运行构建后:50美元,集成测试后发现:500美元,系统测试阶段:5000美元


### 大型重构


