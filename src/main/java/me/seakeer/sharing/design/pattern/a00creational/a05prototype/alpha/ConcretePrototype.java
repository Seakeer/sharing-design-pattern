package me.seakeer.sharing.design.pattern.a00creational.a05prototype.alpha;

/**
 * ConcretePrototype;
 * 具体原型角色 2
 *
 * @author Seakeer;
 * @date 2020/3/10; 2018/8/29;
 */
public class ConcretePrototype implements Prototype {

    private String attr;

    public String getAttr() {
        return attr;
    }

    public ConcretePrototype setAttr(String attr) {
        this.attr = attr;
        return this;
    }

    @Override
    public Prototype copy() {
        return new ConcretePrototype().setAttr(this.getAttr());
    }
}
