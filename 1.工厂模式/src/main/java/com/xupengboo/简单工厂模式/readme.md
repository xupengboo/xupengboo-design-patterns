# 简单工厂模式

工厂模式是一种创建型设计模式，它提供了一种创建对象的接口，但是允许子类决定实例化哪个类。这样，客户端代码就不需要在使用时指定它们所需的类，从而使代码更加灵活和可维护。

让我们创建一个简单的工厂模式的案例，假设我们有一个形状（Shape）接口和两个实现类：圆形（Circle）和矩形（Rectangle）。我们将创建一个工厂类（ShapeFactory），根据客户端的要求生成相应的形状对象。

首先，定义形状接口和两个实现类：
```java
// Shape接口
public interface Shape {
    void draw();
}

// Circle类实现Shape接口
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

// Rectangle类实现Shape接口
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
```
接下来，创建一个工厂类，根据客户端的要求返回相应的形状对象：
```java
// ShapeFactory类
public class ShapeFactory {
    // 根据传入的参数创建相应的形状对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }
}
```
现在，我们可以使用工厂模式来创建形状对象，而不用直接实例化它们：
```java
// 使用工厂模式的客户端代码
public class FactoryPatternExample {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 创建圆形对象
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        // 创建矩形对象
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
```
这个例子演示了工厂模式的基本原理。通过使用工厂模式，客户端代码可以在不知道具体类名的情况下创建对象。这提高了代码的灵活性，因为如果需要添加新的形状，只需在工厂类中添加相应的逻辑即可，而不需要修改客户端代码。这符合开闭原则，是设计模式的一个核心概念之一。

