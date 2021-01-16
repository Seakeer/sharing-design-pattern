package me.seakeer.sharing.design.pattern.a00creational.a01staticfactory.alpha;

import me.seakeer.sharing.design.pattern.support.OperatingSystem;

/**
 * StaticFactoryPatternMain;
 * 静态工厂模式：单个工厂创建多个类型的单个产品;
 * 返回抽象类或接口的静态方法;
 *
 * @author Seakeer;
 * @date 2020/3/7; 2018/8/13;
 * @see Button              --> IAProduct       1   抽象产品;
 * @see LinuxButton         --> ConcreteProduct 2_A 具体产品;
 * @see WindowsButton       --> ConcreteProduct 2_B 具体产品;
 * @see ButtonStaticFactory --> StaticFactory   3   静态工厂;
 */
public class StaticFactoryPatternMain {

    public static void main(String[] args) {
        ButtonStaticFactory.createButton(OperatingSystem.LINUX).onClick();
        ButtonStaticFactory.createButton(OperatingSystem.WINDOWS).onClick();
    }
}
