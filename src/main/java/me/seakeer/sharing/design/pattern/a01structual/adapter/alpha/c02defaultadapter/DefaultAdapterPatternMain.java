package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c02defaultadapter;

import me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.AC220V;

/**
 * DefaultAdapterPatternMain;
 * 适配器模式: 默认适配器;
 *
 * @author Seakeer;
 * @date 2020/3/10; 2018/8/13;
 * @see AC220V               --> Adaptee         1 被适配者;
 * @see DCOutput             --> IATarget        2 目标抽象类;
 * @see AbstractPowerAdapter --> ADefaultAdapter 3 默认适配器;
 * @see DC5VAdapter          --> ConcreteAdapter 4 具体适配器;
 */
public class DefaultAdapterPatternMain {

    public static void main(String[] args) {

        System.out.println("------缺省适配器模式------");
        DC5VAdapter dc5v = new DC5VAdapter(new AC220V());
        System.out.println(dc5v.output5v());
    }
}
