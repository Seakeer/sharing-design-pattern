package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.alpha;

/**
 * WindowsButton: ConcreteProduct 2_A_2;
 * Windows系统按钮：具体产品角色
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class WindowsButton implements Button {

    @Override
    public void onClick() {

        System.out.println("Windows button was clicked");
    }
}
