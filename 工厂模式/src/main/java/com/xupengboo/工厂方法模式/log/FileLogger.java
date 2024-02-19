package com.xupengboo.工厂方法模式.log;

/**
 * @author: xupengboo
 * @date: 2024/1/24 11:45
 * @description: 文件日志记录器
 */
public class FileLogger implements Logger{

    public void logMessage(String message) {
        System.out.println("File Logger: " + message);
    }

}
