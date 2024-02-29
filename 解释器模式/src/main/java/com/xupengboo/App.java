package com.xupengboo;

import com.xupengboo.expression.Context;
import com.xupengboo.expression.Expression;
import com.xupengboo.expression.impl.AddExpression;
import com.xupengboo.expression.impl.NumberExpression;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 执行a + b 四则运算：
        Context context = new Context();
        context.setVariable("a",10);
        context.setVariable("b",20);

        Expression expression = new AddExpression(
                new NumberExpression(context.getVariable("a")),
                new NumberExpression(context.getVariable("b"))
        );

        int result = expression.interpret(context);
        System.out.println("Result：" + result);
    }

}
