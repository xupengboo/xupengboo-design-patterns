package com.xupengboo.element.impl;

import com.xupengboo.element.BlogElement;
import com.xupengboo.visitor.BlogVisitor;

/**
 * @Author xupengboo
 * @Date 2024/3/12 12:56
 * @Describe 实现被访问元素
 */
public class Comment implements BlogElement {

    private String content;

    public Comment(String content) {
        this.content = content;
    }

    @Override
    public void accept(BlogVisitor visitor) {
        visitor.visitComment(this);
    }

    public String getContent() {
        return content;
    }
}
