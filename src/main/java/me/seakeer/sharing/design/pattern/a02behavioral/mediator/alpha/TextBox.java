package me.seakeer.sharing.design.pattern.a02behavioral.mediator.alpha;

/**
 * TextBox: ConcreteColleague 2_B;
 * 文本框组件：具体同事类 2_B
 *
 * @author Seakeer;
 * @date 2020/4/3;
 */
public class TextBox extends BaseComponent {

    public TextBox(AbstractComponentMediator mediator) {
        super(mediator);
    }

    public void showText(String value) {
        System.out.println("文本框显示：" + value);
    }
}
