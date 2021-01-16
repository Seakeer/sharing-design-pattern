package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c00classadapter;

import me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.AC220V;

/**
 * ClassAdapterPatternMain;
 * 适配器模式：接口转换适配，将Adaptee的接口通过Adapter转换为Target兼容的接口;
 * 类适配器：实现类通过继承被适配者来进行接口适配;
 *
 * @author Seakeer;
 * @date 2020/3/10; 2018/8/13;
 * @see AC220V       --> Adaptee      1 被适配者;
 * @see DC5V         --> ITarget      2 目标抽象类;
 * @see PowerAdapter --> ClassAdapter 3 适配器;
 */
public class ClassAdapterPatternMain {

    public static void main(String[] args) {

        System.out.println("------类适配器模式------");
        DC5V dc5v = new PowerAdapter();
        System.out.println(dc5v.output());
    }
}
