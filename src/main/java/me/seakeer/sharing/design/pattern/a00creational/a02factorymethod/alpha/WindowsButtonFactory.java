package me.seakeer.sharing.design.pattern.a00creational.a02factorymethod.alpha;

/**
 * WindowsButtonFactory: ConcreteFactory 4_B;
 * Windows系统按钮工厂：具体工厂角色 4_B
 *
 * @author Seakeer;
 * @date 2020/3/7; 2018/8/13;
 */
public class WindowsButtonFactory implements ButtonFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
