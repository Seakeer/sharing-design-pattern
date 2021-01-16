package me.seakeer.sharing.design.pattern.a01structual.facade.alpha;

/**
 * FacadePatternMain;
 * 门面模式：为子系统中的一组接口提供一个统一的入口（高层接口）；
 * 统一入口，处理多个子系统；
 *
 * @author Seakeer;
 * @date 2020/3/15; 2018/8/15;
 * @see CPU      --> Subsystem 1_A 子系统;
 * @see Memory   --> Subsystem 1_B 子系统;
 * @see IO       --> Subsystem 1_C 子系统;
 * @see Computer --> Facade    2   外观角色;
 */
public class FacadePatternMain {

    public static void main(String[] args) {
        Computer computer = new Computer(
                new CPU(),
                new Memory(),
                new IO());

        computer.start();
        computer.shutDown();
    }
}
