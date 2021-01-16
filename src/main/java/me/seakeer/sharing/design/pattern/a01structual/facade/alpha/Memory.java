package me.seakeer.sharing.design.pattern.a01structual.facade.alpha;

/**
 * Memory: Subsystem 1_B;
 * 内存: 子系统角色
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class Memory {

    public void start() {

        System.out.println("memory start");
    }

    public void shutDown() {

        System.out.println("memory shutdown");
    }
}
