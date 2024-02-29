package com.xupengboo.expression;

/**
 * @author: xupengboo
 * @date: 2024/2/29 16:37
 * @description: 表达式接口
 */
// 抽象表达式
public interface Expression {

    int interpret(Context context);

}
