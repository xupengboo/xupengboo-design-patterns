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

# 1. 工厂模式

官方定义：工厂模式（factory pattern）属于创建型模式，它在创建对象时提供了一种封装机制，将实际创建对象的代码与使用代码分离。

关键信息：**将实际创建对象的代码与使用代码分离**。

工厂模式包括  **简单工厂模式、工厂方法模式和抽象工厂模式**  。这三种模式都属于工厂模式的范畴。

|                           工厂模式                           |                             概述                             |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| [简单工厂模式](https://github.com/xupengboo/DesignPatterns/tree/main/1.%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F) | 非常简易的创建型设计模式，它并不属于23种经典设计模式中的一种。 |
| [工厂方法模式](https://github.com/xupengboo/DesignPatterns/tree/main/1.%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F) | 定义了一个用于创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法使得一个类的实例化延迟到其子类。 |
| [抽象工厂模式](https://github.com/xupengboo/DesignPatterns/tree/main/1.%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F) | 提供了一个 接口/抽象类 用于创建相关或依赖对象的家族，而不需要明确指定具体类。抽象工厂模式是工厂方法模式的推广，它引入了多个工厂接口，用于创建一系列相关或相互依赖的产品。 |

# 2. 单例模式

官方定义：单例模式（singleton pattern）是一种创建型设计模式，它确保一个类只有一个实例，并提供了一个全局访问点来访问该实例。

关键信息： **将类的实例化过程限制为一个实例，并提供一个全局访问点** 。

对于单例模式要考虑以下几个问题：

- **是否懒加载**
- **线程是否安全**
- 防止反射攻击
- 防止序列化和反序列化

总结了一下，有以下几种方式：

| 序号 |                           单例模式                           |                             概述                             |
| :--: | :----------------------------------------------------------: | :----------------------------------------------------------: |
|  1   | [懒汉式](https://github.com/xupengboo/DesignPatterns/tree/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%87%92%E6%B1%89%E5%BC%8F) | [线程安全，效率低](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%87%92%E6%B1%89%E5%BC%8F/%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A8/Singleton.java)、[线程不安全](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%87%92%E6%B1%89%E5%BC%8F/%E7%BA%BF%E7%A8%8B%E4%B8%8D%E5%AE%89%E5%85%A8/Singleton.java) |
|  2   | [饿汉式](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E9%A5%BF%E6%B1%89%E5%BC%8F/Singleton.java) |                 天然线程安全，但不符合懒加载                 |
|  3   | [双检锁/双重校验锁](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E5%8F%8C%E6%A3%80%E9%94%81/Singleton.java) |          线程安全、符合懒加载、效率高，性能强于1，2          |
|  4   | [静态内部类](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E9%9D%99%E6%80%81%E5%86%85%E9%83%A8%E7%B1%BB/Singleton.java) |                  利用静态类实现，性能强于3                   |
|  5   | [枚举方式](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%9E%9A%E4%B8%BE/Singleton.java) |                        目前，最佳方式                        |

# 3. 制造者模式






