package com.xupengboo.aggregate.impl;

import com.xupengboo.aggregate.Aggregate;
import com.xupengboo.iterator.Iterator;
import com.xupengboo.iterator.impl.ConcreteIterator;

/**
 * @author: xupengboo
 * @date: 2024/2/29 17:09
 * @description: 具体集合
 */
// 具体结合
public class ConcreteAggregate implements Aggregate {

    private int[] array;

    public ConcreteAggregate(int[] array) {
        this.array = array;
    }

    public Iterator createIterator() {
        return new ConcreteIterator(array);
    }

}
