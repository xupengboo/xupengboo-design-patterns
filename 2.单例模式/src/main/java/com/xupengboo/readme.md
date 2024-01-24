# 单例模式

官方定义：单例模式是一种创建型设计模式，它确保一个类只有一个实例，并提供了一个全局访问点来访问该实例。

所以，就记住实现单例模式的关键是 **`将类的实例化过程限制为一个实例，并提供一个全局访问点`** 。

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

> 🚨Tips：没一种方式的原理详解都写在了代码备注中！



