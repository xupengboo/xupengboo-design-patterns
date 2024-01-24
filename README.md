# DesignPatterns

本项目通过构建一个个maven项目梳理案例，来针对性的展示学习每一种设计模式。

构建mvn项目命令，如下：

```powershell
mvn archetype:generate -DgroupId=com.xupengboo -DartifactId=xxx -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

# 设计模式 介绍

设计模式是一种在软件设计中经常使用的通用解决方案，它们帮助解决常见问题并促使代码更具可维护性和可扩展性。

**Java中有23种经典的设计模式，它们分为三大类：创建型模式、结构型模式和行为型模式。**

**创建型模式（Creational Patterns）**:

1. 单例模式（Singleton Pattern）
2. 工厂方法模式（Factory Method Pattern）
3. 抽象工厂模式（Abstract Factory Pattern）
4. 建造者模式（Builder Pattern）
5. 原型模式（Prototype Pattern）

**结构型模式（Structural Patterns）**:
1. 适配器模式（Adapter Pattern）
2. 桥接模式（Bridge Pattern）
3. 装饰器模式（Decorator Pattern）
4. 组合模式（Composite Pattern）
5. 外观模式（Facade Pattern）
6. 享元模式（Flyweight Pattern）
7. 代理模式（Proxy Pattern）

**行为型模式（Behavioral Patterns）**:

1. 策略模式（Strategy Pattern）
2. 模板方法模式（Template Method Pattern）
3. 观察者模式（Observer Pattern）
4. 迭代器模式（Iterator Pattern）
5. 责任链模式（Chain of Responsibility Pattern）
6. 命令模式（Command Pattern）
7. 备忘录模式（Memento Pattern）
8. 状态模式（State Pattern）
9. 访问者模式（Visitor Pattern）
10. 中介者模式（Mediator Pattern）
11. 解释器模式（Interpreter Pattern）



# 1. 工厂模式(factory-pattern)

工厂模式包括 **简单工厂模式、工厂方法模式和抽象工厂模式** 。这三种模式都属于工厂模式的范畴。

