package com.xupengboo.filter.chain;

import com.xupengboo.domain.Person;
import com.xupengboo.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xupengboo
 * @date: 2024/2/18 11:30
 * @description: 过滤器链
 */
// 过滤器链
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public List<Person> filter(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            boolean pass = true;
            for (Filter filter : filters) {
                if (!filter.filter(person)) {
                    pass = false;
                    break;
                }
            }
            if (pass) {
                result.add(person);
            }
        }
        return result;
    }

}
