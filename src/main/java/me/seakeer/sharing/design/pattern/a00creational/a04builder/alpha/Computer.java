package me.seakeer.sharing.design.pattern.a00creational.a04builder.alpha;

/**
 * Computer: Product 1;
 * 计算机：产品角色 1
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class Computer {

    private String cpu;
    private String memory;
    private String io;

    public String getCpu() {
        return cpu;
    }

    public Computer setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public String getIo() {
        return io;
    }

    public Computer setIo(String io) {
        this.io = io;
        return this;
    }

    public String getMemory() {
        return memory;
    }

    public Computer setMemory(String memory) {
        this.memory = memory;
        return this;
    }
}
