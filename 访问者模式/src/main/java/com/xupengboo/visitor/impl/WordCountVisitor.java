package com.xupengboo.visitor.impl;

import com.xupengboo.element.impl.Article;
import com.xupengboo.element.impl.Comment;
import com.xupengboo.visitor.BlogVisitor;

/**
 * @Author xupengboo
 * @Date 2024/3/12 13:02
 * @Describe 实现具体的访问者
 */
public class WordCountVisitor implements BlogVisitor {

    private int count = 0;

    @Override
    public void visitArticle(Article article) {
        count += article.getContent().split("\\s+").length;
    }

    @Override
    public void visitComment(Comment comment) {
        count += comment.getContent().split("\\s+").length;
    }

    public int getCount() {
        return count;
    }

}
