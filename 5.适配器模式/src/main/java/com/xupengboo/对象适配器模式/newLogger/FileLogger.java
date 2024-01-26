package com.xupengboo.对象适配器模式.newLogger;

/**
 * @author: xupengboo
 * @date: 2024/1/26 10:47
 * @description: 新文件日志类
 */
public class FileLogger implements NewLogger {

    public void logMessage(String message) {
        System.out.println("FileLogger - Message: " + message);
    }

    public void logError(String errorMessage) {
        System.out.println("FileLogger - Error: " + errorMessage);
    }

}
