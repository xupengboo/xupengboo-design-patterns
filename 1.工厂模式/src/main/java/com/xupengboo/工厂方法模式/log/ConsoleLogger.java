package com.xupengboo.工厂方法模式.log;

/**
 * @author: xupengboo
 * @date: 2024/1/24 11:46
 * @description: 控制台日志记录器
 */
public class ConsoleLogger implements Logger{

    public void logMessage(String message) {
        System.out.println("Console Logger: " + message);
    }

}
