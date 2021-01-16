package me.seakeer.sharing.design.pattern.a00creational.a02factorymethod.alpha;

/**
 * FactoryMethodPatternMain;
 * 工厂方法模式：多个工厂创建多个类型的单个产品；多个产品族和单个产品等级结构;
 * 抽象类或接口里面有创建单个抽象类或接口的方法;
 *
 * @author Seakeer;
 * @date 2020/3/7; 2018/8/10;
 * @see Button               --> IProduct        1   抽象产品;
 * @see LinuxButton          --> ConcreteProduct 2_A 具体产品;
 * @see WindowsButton        --> ConcreteProduct 2_B 具体产品;
 * @see ButtonFactory        --> IFactory        3   抽象工厂;
 * @see LinuxButtonFactory   --> ConcreteFactory 4_A 具体工厂;
 * @see WindowsButtonFactory --> ConcreteFactory 4_B 具体工厂;
 */
public class FactoryMethodPatternMain {

    public static void main(String[] args) {

        ButtonFactory buttonFactory;

        buttonFactory = new LinuxButtonFactory();
        buttonFactory.createButton().onClick();

        buttonFactory = new WindowsButtonFactory();
        buttonFactory.createButton().onClick();
    }
}
