package me.seakeer.sharing.design.pattern.a02behavioral.interpreter.alpha;

import java.util.Stack;

/**
 * MyCalculator：Context 4;
 * 计算器：环境类；
 *
 * @author Seakeer;
 * @date 2020-12-27;
 */
public class MyCalculator {

    public static final String ADD = "+";
    public static final String SUB = "-";
    public static final char CHAR_ADD = '+';
    public static final char CHAR_SUB = '-';
    public static final char CHAR_0 = '0';
    public static final char CHAR_9 = '9';

    private MyCalculatorExpression myCalculatorExpression;
    private MyCalculatorDataHolder myCalculatorDataHolder;

    public Integer run(String expresionStr) {
        initDataHolder(expresionStr);
        initExpresion();
        Integer result = myCalculatorExpression.interpret(this);
        myCalculatorDataHolder.clear();
        return result;
    }

    private void initDataHolder(String exp) {
        MyCalculatorDataHolder dataHolder = MyCalculatorDataHolder.getInstance();
        char[] chars = exp.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isOperator(chars[i])) {
                dataHolder.put(String.valueOf(chars[i]));
            } else if (isNumber(chars[i])) {
                i = putNumberData(dataHolder, chars, i);
            } else {
                throw new IllegalArgumentException("Input data is neither number nor operator.");
            }
        }
        this.myCalculatorDataHolder = dataHolder;
    }

    public MyCalculatorDataHolder getMyCalculatorDataHolder() {
        return myCalculatorDataHolder;
    }

    private void initExpresion() {
        Stack<MyCalculatorExpression> expStack = new Stack<>();
        MyCalculatorExpression left;
        MyCalculatorExpression right;
        for (int i = 0; i < myCalculatorDataHolder.dataSize() - 1; i++) {
            switch (myCalculatorDataHolder.getData(i)) {
                case ADD:
                    left = expStack.pop();
                    right = new VarExpression(++i);
                    expStack.push(new AddExpression(left, right));
                    break;
                case SUB:
                    left = expStack.pop();
                    right = new VarExpression(++i);
                    expStack.push(new SubExpression(left, right));
                    break;
                default:
                    expStack.push(new VarExpression(i));
                    break;
            }
        }
        this.myCalculatorExpression = expStack.pop();
    }


    private static int putNumberData(MyCalculatorDataHolder dataHolder, char[] chars, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        int j = i;
        while (j < chars.length && isNumber(chars[j])) {
            stringBuilder.append(chars[j]);
            j++;
        }
        if (0 != stringBuilder.length()) {
            dataHolder.put(stringBuilder.toString());
            i = j - 1;
        }
        return i;
    }


    private static boolean isOperator(char aChar) {
        return CHAR_ADD == aChar || CHAR_SUB == aChar;
    }

    private static boolean isNumber(char ch) {
        return CHAR_0 <= ch && CHAR_9 >= ch;
    }

}
