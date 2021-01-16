package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.alpha;

/**
 * Button: IProduct 1_A;
 * 按钮：抽象产品角色
 * 对Linux、Windows等类型的Button的抽象
 * 从产品族（产品类型）抽象出的产品等级结构（产品）
 *
 * @author Seakeer;
 * @date 2020/3/7; 2018/8/13;
 */
public interface Button {

    /**
     * on click
     */
    void onClick();
}
