package me.seakeer.sharing.design.pattern.a02behavioral.state.alpha;

/**
 * GasH2O: ConcreteState 2_C;
 *
 * @author Seakeer;
 * @date 2020/4/1;
 */
public class GasH2O extends AbstractH2OStatus {

    public GasH2O() {
        this("水蒸气(Vapour)", "集气瓶(Gas Bottle)");
    }

    public GasH2O(String alias, String container) {
        super(alias, container);
    }

    @Override
    public Status status() {
        return Status.GAS;
    }
}
