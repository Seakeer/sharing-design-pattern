package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.alpha;

/**
 * LinuxButton: ConcreteProduct 2_A_1;
 * Linux系统按钮：具体产品角色
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class LinuxButton implements Button {

    @Override
    public void onClick() {

        System.out.println("Linux button was clicked");
    }
}
