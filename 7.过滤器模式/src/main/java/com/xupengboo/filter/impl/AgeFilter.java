package com.xupengboo.filter.impl;

import com.xupengboo.domain.Person;
import com.xupengboo.filter.Filter;

/**
 * @author: xupengboo
 * @date: 2024/2/18 11:26
 * @description: 具体过滤器类
 */
// 具体过滤器类 - 年龄
public class AgeFilter implements Filter {

    private int minAge;

    private int maxAge;

    public AgeFilter(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public boolean filter(Person person) {
        return person.getAge() >= minAge && person.getAge() <= maxAge;
    }

}
