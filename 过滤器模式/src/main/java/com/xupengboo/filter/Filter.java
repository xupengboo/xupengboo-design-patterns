package com.xupengboo.filter;

import com.xupengboo.domain.Person;

/**
 * @author: xupengboo
 * @date: 2024/2/18 11:19
 * @description: 过滤器接口
 */
// 过滤器接口
public interface Filter {

    boolean filter(Person person);

}
