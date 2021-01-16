package me.seakeer.sharing.design.pattern.a02behavioral.mediator.alpha;

/**
 * Component: AColleague 1;
 * 组件类：抽象同事类;
 *
 * @author Seakeer;
 * @date 2020/3/29;
 */
public abstract class BaseComponent {

    protected AbstractComponentMediator mediator;
    private String value;

    public BaseComponent(AbstractComponentMediator mediator) {
        this.mediator = mediator;
    }

    public BaseComponent setMediator(AbstractComponentMediator mediator) {
        this.mediator = mediator;
        return this;
    }

    public String getValue() {
        return value;
    }

    public BaseComponent setValue(String value) {
        this.value = value;
        return this;
    }

    public void onEvent(Event event) {
        mediator.onEvent(this, event);
    }

    /**
     * Event;
     *
     * @author Seakeer;
     * @date 2020/4/3;
     */
    public enum Event {

        /**
         * input: search box;
         */
        INPUT,

        /**
         * click: button;
         */
        CLICK,

        /**
         * focus: list box select;
         */
        FOCUS,

        /**
         * show: text box;
         */
        SHOW
    }
}
