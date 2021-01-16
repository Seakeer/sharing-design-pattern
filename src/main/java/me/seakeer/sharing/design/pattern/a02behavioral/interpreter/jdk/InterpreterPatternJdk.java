package me.seakeer.sharing.design.pattern.a02behavioral.interpreter.jdk;

import jakarta.el.ELContext;
import org.apache.catalina.startup.Bootstrap;

/**
 * InterpreterPatternJdk;
 *
 * @author Seakeer;
 * @date 2021-01-04;
 * @see jakarta.el.ValueExpression#getValue(ELContext)       --> IAAbstractExpression  1 抽象表达式;
 * @see org.apache.el.ValueExpressionImpl                    --> TerminalExpression    2 终结符表达式;
 * @see jakarta.servlet.jsp.jstl.core.IndexedValueExpression --> NonterminalExpression 3 非终结符表达式;
 * @see jakarta.el.ELContext                                 --> Context               4 环境类;
 * @see ...
 * @see jakarta.el.ELResolver#getValue                       --> IAAbstractExpression  1 抽象表达式;
 * @see jakarta.el.ListELResolver                            --> TerminalExpression    2 终结符表达式;
 * @see jakarta.el.CompositeELResolver                       --> NonterminalExpression 3 非终结符表达式;
 * @see jakarta.el.ELContext                                 --> Context               4 环境类;
 * @see jakarta.el.StandardELContext
 * @see org.apache.jasper.el.JasperELResolver
 */
public class InterpreterPatternJdk {

    /**
     * -Dcatalina.home=./src/main/resources/tomcat
     * 启动tomcat
     * 访问localhost:8080
     * 加断点debug可跟踪解析过程
     *
     * @see jakarta.el.ValueExpression#getValue(ELContext)
     * @see org.apache.el.ValueExpressionImpl#getValue(ELContext)
     */
    public static void main(String[] args) {
        Bootstrap.main(args);
    }
}
