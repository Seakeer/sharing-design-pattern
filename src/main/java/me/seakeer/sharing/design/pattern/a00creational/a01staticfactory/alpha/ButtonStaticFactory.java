package me.seakeer.sharing.design.pattern.a00creational.a01staticfactory.alpha;

import me.seakeer.sharing.design.pattern.support.OperatingSystem;

/**
 * ButtonStaticFactory: StaticFactory 3;
 * 按钮工厂类：静态工厂角色 3
 *
 * @author Seakeer;
 * @date 2020/3/4; 2018/8/13;
 */
public class ButtonStaticFactory {

    public static Button createButton(OperatingSystem os) {
        if (OperatingSystem.LINUX.equals(os)) {
            return new LinuxButton();
        } else {
            return new WindowsButton();
        }
    }
}
