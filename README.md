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
1. 工厂方法模式（Factory Method Pattern）
2. 抽象工厂模式（Abstract Factory Pattern）
3. 单例模式（Singleton Pattern）
4. 建造者模式（Builder Pattern）
5. 原型模式（Prototype Pattern）

**结构型模式（Structural Patterns）**:
1. 适配器模式（Adapter Pattern）
2. 桥接模式（Bridge Pattern）
3. 过滤器模式（Filter Pattern）
4. 组合模式（Composite Pattern）
5. 装饰器模式（Decorator Pattern）
6. 外观模式（Facade Pattern）
7. 享元模式（Flyweight Pattern）
8. 代理模式（Proxy Pattern）

**行为型模式（Behavioral Patterns）**:
1. 责任链模式（Chain of Responsibility Pattern）
2. 命令模式（Command Pattern）
3. 解释器模式（Interpreter Pattern）
4. 迭代器模式（Iterator Pattern）
5. 中介者模式（Mediator Pattern）
6. 备忘录模式（Memento Pattern）
7. 观察者模式（Observer Pattern）
8. 状态模式（State Pattern）
9. 空对象模式
10. 策略模式（Strategy Pattern）
11. 模板方法模式（Template Method Pattern）
12. 访问者模式（Visitor Pattern）



# 1. 工厂模式

官方定义：工厂模式（factory pattern）属于创建型模式，它在创建对象时提供了一种封装机制，将实际创建对象的代码与使用代码分离。

关键信息：**将实际创建对象的代码与使用代码分离**。

工厂模式包括  **简单工厂模式、工厂方法模式 和 抽象工厂模式**  。这三种模式都属于工厂模式的范畴。

**抽象工厂模式包含以下几个核心角色**：

- 抽象工厂（Abstract Factory）：声明了一组用于创建产品对象的方法，每个方法对应一种产品类型。抽象工厂可以是接口或抽象类。
- 具体工厂（Concrete Factory）：实现了抽象工厂接口，负责创建具体产品对象的实例。
- 抽象产品（Abstract Product）：定义了一组产品对象的共同接口或抽象类，描述了产品对象的公共方法。
- 具体产品（Concrete Product）：实现了抽象产品接口，定义了具体产品的特定行为和属性。

| 工厂模式                                                     | 概述                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
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

