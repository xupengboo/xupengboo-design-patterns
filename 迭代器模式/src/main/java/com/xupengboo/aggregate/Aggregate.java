package com.xupengboo.aggregate;

import com.xupengboo.iterator.Iterator;

/**
 * @author: xupengboo
 * @date: 2024/2/29 17:08
 * @description: 集合
 */
// 集合
public interface Aggregate {

    Iterator createIterator();

}
