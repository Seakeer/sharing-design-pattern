package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c00classadapter;

/**
 * DC5V: ITarget 2;
 * 5V直流：目标抽象类角色;
 * 类适配器模式中只能为接口;
 *
 * @author Seakeer;
 * @date 2020/3/10;
 */
public interface DC5V {

    /**
     * output
     *
     * @return power value
     */
    Integer output();
}
