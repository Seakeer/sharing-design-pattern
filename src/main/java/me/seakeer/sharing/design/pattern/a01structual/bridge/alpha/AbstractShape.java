package me.seakeer.sharing.design.pattern.a01structual.bridge.alpha;

import me.seakeer.sharing.design.pattern.a01structual.bridge.support.MyShape;

/**
 * AbstractShape: ABuildinAttribute 3;
 * 形状：抽象固有属性（维度） 3
 * AAbstraction
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public abstract class AbstractShape {

    protected Color color;

    public AbstractShape setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * draw shape
     *
     * @return MyShape
     */
    public abstract MyShape drawShape();

    public void draw() {
        System.out.println(color.drawColor().name() + " " + drawShape().name());
    }
}
