package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.alpha;

/**
 * AbstractFactoryPatternMain;
 * 抽象工厂模式：多个产品族和多个产品等级结构；创建多个类型的多个产品;
 * 抽象类或接口里面有创建多个抽象类或接口的方法;
 *
 * @author Seakeer;
 * @date 2020/3/7; 2018/8/10;
 * @see Button                  --> IProduct        1_A   抽象产品;
 * @see TextBox                 --> IProduct        1_B   抽象产品;
 * @see LinuxButton             --> ConcreteProduct 2_A_1 具体产品;
 * @see WindowsButton           --> ConcreteProduct 2_A_2 具体产品;
 * @see LinuxTextBox            --> ConcreteProduct 2_B_1 具体产品;
 * @see WindowsTextBox          --> ConcreteProduct 2_B_2 具体产品;
 * @see ComponentFactory        --> IFactory        3     抽象工厂;
 * @see LinuxComponentFactory   --> ConcreteFactory 4_A   具体工厂;
 * @see WindowsComponentFactory --> ConcreteFactory 4_B   具体工厂;
 */
public class AbstractFactoryPatternMain {

    public static void main(String[] args) {
        ComponentFactory linuxComponentFactory = new LinuxComponentFactory();
        linuxComponentFactory.createButton().onClick();
        linuxComponentFactory.createTextBox().showText();

        ComponentFactory windowsComponentFactory = new WindowsComponentFactory();
        windowsComponentFactory.createButton().onClick();
        windowsComponentFactory.createTextBox().showText();
    }
}
