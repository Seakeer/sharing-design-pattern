package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c02defaultadapter;

import me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.AC220V;

/**
 * DC5VAdapter: ConcreteAdapter 4;
 * 直流5V适配器：具体适配器（类）角色;
 *
 * @author Seakeer;
 * @date 2020/3/10;
 */
public class DC5VAdapter extends AbstractPowerAdapter {

    public DC5VAdapter(AC220V ac220V) {
        super(ac220V);
    }

    @Override
    public Integer output5v() {
        if (null != ac220V) {
            return ac220V.output() / 44;
        }
        return 0;
    }
}
