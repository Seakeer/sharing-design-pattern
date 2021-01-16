package me.seakeer.sharing.design.pattern.a02behavioral.interpreter.alpha;

/**
 * VarExpression: TerminalExpression 2;
 * 变量表达式：终结符表达式；
 *
 * @author Seakeer;
 * @date 2020-12-23;
 */
public class VarExpression implements MyCalculatorExpression {

    private final int index;

    public VarExpression(int index) {
        this.index = index;
    }

    @Override
    public Integer interpret(MyCalculator myCalculator) {
        return Integer.valueOf(myCalculator.getMyCalculatorDataHolder().getData(index));
    }
}
