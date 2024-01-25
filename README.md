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

工厂模式包括  **简单工厂模式、工厂方法模式 和 抽象工厂模式**  。这三种模式都属于工厂模式的范畴。

**抽象工厂模式包含以下几个核心角色**：

- 抽象工厂（Abstract Factory）：声明了一组用于创建产品对象的方法，每个方法对应一种产品类型。抽象工厂可以是接口或抽象类。
- 具体工厂（Concrete Factory）：实现了抽象工厂接口，负责创建具体产品对象的实例。
- 抽象产品（Abstract Product）：定义了一组产品对象的共同接口或抽象类，描述了产品对象的公共方法。
- 具体产品（Concrete Product）：实现了抽象产品接口，定义了具体产品的特定行为和属性。

|                           工厂模式                           |                             概述                             |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| [简单工厂模式](https://github.com/xupengboo/DesignPatterns/tree/main/1.%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F) | 非常简易的创建型设计模式，它并不属于23种经典设计模式中的一种。 |
| [工厂方法模式](https://github.com/xupengboo/DesignPatterns/tree/main/1.%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F) | 定义了一个用于创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法使得一个类的实例化延迟到其子类。 |
| [抽象工厂模式](https://github.com/xupengboo/DesignPatterns/tree/main/1.%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F) | 提供了一个 接口/抽象类 用于创建相关或依赖对象的家族，而不需要明确指定具体类。抽象工厂模式是工厂方法模式的推广，它引入了多个工厂接口，用于创建一系列相关或相互依赖的产品。 |

# 2. 单例模式

官方定义：单例模式（singleton pattern）是一种创建型设计模式，它确保一个类只有一个实例，并提供了一个全局访问点来访问该实例。

关键信息： **将类的实例化过程限制为一个实例，并提供一个全局访问点** 。

单例模式包括  **懒汉式、饿汉式、双检锁、静态内部类 和 枚举方式**  。

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

# 3. 建造者模式

官方定义：建造者模式（builder pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。**建造者模式适用于构建具有复杂结构的对象，其构建过程较为稳定，但对象的表示需要灵活变化的情况。**

关键信息：**多个简单的对象一步一步构建成一个复杂的对象(将一个复杂对象的构建过程与其表示相分离，使得同样的构建过程可以创建不同的表示)**。

建造者模式可以细分为：**标准建造者模式、可配置的建造者模式 和 链式调用的建造者模式**。

> 🔍Tips：可以配合 [菜鸟教程 - 建造者模式](https://www.runoob.com/design-pattern/builder-pattern.html) 来进行学习。

**建造者模式通常包含以下几个核心角色**：

- 产品类（Product）：表示被构建的复杂对象。通常包含多个部分，这些部分的具体组成可以灵活变化。

- 抽象建造者（Builder）： 声明构建产品各个部分的抽象方法，是构建过程的接口。

- 具体建造者（Concrete Builder）： 实现抽象建造者接口，负责具体的构建过程，即如何构建各个部分。

- 指导者（Director）： 负责调用具体建造者来构建产品对象，通常包含构建的具体步骤。

| 建造者模式           | 概述                                                         |
| -------------------- | ------------------------------------------------------------ |
| 标准建造者模式       | 将一个复杂对象（产品）的构建过程与其表示分离，使得同样的构建过程可以创建不同的表示 |
| 可配置的建造者模式   | 允许客户端在构建产品时进行更灵活的配置，通过提供一系列的配置方法来实现。 |
| 链式调用的建造者模式 | 通过 `return this` 实现的链式调用效果。                      |

