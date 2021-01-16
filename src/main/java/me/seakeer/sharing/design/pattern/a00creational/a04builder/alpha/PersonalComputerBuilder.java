package me.seakeer.sharing.design.pattern.a00creational.a04builder.alpha;

/**
 * PersonalComputerBuilder: ConcreteBuilder 3_A;
 * 个人计算机建造者：具体建造者角色;
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class PersonalComputerBuilder extends BaseComputerBuilder {

    @Override
    public BaseComputerBuilder buildCPU() {
        computer.setCpu("CPU: 4 Nuclei");
        return this;
    }

    @Override
    public BaseComputerBuilder buildMemory() {
        computer.setMemory("Memory: 4 T");
        return this;
    }

    @Override
    public BaseComputerBuilder buildIO() {
        computer.setIo("IO: 1000 IOPS");
        return this;
    }

    @Override
    public boolean whetherInit() {
        return true;
    }
}
