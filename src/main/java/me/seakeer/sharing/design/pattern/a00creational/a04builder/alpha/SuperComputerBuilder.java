package me.seakeer.sharing.design.pattern.a00creational.a04builder.alpha;

/**
 * SuperComputerBuilder: ConcreteBuilder 3_B;
 * 超级计算机建造者：具体建造者角色;
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class SuperComputerBuilder extends BaseComputerBuilder {

    @Override
    public SuperComputerBuilder buildCPU() {
        computer.setCpu("CPU: Million Nuclei");
        return this;
    }

    @Override
    public SuperComputerBuilder buildMemory() {
        computer.setMemory("Memory: Million T");
        return this;
    }

    @Override
    public SuperComputerBuilder buildIO() {
        computer.setIo("IO: Million IOPS");
        return this;
    }
}
