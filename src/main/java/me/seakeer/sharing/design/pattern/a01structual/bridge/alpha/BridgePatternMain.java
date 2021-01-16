package me.seakeer.sharing.design.pattern.a01structual.bridge.alpha;

/**
 * BridgePatternMain;
 * 桥接模式：分离两个独立变化的维度（固有属性维度+附加属性维度），使两者可以独立扩展；
 * 如分离彩色图形的形状和颜色两个维度；
 * 抽象固有属性持有抽象附加属性;
 *
 * @author Seakeer;
 * @date 2020/3/11; 2018/8/31;
 * @see Color         --> IAAdditiveAttribute       1 抽象附加属性;
 * @see Red           --> ConcreteAdditiveAttribute 2 具体附加属性;
 * @see AbstractShape --> ABuildinAttribute         3 抽象固有属性;
 * @see Square        --> ConcreteBuildinAttribute  4 具体固有属性;
 */
public class BridgePatternMain {

    public static void main(String[] args) {

        Color color = new Red();
        AbstractShape colorfulShape = new Square();
        colorfulShape.setColor(color);
        colorfulShape.draw();
    }
}
