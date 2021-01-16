package me.seakeer.sharing.design.pattern.a00creational.a05prototype.alpha;

/**
 * PrototypePatternMain;
 * 原型模式：通过复制原型来创建新对象;
 * java.lang.Object#clone()方法;
 *
 * @author Seakeer;
 * @date 2020/3/10; 2018/8/29;
 * @see Prototype         --> IACPrototype      1 抽象原型;
 * @see ConcretePrototype --> ConcretePrototype 2 具体原型;
 */
public class PrototypePatternMain {

    public static void main(String[] args) {

        ConcretePrototype prototype = new ConcretePrototype().setAttr("ConcretePrototype");
        ConcretePrototype clone = (ConcretePrototype) prototype.copy();

        System.out.println("原对象：" + prototype + " 参数：" + prototype.getAttr());
        System.out.println("克隆对象：" + clone + " 参数：" + clone.getAttr());
    }

}
