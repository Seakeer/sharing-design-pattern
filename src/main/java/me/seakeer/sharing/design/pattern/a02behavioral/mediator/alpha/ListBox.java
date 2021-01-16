package me.seakeer.sharing.design.pattern.a02behavioral.mediator.alpha;

/**
 * ListBox: ConcreteColleague 2_C;
 * 列表框组件：具体同事类 2_C
 *
 * @author Seakeer;
 * @date 2020/4/3;
 */
public class ListBox extends BaseComponent {

    public ListBox(AbstractComponentMediator mediator) {
        super(mediator);
    }

    public void focus(String value) {
        System.out.println("列表框选中项：" + value);
        this.setValue(value);
    }

    public void add(String value) {
        System.out.println("列表框增加一项:" + value);
    }
}
