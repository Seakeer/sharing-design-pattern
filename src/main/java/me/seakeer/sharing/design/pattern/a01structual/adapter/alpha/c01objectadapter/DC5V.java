package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c01objectadapter;

/**
 * DC5V: IATarget 2;
 * 5V直流：目标抽象类角色;
 * 对象适配器模式中可以为抽象类或接口;
 *
 * @author Seakeer;
 * @date 2020/3/10;
 */
public abstract class DC5V {

    /**
     * output
     *
     * @return power value
     */
    public abstract Integer output();
}
