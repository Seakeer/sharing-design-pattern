package me.seakeer.sharing.design.pattern.a02behavioral.state.alpha;

/**
 * LiquidH2O: ConcreteState 2_B;
 *
 * @author Seakeer;
 * @date 2020/4/1;
 */
public class LiquidH2O extends AbstractH2OStatus {

    public LiquidH2O() {
        this("水(Water)", "水杯(Cup)");
    }

    public LiquidH2O(String alias, String container) {
        super(alias, container);
    }

    @Override
    public Status status() {
        return Status.LIQUID;
    }
}
