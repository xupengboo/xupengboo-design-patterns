# 工厂方法模式

工厂方法模式是一种创建型设计模式，它定义了一个创建对象的接口，但将具体创建的工作延迟到子类中。这样，客户端代码在不同的子类下可以创建不同类型的对象，而不需要知道具体的实现类。

假设我们有一个简单的日志记录器（Logger）接口，以及两个实现类：文件日志记录器（FileLogger）和控制台日志记录器（ConsoleLogger）。我们将创建一个工厂接口（LoggerFactory）以及两个具体工厂类，分别用于创建文件日志记录器和控制台日志记录器。

首先，定义日志记录器接口和两个实现类：
```java
// Logger接口
public interface Logger {
    void logMessage(String message);
}

// FileLogger类实现Logger接口
public class FileLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("File Logger: " + message);
    }
}

// ConsoleLogger类实现Logger接口
public class ConsoleLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Console Logger: " + message);
    }
}
```
接下来，创建工厂接口和两个具体工厂类：
```java
// LoggerFactory接口
public interface LoggerFactory {
    Logger createLogger();
}

// FileLoggerFactory类实现LoggerFactory接口
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}

// ConsoleLoggerFactory类实现LoggerFactory接口
public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
```
现在，我们可以使用工厂方法模式创建不同类型的日志记录器，而不需要直接实例化它们：
```java
// 使用工厂方法模式的客户端代码
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        // 使用FileLoggerFactory创建FileLogger
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.logMessage("This is a message logged to a file.");

        // 使用ConsoleLoggerFactory创建ConsoleLogger
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.logMessage("This is a message logged to the console.");
    }
}
```
这个例子展示了工厂方法模式的基本原理。每个具体工厂类负责创建特定类型的产品（这里是日志记录器）。客户端代码通过使用不同的工厂对象，可以创建不同类型的产品对象，而无需了解具体的实现类。这提高了代码的灵活性和可维护性，符合设计模式的目标。
