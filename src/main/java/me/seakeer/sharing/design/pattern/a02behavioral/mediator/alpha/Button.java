package me.seakeer.sharing.design.pattern.a02behavioral.mediator.alpha;

/**
 * Button: ConcreteColleague 2_A;
 * 按钮类：具体同事类;
 *
 * @author Seakeer;
 * @date 2020/3/29;
 */
public class Button extends BaseComponent {

    public Button(AbstractComponentMediator mediator) {
        super(mediator);
    }

    public void active() {
        System.out.println("Button Was Active");
    }

    public void click() {
        System.out.println("Button Was Clicked");
    }
}
