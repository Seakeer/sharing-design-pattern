package me.seakeer.sharing.design.pattern.a02behavioral.command.alpha;

/**
 * Calculator: Invoker 4;
 * 计算器：调用者;
 *
 * @author Seakeer;
 * @date 2020/3/22;
 */
public class Calculator {

    private BaseCalculateCmd command;

    public Calculator setCommand(BaseCalculateCmd command) {
        this.command = command;
        return this;
    }

    public void calculate(float value) {
        System.out.println("计算结果: " + command.execute(value));
    }

    public void calculate(float value1, float value2) {
        System.out.println("计算结果: " + command.execute(value1, value2));
    }

    public void undo() {
        System.out.println("撤销结果: " + command.undo());
    }
}
