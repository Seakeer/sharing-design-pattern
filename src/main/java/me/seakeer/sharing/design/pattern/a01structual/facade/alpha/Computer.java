package me.seakeer.sharing.design.pattern.a01structual.facade.alpha;


/**
 * Computer: Facade 2;
 * 计算机: 外观角色
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private IO io;

    public Computer(CPU cpu, Memory memory, IO io) {
        this.cpu = cpu;
        this.memory = memory;
        this.io = io;
    }

    public void start() {
        cpu.start();
        memory.start();
        io.start();

        System.out.println("computer start");
    }

    public void shutDown() {
        io.shutDown();
        memory.shutDown();
        cpu.shutDown();

        System.out.println("computer shutdown");
    }

    public CPU getCpu() {
        return cpu;
    }

    public Computer setCpu(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public Memory getMemory() {
        return memory;
    }

    public Computer setMemory(Memory memory) {
        this.memory = memory;
        return this;
    }

    public IO getIo() {
        return io;
    }

    public Computer setIo(IO io) {
        this.io = io;
        return this;
    }
}
