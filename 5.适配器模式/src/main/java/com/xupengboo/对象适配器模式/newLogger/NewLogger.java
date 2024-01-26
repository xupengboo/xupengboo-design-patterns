package com.xupengboo.对象适配器模式.newLogger;

/**
 * @author: xupengboo
 * @date: 2024/1/26 10:43
 * @description: 新日志接口
 */
// 被适配者接口(也可以是抽象类)
public interface NewLogger {

    void logMessage(String message);

    void logError(String errorMessage);

}
