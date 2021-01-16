package me.seakeer.sharing.design.pattern.a00creational.a02factorymethod.alpha;

/**
 * WindowsButton: ConcreteProduct 2_B;
 * Windows系统按钮：具体产品角色 2_B
 *
 * @author Seakeer;
 * @date 2020/3/7; 2018/8/13;
 */
public class WindowsButton implements Button {

    @Override
    public void onClick() {

        System.out.println("Windows button was clicked");
    }
}
