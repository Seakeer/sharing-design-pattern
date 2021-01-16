package me.seakeer.sharing.design.pattern.a02behavioral.command.alpha;

/**
 * CommandPatternMain;
 * 命令模式：请求对应命令、请求封装；命令发出、发送执行分离；
 * 调用者聚合自命令类，命令类关联接收者；
 *
 * @author Seakeer;
 * @date 2020/3/22; 2018/8/20;
 * @see BaseCalculateCmd --> IACommand       1   抽象命令类;
 * @see AddCmd           --> ConcreteCommand 2_A 具体命令类;
 * @see MultiplyCmd      --> ConcreteCommand 2_B 具体命令类;
 * @see Adder            --> Reciver         3_A 接收者;
 * @see Multiplier       --> Reciver         3_B 接收者;
 * @see Calculator       --> Invoker         4   调用者;
 */
public class CommandPatternMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setCommand(new AddCmd());

        System.out.println("------ add ------");
        calculator.calculate(1F, 2F);
        calculator.calculate(3F);
        calculator.undo();

        System.out.println("------ multiply ------");
        calculator.setCommand(new MultiplyCmd());
        calculator.calculate(1F, 2F);
        calculator.calculate(3F);
        calculator.undo();
    }
}
