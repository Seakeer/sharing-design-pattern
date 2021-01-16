package me.seakeer.sharing.design.pattern.a02behavioral.interpreter.alpha;

/**
 * OperatorExpression: NonterminalExpression 3;
 * 操作符表达式：非终结符表达式;
 *
 * @author Seakeer;
 * @date 2020-12-23;
 */
public abstract class OperatorExpression implements MyCalculatorExpression {

    protected MyCalculatorExpression left, right;

    public OperatorExpression(MyCalculatorExpression left, MyCalculatorExpression right) {
        this.left = left;
        this.right = right;
    }
}
