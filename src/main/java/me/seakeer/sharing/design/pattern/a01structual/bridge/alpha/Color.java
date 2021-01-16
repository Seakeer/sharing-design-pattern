package me.seakeer.sharing.design.pattern.a01structual.bridge.alpha;

import me.seakeer.sharing.design.pattern.a01structual.bridge.support.MyColor;

/**
 * Color: IAAdditiveAttribute 1;
 * 颜色：抽象附加属性（维度） 1
 * IAImplementor
 *
 * @author Seakeer;
 * @date 2020/3/11;
 */
public interface Color {

    /**
     * draw color
     *
     * @return color
     */
    MyColor drawColor();
}
