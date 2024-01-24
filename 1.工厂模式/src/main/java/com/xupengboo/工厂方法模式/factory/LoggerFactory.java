package com.xupengboo.工厂方法模式.factory;

import com.xupengboo.工厂方法模式.log.Logger;

/**
 * @author: xupengboo
 * @date: 2024/1/24 11:49
 * @description: 工厂接口
 */
public interface LoggerFactory {

    Logger createLogger();

}
