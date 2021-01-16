package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c01objectadapter;

import me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.AC220V;

/**
 * ObjectAdapterPatternMain;
 * 适配器模式：接口转换适配，将Adaptee的接口通过Adapter转换为Target兼容的接口;
 * 对象适配器：实现类通过持有被适配者属性来进行接口适配;
 *
 * @author Seakeer;
 * @date 2020/3/10; 2018/8/13;
 * @see AC220V       --> Adaptee       1 被适配者;
 * @see DC5V         --> IATarget      2 目标抽象类;
 * @see PowerAdapter --> ObjectAdapter 3 适配器;
 */
public class ObjectAdapterPatternMain {

    public static void main(String[] args) {

        System.out.println("------对象适配器模式------");
        DC5V dc5v = new PowerAdapter(new AC220V());
        System.out.println(dc5v.output());
    }
}
