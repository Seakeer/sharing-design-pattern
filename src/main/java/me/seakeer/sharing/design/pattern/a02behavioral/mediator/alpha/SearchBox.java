package me.seakeer.sharing.design.pattern.a02behavioral.mediator.alpha;

/**
 * ChoiceListComboBox: ConcreteColleague 2_D;
 * 搜索框组件：具体同事类 2_D;
 *
 * @author Seakeer;
 * @date 2020/4/3;
 */
public class SearchBox extends BaseComponent {

    public SearchBox(AbstractComponentMediator mediator) {
        super(mediator);
    }

    public void input(String value) {
        System.out.println("搜索框输入：" + value);
        this.setValue(value);
    }
}
