package com.xupengboo.element;

import com.xupengboo.visitor.BlogVisitor;

/**
 * @Author xupengboo
 * @Date 2024/3/12 12:53
 * @Describe 定义被访问元素接口
 */
public interface BlogElement {

    void accept(BlogVisitor visitor);

}
