package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c01objectadapter;

import me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.AC220V;

/**
 * AbstractPowerAdapter: ObjectAdapter 3;
 * 电源（AC220V to DC5V） 对象适配器：适配器（类）角色;
 * 对象适配器模式中，适配器与被适配者之间是关联关系（拥有 has-a);
 *
 * @author Seakeer;
 * @date 2020/3/10;
 */
public class PowerAdapter extends DC5V {

    private final AC220V ac220V;

    public PowerAdapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public Integer output() {
        int outPut = 0;
        if (null != ac220V) {
            outPut = ac220V.output() / 44;
        }
        return outPut;
    }
}
