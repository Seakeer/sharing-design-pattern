package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c02defaultadapter;

import me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.AC220V;

/**
 * AbstractPowerAdapter: ADefaultAdapter 3;
 * 电源(AC220 to DC)适配器类：默认适配器角色;
 * 该缺省适配器模式采用对象适配器模式实现，对象适配器应用较多（合成复用原则）;
 *
 * @author Seakeer;
 * @date 2020/3/10;
 */
public abstract class AbstractPowerAdapter implements DCOutput {

    protected AC220V ac220V;

    public AbstractPowerAdapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public Integer output5v() {
        return null;
    }

    @Override
    public Integer output9v() {
        return null;
    }

    @Override
    public Integer output12v() {
        return null;
    }

    @Override
    public Integer output24v() {
        return null;
    }
}
