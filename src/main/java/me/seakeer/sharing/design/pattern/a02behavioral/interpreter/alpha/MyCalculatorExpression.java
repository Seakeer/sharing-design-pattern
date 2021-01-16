package me.seakeer.sharing.design.pattern.a02behavioral.interpreter.alpha;

/**
 * MyCalculatorExpression: IAAbstractExpression 1;
 * 计算器表达式：抽象表达式（角色）;
 *
 * @author Seakeer;
 * @date 2020-12-23;
 */
public interface MyCalculatorExpression {

    /**
     * interpret;
     *
     * @param myCalculator
     * @return
     */
    Integer interpret(MyCalculator myCalculator);
}