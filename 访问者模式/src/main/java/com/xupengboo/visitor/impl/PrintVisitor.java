package com.xupengboo.visitor.impl;

import com.xupengboo.element.impl.Article;
import com.xupengboo.element.impl.Comment;
import com.xupengboo.visitor.BlogVisitor;

/**
 * @Author xupengboo
 * @Date 2024/3/12 13:03
 * @Describe
 */
public class PrintVisitor implements BlogVisitor {

    @Override
    public void visitArticle(Article article) {
        System.out.println("Article: " + article.getContent());
    }

    @Override
    public void visitComment(Comment comment) {
        System.out.println("Comment: " + comment.getContent());
    }

}
