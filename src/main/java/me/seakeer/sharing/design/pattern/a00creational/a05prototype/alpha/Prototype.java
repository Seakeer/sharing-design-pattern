package me.seakeer.sharing.design.pattern.a00creational.a05prototype.alpha;

/**
 * Prototype: IACPrototype 1;
 * 抽象原型角色;
 *
 * @author Seakeer;
 * @date 2020/3/10; 2018/8/29;
 */
public interface Prototype {

    /**
     * clone
     *
     * @return ConcretePrototype
     */
    Prototype copy();
}
