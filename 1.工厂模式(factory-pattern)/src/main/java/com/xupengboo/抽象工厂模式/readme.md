# 抽象工厂模式

>抽象工厂（Abstract Factory）：声明了一组用于创建产品对象的方法，每个方法对应一种产品类型。抽象工厂可以是接口或抽象类。

抽象工厂模式是一种创建型设计模式，它提供一个接口来创建一系列相关或依赖的产品，而不需要指定具体的类。下面我将演示一个简单的抽象工厂模式的案例，假设我们有两个产品族：形状（Shape）和颜色（Color）。

首先，定义形状接口、两个实现类和颜色接口、两个实现类：
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

// Color接口
public interface Color {
    void fill();
}

// Red类实现Color接口
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

// Blue类实现Color接口
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
```
接下来，定义抽象工厂类，以及两个继承类分别用于创建形状和颜色的对象：
```java
// AbstractFactory抽象类
public abstract class AbstractFactory {
    // 形状产品
    public abstract Shape createShape(String shapeType);
    // 颜色产品
    public abstract Color createColor(String colorType);
}

// ShapeFactory类继承AbstractFactory类，用于创建形状对象
public class ShapeFactory extends AbstractFactory{

    public Shape createShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

    public Color createColor(String colorType) {
        return null;
    }

}

// ColorFactory类继承AbstractFactory接口，用于创建颜色对象
public class ColorFactory extends AbstractFactory{

    public Color createColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    public Shape createShape(String shapeType) {
        return null;
    }

}
```
这个例子中，AbstractFactory 抽象类 定义了创建形状和颜色的抽象方法，而 ShapeFactory 和 ColorFactory 分别继承了这个抽象类，`用于创建特定的形状和颜色对象`。客户端代码可以通过选择不同的工厂对象，来创建不同产品族的对象，实现了一种“家族”产品的创建方式。这就是抽象工厂模式的核心思想。
