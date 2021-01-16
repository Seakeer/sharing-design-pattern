package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.alpha;

/**
 * WindowsComponentFactory: ConcreteFactory 4_2;
 * Windows系统组件工厂：具体工厂角色
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class WindowsComponentFactory implements ComponentFactory {

    @Override
    public Button createButton() {

        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {

        return new WindowsTextBox();
    }
}
