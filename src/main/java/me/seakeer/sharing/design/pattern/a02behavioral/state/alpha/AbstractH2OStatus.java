package me.seakeer.sharing.design.pattern.a02behavioral.state.alpha;

/**
 * AbstractH2OStatus: IAState 1;
 * H2O状态：抽象状态类 1;
 *
 * @author Seakeer;
 * @date 2020/4/1;
 */
public abstract class AbstractH2OStatus {

    private final String alias;

    private final String container;

    public AbstractH2OStatus() {
        this("UNKNOWN", "UNKNOWN");
    }

    public AbstractH2OStatus(String alias, String container) {
        this.alias = alias;
        this.container = container;
    }

    /**
     * alias;
     *
     * @return alias;
     */
    public String alias() {
        return this.alias;
    }

    /**
     * container;
     *
     * @return container;
     */
    public String container() {
        return this.container;
    }

    /**
     * status;
     *
     * @return status;
     */
    public abstract Status status();

    /**
     * Status;
     *
     * @author Seakeer;
     * @date 2020/4/1;
     */
    public enum Status {

        /**
         * solid
         */
        SOLID,

        /**
         * liquid
         */
        LIQUID,

        /**
         * gas
         */
        GAS
    }
}
