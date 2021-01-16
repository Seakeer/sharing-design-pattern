package me.seakeer.sharing.design.pattern.a02behavioral.interpreter.alpha;

/**
 * SubExpression：NonterminalExpression 3;
 * 减法表达式：非终结符表达式;
 *
 * @author Seakeer;
 * @date 2020-12-27;
 */
public class SubExpression extends OperatorExpression {

    public SubExpression(MyCalculatorExpression left, MyCalculatorExpression right) {
        super(left, right);
    }

    @Override
    public Integer interpret(MyCalculator myCalculator) {
        return left.interpret(myCalculator)
                - right.interpret(myCalculator);
    }
}
