package me.seakeer.sharing.design.pattern.a00creational.a05prototype.beta;

import me.seakeer.sharing.design.pattern.a00creational.a05prototype.beta.support.ObjectCloneable;
import me.seakeer.sharing.design.pattern.a00creational.a05prototype.beta.support.ObjectNotCloneable;

/**
 * PrototypePatternMain;
 * 原型模式;
 *
 * @author Seakeer;
 * @date 2020/3/10; 2018/8/8;
 * @see Object            --> IACPrototype      1 抽象原型;
 * @see ConcretePrototype --> ConcretePrototype 2 具体原型;
 */
public class PrototypePatternMain {

    public static void main(String[] args) {
        testCloneCost();
        testClonedAttr();
    }

    private static void testClonedAttr() {
        String[] strArr1 = {"strArr1"};
        String[] strArr2 = {"strArr2"};
        String[] strArr3 = {"strArr3"};

        ConcretePrototype prototypePattern = new ConcretePrototype(10, 11, "prototypePatternStr", strArr1)
                .setObjectCloneableAttr(new ObjectCloneable(20, 21, "ObjectCloneableStr", strArr2))
                .setObjectNotCloneableAttr(new ObjectNotCloneable(30, 31, "ObjectNotCloneableStr", strArr3));

        ConcretePrototype clonedPrototypePattern = prototypePattern.clone();

        ConcretePrototype deepClonedPrototypePattern = prototypePattern.deepClone();

        ConcretePrototype deepClonedBySerialization = prototypePattern.deepCloneBySerialization();

        System.out.println("\n------new sc dc dcByS 的对象对比------");
        System.out.println(prototypePattern + "\n" + clonedPrototypePattern + "\n" +
                deepClonedPrototypePattern + "\n" + deepClonedBySerialization);

        System.out.println("\n------new sc dc dcByS 的对象的intAttr属性对比------");
        System.out.println(prototypePattern.getIntAttr());
        System.out.println(clonedPrototypePattern.getIntAttr());
        System.out.println(deepClonedPrototypePattern.getIntAttr());
        System.out.println(deepClonedBySerialization.getIntAttr());

        System.out.println("\n------new sc dc dcByS 的对象的integerAttr属性对比------");
        System.out.println(prototypePattern.getIntegerAttr());
        System.out.println(clonedPrototypePattern.getIntegerAttr());
        System.out.println(deepClonedPrototypePattern.getIntegerAttr());
        System.out.println(deepClonedBySerialization.getIntegerAttr());

        System.out.println("\n------new sc dc dcByS 的对象的stringAttr属性对比------");
        System.out.println(prototypePattern.getStringAttr());
        System.out.println(clonedPrototypePattern.getStringAttr());
        System.out.println(deepClonedPrototypePattern.getStringAttr());
        System.out.println(deepClonedBySerialization.getStringAttr());

        System.out.println("\n------new sc dc dcByS 的对象的stringArrAttr属性对比------");
        System.out.println(prototypePattern.getStringArrAttr() + " " + prototypePattern.getStringArrAttr()[0]);
        System.out.println(clonedPrototypePattern.getStringArrAttr() + " " + clonedPrototypePattern.getStringArrAttr()[0]);
        System.out.println(deepClonedPrototypePattern.getStringArrAttr() + " " + deepClonedPrototypePattern.getStringArrAttr()[0]);
        System.out.println(deepClonedBySerialization.getStringArrAttr() + " " + deepClonedBySerialization.getStringArrAttr()[0]);

        System.out.println("\n------new sc dc dcByS 的对象的objectCloneableAttr属性对比------");
        System.out.println(prototypePattern.getObjectCloneableAttr());
        System.out.println(clonedPrototypePattern.getObjectCloneableAttr());
        System.out.println(deepClonedPrototypePattern.getObjectCloneableAttr());
        System.out.println(deepClonedBySerialization.getObjectCloneableAttr());

        System.out.println("\n------new sc dc dcByS 的对象的objectNotCloneableAttr属性对比------");
        System.out.println(prototypePattern.getObjectNotCloneableAttr());
        System.out.println(clonedPrototypePattern.getObjectNotCloneableAttr());
        System.out.println(deepClonedPrototypePattern.getObjectNotCloneableAttr());
        System.out.println(deepClonedBySerialization.getObjectNotCloneableAttr());
    }

    private static void testCloneCost() {
        Long first = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            new ConcretePrototype();
        }

        Long second = System.currentTimeMillis();
        ConcretePrototype p = new ConcretePrototype();
        for (int i = 0; i < 999999; i++) {
            p.clone();
        }

        Long third = System.currentTimeMillis();
        ConcretePrototype p1 = new ConcretePrototype();
        for (int i = 0; i < 999999; i++) {
            p1.deepClone();
        }
        Long forth = System.currentTimeMillis();

        ConcretePrototype p2 = new ConcretePrototype();
        for (int i = 0; i < 999999; i++) {
            p2.deepCloneBySerialization();
        }
        Long fifth = System.currentTimeMillis();


        System.out.println("\n------创建1000000个对象，四种方式耗时情况------");
        System.out.println("new:" + (second - first));
        System.out.println("shallow clone:" + (third - second));
        System.out.println("deep clone:" + (forth - third));
        System.out.println("deep clone by serialization:" + (fifth - forth));
    }
}
