package me.seakeer.sharing.design.pattern.a00creational.a04builder.alpha;

/**
 * BaseComputerBuilder: IABuilder 2;
 * 计算机建造者：抽象建造者角色 2
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public abstract class BaseComputerBuilder {

    protected Computer computer = new Computer();

//    //省略指挥者类写法2
//    public static Computer createComputer(BaseComputerBuilder computerBuilder) {
//
//        computerBuilder.buildCPU().buildMemory().buildIO();
//        return computerBuilder.buildComputer();
//    }
//
//    //省略指挥者类写法1
//    public Computer createComputer() {
//
//        this.buildCPU().buildMemory().buildIO();
//        return computer;
//    }

    public Computer buildComputer() {
        return computer;
    }

    public abstract BaseComputerBuilder buildCPU();

    public abstract BaseComputerBuilder buildMemory();

    public abstract BaseComputerBuilder buildIO();

    /**
     * hock method : 钩子方法
     */
    public boolean whetherInit() {
        return false;
    }

}
