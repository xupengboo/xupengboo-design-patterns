package com.xupengboo.filter.impl;

import com.xupengboo.domain.Person;
import com.xupengboo.enums.Gender;
import com.xupengboo.filter.Filter;

/**
 * @author: xupengboo
 * @date: 2024/2/18 11:29
 * @description: 具体过滤器类
 */
// 具体过滤器类 - 性别
public class GenderFilter implements Filter {

    private Gender gender;

    public GenderFilter(Gender gender) {
        this.gender = gender;
    }

    public boolean filter(Person person) {
        return person.getGender() == gender;
    }

}
