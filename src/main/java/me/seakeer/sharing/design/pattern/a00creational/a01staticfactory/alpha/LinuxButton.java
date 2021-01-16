package me.seakeer.sharing.design.pattern.a00creational.a01staticfactory.alpha;

/**
 * LinuxButton: ConcreteProduct 2_A;
 * Linux系统按钮：具体产品角色 2_A
 *
 * @author Seakeer;
 * @date 2020/3/4; 2018/8/13;
 */
public class LinuxButton implements Button {

    @Override
    public void onClick() {
        System.out.println("Linux button was clicked");
    }
}
