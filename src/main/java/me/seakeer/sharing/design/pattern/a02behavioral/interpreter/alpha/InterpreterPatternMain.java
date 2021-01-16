package me.seakeer.sharing.design.pattern.a02behavioral.interpreter.alpha;

import java.util.Scanner;

/**
 * InterpreterPatternMain;
 * 解释器模式：建立一个解释器来解释使用规定格式和语法的代码（文本）;
 * 语法解释；非终结符表达式关联抽象表达式;
 *
 * @author Seakeer;
 * @date 2020/5/14; 2018/8/20;
 * @see MyCalculatorExpression --> IAAbstractExpression  1 抽象表达式;
 * @see VarExpression          --> TerminalExpression    2 终结符表达式;
 * @see OperatorExpression     --> NonterminalExpression 3 非终结符表达式;
 * @see MyCalculator           --> Context               4 环境类;
 * @see AddExpression
 * @see SubExpression
 */
public class InterpreterPatternMain {

    public static final String EQ = " = ";

    public static void main(String[] args) {
        System.out.println("Please Input Expression: e.g. 1 + 2 - 3");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String exp = scanner.nextLine();
            System.out.println(exp + EQ + new MyCalculator().run(exp));
        }
    }
}
