package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.alpha;

/**
 * LinuxComponentFactory: ConcreteFactory 4_1;
 * Linux系统组件工厂：具体工厂角色
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class LinuxComponentFactory implements ComponentFactory {

    @Override
    public Button createButton() {

        return new LinuxButton();
    }

    @Override
    public TextBox createTextBox() {

        return new LinuxTextBox();
    }
}
