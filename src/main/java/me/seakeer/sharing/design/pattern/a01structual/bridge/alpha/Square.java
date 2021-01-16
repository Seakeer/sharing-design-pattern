package me.seakeer.sharing.design.pattern.a01structual.bridge.alpha;

import me.seakeer.sharing.design.pattern.a01structual.bridge.support.MyShape;

/**
 * Square: ConcreteBuildinAttribute 4;
 * 正方形：具体固有属性（维度） 4
 * RefinedAbstraction
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public class Square extends AbstractShape {

    @Override
    public MyShape drawShape() {
        return MyShape.SQUARE;
    }
}
