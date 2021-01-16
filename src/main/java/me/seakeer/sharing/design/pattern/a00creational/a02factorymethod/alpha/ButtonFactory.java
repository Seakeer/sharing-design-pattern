package me.seakeer.sharing.design.pattern.a00creational.a02factorymethod.alpha;

/**
 * ButtonFactory: IFactory 3;
 * 按钮工厂：抽象工厂角色 3
 *
 * @author Seakeer;
 * @date 2020/3/7;  2018/8/13;
 */
public interface ButtonFactory {

    /**
     * create button
     *
     * @return Button
     */
    Button createButton();
}
