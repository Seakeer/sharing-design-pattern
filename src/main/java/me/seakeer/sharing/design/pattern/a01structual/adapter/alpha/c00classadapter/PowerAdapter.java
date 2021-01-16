package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c00classadapter;

import me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.AC220V;

/**
 * AbstractPowerAdapter: ClassAdapter 3;
 * 电源（AC220V to DC5V）适配器：适配器角色;
 * 类适配器模式中，适配器与被适配者是继承关系(is-a);
 *
 * @author Seakeer;
 * @date 2020/3/10;
 */
public class PowerAdapter extends AC220V implements DC5V {

    @Override
    public Integer output() {
        Integer ac220V = super.output();
        return ac220V / 44;
    }
}