| 序号 | 单例模式                                                     | 概述                                                         |
| :--: | ------------------------------------------------------------ | ------------------------------------------------------------ |
|  1   | [懒汉式](https://github.com/xupengboo/DesignPatterns/tree/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%87%92%E6%B1%89%E5%BC%8F) | [线程安全，效率低](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%87%92%E6%B1%89%E5%BC%8F/%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A8/Singleton.java) 、 [线程不安全](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%87%92%E6%B1%89%E5%BC%8F/%E7%BA%BF%E7%A8%8B%E4%B8%8D%E5%AE%89%E5%85%A8/Singleton.java) |
|  2   | [饿汉式](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E9%A5%BF%E6%B1%89%E5%BC%8F/Singleton.java) | 天然线程安全，但不符合懒加载                                 |
|  3   | [双检锁/双重校验锁](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E5%8F%8C%E6%A3%80%E9%94%81/Singleton.java) | 线程安全、符合懒加载、效率高，性能强于1，2                   |
|  4   | [静态内部类](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E9%9D%99%E6%80%81%E5%86%85%E9%83%A8%E7%B1%BB/Singleton.java) | 利用静态类实现，性能强于3                                    |
|  5   | [枚举方式](https://github.com/xupengboo/DesignPatterns/blob/main/2.%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%9E%9A%E4%B8%BE/Singleton.java) | 目前，最佳方式                                               |

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

| 建造者模式                                                   | 概述                                                         |
| :----------------------------------------------------------- | :----------------------------------------------------------- |
| [标准建造者模式](https://github.com/xupengboo/DesignPatterns/tree/main/3.%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%A0%87%E5%87%86%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F) | 将一个复杂对象（产品）的构建过程与其表示分离，使得同样的构建过程可以创建不同的表示 |
| [可配置的建造者模式](https://github.com/xupengboo/DesignPatterns/tree/main/3.%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E5%8F%AF%E9%85%8D%E7%BD%AE%E7%9A%84%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F) | 允许客户端在构建产品时进行更灵活的配置，通过提供一系列的配置方法来实现。 |
| [链式调用的建造者模式](https://github.com/xupengboo/DesignPatterns/tree/main/3.%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E9%93%BE%E5%BC%8F%E8%B0%83%E7%94%A8%E7%9A%84%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F) | 通过 `return this` 实现的链式调用效果。                      |

> 🔍Tips：**建造者模式与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。**

# 4. 原型模式

官方定义：原型模式（prototype-pattern）是一种创建型设计模式，其主要目的是通过复制现有对象来创建新的对象，而不是通过实例化来创建。**原型模式适用于需要创建多个相似对象，但又不想通过耗费大量时间和资源的实例化过程来创建这些对象的情况。**


关键信息：**用于创建重复的对象，同时又能保证性能**。

原型模式主要分为两种类型：**浅克隆[^1]** 和 **深克隆[^2]**，也可以说成 浅拷贝 和 深拷贝。

[^1]: 在浅克隆中，只复制对象本身和其基本数据类型的字段。对于对象内部的引用类型字段，仍然使用原始对象内部的引用。这意味着原始对象和克隆对象共享相同的引用类型字段，对其中一个对象进行修改可能会影响到另一个对象。在Java中，可以通过实现`Cloneable`接口并覆写`clone`方法来实现浅克隆。默认的`clone`方法是浅克隆的。
[^2]: 在深克隆中，不仅复制对象本身和其基本数据类型的字段，还会递归地复制对象内部的引用类型字段。这意味着原始对象和克隆对象的引用类型字段是相互独立的，对其中一个对象进行修改不会影响到另一个对象。深克隆通常需要使用序列化和反序列化、手动递归复制对象等方式来确保所有的引用类型字段都被正确复制。

原型模式核心就是 **克隆操作**。

**在 Java 中，实现 浅克隆 方式有以下几种：**

- 可以通过实现 `Cloneable` 接口并重写 `clone` 方法来实现。`Object` 类中的 `clone` 方法是一个浅拷贝方法。
- 使用拷贝构造方法：

```java
class MyClass {
    private int primitiveField;
    private AnotherObject referenceField;

    // 拷贝构造方法
    public MyClass(MyClass original) {
        this.primitiveField = original.primitiveField;
        this.referenceField = original.referenceField;
    }
}
```

**在Java中，实现 深克隆 方式有以下几种**：

- 使用序列化和反序列化。

  > 🔍注意：对象及其所有引用类型字段都需要实现 `Serializable` 接口。

- 手动递归复制

- 使用第三方库

| 原型模式                                                     | 概述                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [浅克隆（浅拷贝）](https://github.com/xupengboo/DesignPatterns/tree/main/4.%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%B5%85%E5%85%8B%E9%9A%86) | 实现Cloneable接口，重写Clone方法。                           |
| [深克隆（深拷贝）](https://github.com/xupengboo/DesignPatterns/tree/main/4.%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E6%B7%B1%E5%85%8B%E9%9A%86) | 实现Serializable接口，将对象序列化为字节流，再进而将字节流反序列化为对象。 |

# 5. 适配器模式

官方定义：适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。

关键信息：**通过将一个类的接口转换成客户端期望的接口，使得原本由于接口不匹配而无法协同工作的类能够协同工作。适配器充当一个中间层，解决了不同接口之间的兼容性问题。**

适配器模式通常有两种实现方式：**类适配器模式 和 对象适配器模式**。

**适配器模式主要包含以下几个角色**：

1. 目标接口（Target）： 定义客户端代码期望的接口，是客户端通过适配器调用的接口。
2. 适配器（Adapter）： 实现目标接口，并持有一个需要被适配的对象，负责把目标接口适配为被适配者接口。
3. 被适配者（Adaptee）： 拥有一个不符合目标接口的接口，是需要被适配的类。

| 适配器模式                                                   | 概述                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [类适配器模式](https://github.com/xupengboo/design-patterns/tree/main/5.%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E7%B1%BB%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F) | 通过继承被适配者类来实现适配器。适配器类既继承了目标接口，又持有了被适配者类的实例。 |
| [对象适配器模式](https://github.com/xupengboo/design-patterns/tree/main/5.%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo/%E5%AF%B9%E8%B1%A1%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F) | 通过组合被适配者类的实例来实现适配器。适配器类持有被适配者类的实例，并实现了目标接口。 |

**适配器缺点**：过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现。

> 🔍Tips：可以配合 [菜鸟教程 - 适配器模式](https://www.runoob.com/design-pattern/adapter-pattern.html) 来进行学习。

# 6. 桥接模式

官方定义：桥接模式（bridge-pattern）是一种结构型设计模式，它将抽象部分与实现部分分离，使它们可以独立变化而互不影响。桥接模式通过组合的方式，将抽象部分和实现部分分别设计，并通过一个桥接接口（Bridge）将它们连接起来。

关键信息：**桥接模式通过组合的方式，将抽象部分和实现部分分别设计，并通过一个桥接接口（Bridge）将它们连接起来。**

桥接模式的主要目的是 **避免在抽象层次和实现层次之间使用多层继承，从而使系统更加灵活、可扩展，且更容易维护。**

这种设计模式通常用于处理多维度变化的场景，例如 在图形系统中，形状和颜色可以独立变化，桥接模式可以帮助将这两个维度分离开来。

**桥接模式主要包含以下几个角色**：

1. 抽象类（Abstraction）： 定义抽象部分的接口，并维护一个对实现部分的引用。通常包含一个桥接接口的实例。
2. 扩展抽象类（RefinedAbstraction）：扩展抽象类，实现抽象部分的具体功能。它通常通过调用桥接接口中的方法来完成工作。
3. 实现接口（Implementor）： 定义实现部分的接口，通常包含一组方法。这个接口与抽象部分的接口可以不一样，但是通过桥接接口进行连接。
4. 具体实现类（ConcreteImplementor）： 实现实现部分的具体功能。具体实现类的方法将被扩展抽象类调用，完成实际的业务逻辑。

| 桥接模式                                                     | 概述                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [桥接](https://github.com/xupengboo/design-patterns/tree/main/6.%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo) | 将抽象部分与实现部分分离，使它们都可以独立的变化。举个例子：创建不同颜色的圆形，颜色就可以理解为抽象部分，圆形就是实现部分。 |

# 7. 过滤器模式

官方定义：过滤器模式（filter-pattern）是一种结构型设计模式，它允许通过一系列条件来过滤集合中的元素，从而实现对集合的筛选和过滤。过滤器模式将过滤逻辑封装在一个独立的过滤器对象中，使得过滤条件可以独立变化，同时还能保持对集合的操作封装和简化。


关键信息：**实现对集合的筛选和过滤。**

**过滤器模式主要包含以下几个角色**：

1. 过滤器接口（Filter）： 定义了过滤器对象的接口，通常包含一个过滤方法，用于对集合进行过滤。
2. 具体过滤器类（Concrete Filter）： 实现了过滤器接口，包含了具体的过滤逻辑。不同的具体过滤器类可以实现不同的过滤条件。
3. 过滤器链（Filter Chain）： 将多个过滤器对象串联起来，形成一个过滤器链。过滤器链可以按照一定的顺序依次对集合进行过滤。
4. 目标对象（Target）： 需要被过滤的集合对象。过滤器模式通常用于对集合进行筛选和过滤。

| 过滤器模式                                                   | 概述                                                  |
| ------------------------------------------------------------ | ----------------------------------------------------- |
| [过滤器](https://github.com/xupengboo/design-patterns/tree/main/7.%E8%BF%87%E6%BB%A4%E5%99%A8%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo) | 实现对集合的筛选和过滤，以对 Person类 人员过滤 为例。 |

# 8. 组合模式

官方定义：组合模式（composite-pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。

关键信息：**将对象组合成树形结构以表示“部分-整体”的层次结构。**

**组合模式的核心角色包括：**

- 组件（Component）： 定义了组合中的对象的接口，可以是抽象类或者接口。组件类通常包含一些用于管理子组件的方法，例如添加、删除、获取子组件等。

- 叶子节点（Leaf）： 表示组合中的叶子节点，它没有子节点。叶子类通常是组合中的最小单元，它实现了组件接口的方法。
- 容器（Composite，也可以叫做 复合节点。）： 表示组合中的容器节点，它可以包含子节点。容器类通常是组合中的非叶子节点，它实现了组件接口的方法，并且包含了一个用于保存子节点的集合。

| 组合模式                                                     | 概述                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [组合模式](https://github.com/xupengboo/design-patterns/tree/main/8.%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F/src/main/java/com/xupengboo) | 以 文件系统 为例：叶子节点就是文件File，容器（复合节点）就是文件夹。 |

# 9. 装饰器模式

官方定义：装饰器模式（decorator-pattern）是一种结构型设计模式，它允许在不改变原有对象结构的情况下，动态地给对象添加新的功能。装饰器模式通过将对象包装在一个装饰器对象中，然后在装饰器对象中添加新的行为，从而实现了对原有对象的功能扩展。

关键信息：**它允许在不改变原有对象结构的情况下，动态地给对象添加新的功能（针对某个对象进行功能扩展或者包装）。**

**装饰器模式包含以下几个核心角色：**

- 抽象组件（Component）：定义了原始对象和装饰器对象的公共接口或抽象类，可以是具体组件类的父类或接口。

- 具体组件（Concrete Component）：是被装饰的原始对象，它定义了需要添加新功能的对象。

- 抽象装饰器（Decorator）：继承自抽象组件，它包含了一个抽象组件对象，并定义了与抽象组件相同的接口，同时可以通过组合方式持有其他装饰器对象。

- 具体装饰器（Concrete Decorator）：实现了抽象装饰器的接口，负责向抽象组件添加新的功能。具体装饰器通常会在调用原始对象的方法之前或之后执行自己的操作。

  | 装饰器模式     | 概述                                                        |
  | -------------- | ----------------------------------------------------------- |
  | [装饰器模式]() | 针对某个对象进行功能扩展或者包装，以 给咖啡加牛奶加糖为例。 |

  
