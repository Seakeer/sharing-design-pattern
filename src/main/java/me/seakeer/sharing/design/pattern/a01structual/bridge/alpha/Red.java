package me.seakeer.sharing.design.pattern.a01structual.bridge.alpha;

import me.seakeer.sharing.design.pattern.a01structual.bridge.support.MyColor;

/**
 * Red: ConcreteAdditiveAttribute 2;
 * 红色：具体附加属性（维度） 2
 * ConcreteImplementor
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public class Red implements Color {

    @Override
    public MyColor drawColor() {
        return MyColor.RED;
    }
}
