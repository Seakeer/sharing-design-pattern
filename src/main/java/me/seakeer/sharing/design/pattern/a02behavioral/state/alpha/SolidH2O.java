package me.seakeer.sharing.design.pattern.a02behavioral.state.alpha;

/**
 * SolidH2O: ConcreteState 2_A;
 * 固态H2O：具体状态类 2_A;
 *
 * @author Seakeer;
 * @date 2020/4/1;
 */
public class SolidH2O extends AbstractH2OStatus {

    public SolidH2O() {
        this("冰(Ice)", "冰窖(Icehouse)");
    }

    public SolidH2O(String alias, String container) {
        super(alias, container);
    }

    @Override
    public Status status() {
        return Status.SOLID;
    }
}
