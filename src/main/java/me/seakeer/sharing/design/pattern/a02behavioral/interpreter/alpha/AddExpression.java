package me.seakeer.sharing.design.pattern.a02behavioral.interpreter.alpha;

/**
 * AddExpression：NonterminalExpression 3;
 * 加法表达式：非终结符表达式;
 *
 * @author Seakeer;
 * @date 2020-12-23;
 */
public class AddExpression extends OperatorExpression {

    public AddExpression(MyCalculatorExpression expression1, MyCalculatorExpression expression2) {
        super(expression1, expression2);
    }

    @Override
    public Integer interpret(MyCalculator myCalculator) {
        return left.interpret(myCalculator)
                + right.interpret(myCalculator);
    }
}
