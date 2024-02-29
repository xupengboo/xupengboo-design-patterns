package com.xupengboo.expression;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xupengboo
 * @date: 2024/2/29 16:38
 * @description: 上下文类
 */
// 上下文
public class Context {

    private Map<String,Integer> variables = new HashMap<String, Integer>();

    public void setVariable(String name, int value) {
        variables.put(name,value);
    }

    public int getVariable(String name) {
        return variables.get(name);
    }

}
