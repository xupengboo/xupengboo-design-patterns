package com.xupengboo.对象适配器模式.newLogger;

/**
 * @author: xupengboo
 * @date: 2024/1/26 10:45
 * @description: 新客户端日志类
 */
public class ConsoleLogger implements NewLogger{

    public void logMessage(String message) {
        System.out.println("ConsoleLogger - Message: " + message);
    }

    public void logError(String errorMessage) {
        System.out.println("ConsoleLogger - Error: " + errorMessage);
    }

}
