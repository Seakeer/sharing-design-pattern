package me.seakeer.sharing.design.pattern.a02behavioral.state.alpha;

/**
 * StatePatternMain;
 * 状态模式：解决系统中复杂对象的状态转换以及不同状态下行为的封装问题;
 * 环境类聚合自状态类;
 *
 * @author Seakeer;
 * @date 2020/4/1; 2018/8/21;
 * @see AbstractH2OStatus   --> IAState       1   抽象状态类;
 * @see SolidH2O            --> ConcreteState 2_A 具体状态类;
 * @see LiquidH2O           --> ConcreteState 2_B 具体状态类;
 * @see GasH2O              --> ConcreteState 2_C 具体状态类;
 * @see PhysicalEnvironment --> Context       3   环境类;
 */
public class StatePatternMain {

    public static void main(String[] args) {

        PhysicalEnvironment env = new PhysicalEnvironment(-20F);
        env.showInfo();

        env.setCelciusTemperature(20F);
        env.showInfo();

        env.setCelciusTemperature(110F);
        env.showInfo();
    }
}
