package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.alpha;

/**
 * WindowsTextBox: ConcreteProduct 2_B_2;
 * Windows系统文本框：具体产品角色
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class WindowsTextBox implements TextBox {

    @Override
    public void showText() {

        System.out.println("This is a windows text box");
    }
}
