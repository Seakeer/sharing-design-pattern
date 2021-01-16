package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.alpha;

/**
 * LinuxTextBox: ConcreteProduct 2_B_1;
 * Linux系统文本框：具体产品角色
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class LinuxTextBox implements TextBox {

    @Override
    public void showText() {

        System.out.println("This is a linux text box");
    }
}
