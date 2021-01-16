package me.seakeer.sharing.design.pattern.a00creational.a05prototype.jdk;

import java.util.ArrayList;

/**
 * PrototypePatternJdk;
 *
 * @author Seakeer;
 * @date 2020-12-04;
 * @see java.lang.Object    --> IACPrototype      1 抽象原型;
 * @see java.util.ArrayList --> ConcretePrototype 2 具体原型;
 */
@SuppressWarnings("unchecked")
public class PrototypePatternJdk {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        ArrayList<String> clonedArrayList = (ArrayList<String>) arrayList.clone();
        System.out.println(clonedArrayList);
    }
}
