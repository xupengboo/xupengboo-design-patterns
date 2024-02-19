package com.xupengboo;

import com.xupengboo.domain.Person;
import com.xupengboo.enums.Gender;
import com.xupengboo.filter.chain.FilterChain;
import com.xupengboo.filter.impl.AgeFilter;
import com.xupengboo.filter.impl.GenderFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25, Gender.FEMALE));
        persons.add(new Person("Bob", 30, Gender.MALE));
        persons.add(new Person("Charlie", 20, Gender.MALE));
        persons.add(new Person("David", 35, Gender.MALE));

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new AgeFilter(25,35));
        filterChain.addFilter(new GenderFilter(Gender.MALE));

        List<Person> result = filterChain.filter(persons);
        for (Person person : result) {
            System.out.println(person.getName());
        }
    }

}
