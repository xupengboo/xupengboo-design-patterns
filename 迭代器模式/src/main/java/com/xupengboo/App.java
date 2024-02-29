package com.xupengboo;

import com.xupengboo.aggregate.Aggregate;
import com.xupengboo.aggregate.impl.ConcreteAggregate;
import com.xupengboo.iterator.Iterator;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {
    public static void main( String[] args ) {
        // 迭代器 - 集合
        int[] array = {1,2,3,4,5};
        Aggregate aggregate = new ConcreteAggregate(array);
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
