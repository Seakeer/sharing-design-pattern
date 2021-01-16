package me.seakeer.sharing.design.pattern.a01structual.facade.alpha;

/**
 * CPU: Subsystem 1_A;
 * 子系统角色;
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class CPU {

    public void start() {
        System.out.println("cpu start");
    }

    public void shutDown() {
        System.out.println("cpu shutdown");
    }
}
