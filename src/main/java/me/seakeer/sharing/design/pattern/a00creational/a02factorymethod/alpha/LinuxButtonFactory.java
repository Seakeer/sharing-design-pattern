package me.seakeer.sharing.design.pattern.a00creational.a02factorymethod.alpha;

/**
 * LinuxButtonFactory: ConcreteFactory 4_A;
 * Linux系统按钮工厂：具体工厂角色 4_A
 *
 * @author Seakeer;
 * @date 2020/3/7; 2018/8/13;
 */
public class LinuxButtonFactory implements ButtonFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
