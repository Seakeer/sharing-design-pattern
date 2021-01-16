package me.seakeer.sharing.design.pattern.a01structual.facade.alpha;

/**
 * IO: Subsystem 1_C;
 * 子系统角色;
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class IO {

    public void start() {

        System.out.println("io start");
    }

    public void shutDown() {

        System.out.println("io shutdown");
    }
}
