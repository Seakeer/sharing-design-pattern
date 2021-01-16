package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.alpha;

/**
 * ComponentFactory: IFactory 3;
 * 操作系统组件工厂：抽象工厂角色
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public interface ComponentFactory {

    /**
     * create button
     *
     * @return Button
     */
    Button createButton();

    /**
     * create textbox
     *
     * @return TextBox
     */
    TextBox createTextBox();
}
