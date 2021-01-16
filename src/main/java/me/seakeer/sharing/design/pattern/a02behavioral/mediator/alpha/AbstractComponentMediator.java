package me.seakeer.sharing.design.pattern.a02behavioral.mediator.alpha;

/**
 * ComponentMediator: IAMediator 3;
 * 组件中介者类：抽象中介者类 3;
 *
 * @author Seakeer;
 * @date 2020/4/3;
 */
public abstract class AbstractComponentMediator {

    /**
     * on event;
     *
     * @param component
     * @param event
     */
    public abstract void onEvent(BaseComponent component, BaseComponent.Event event);
}
