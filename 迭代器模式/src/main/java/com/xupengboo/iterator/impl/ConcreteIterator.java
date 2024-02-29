package com.xupengboo.iterator.impl;

import com.xupengboo.iterator.Iterator;

/**
 * @author: xupengboo
 * @date: 2024/2/29 17:05
 * @description: 具体迭代器哦
 */
// 具体迭代器
public class ConcreteIterator implements Iterator {

    private int[] array;

    private int index;

    public ConcreteIterator(int[] array) {
        this.array = array;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < array.length;
    }

    public Object next() {
        return array[index++];
    }

}
