package me.seakeer.sharing.design.pattern.a02behavioral.mediator.alpha;

/**
 * MediatorPatternMain;
 * 中介者模式: 对象网状结构松耦为以中介者为中心的星形结构；中转和协调;
 * 中介者和同事类互相关联;
 *
 * @author Seakeer;
 * @date 2020/3/29; 2018/8/20;
 * @see BaseComponent              --> AColleague        1   抽象同事类;
 * @see Button                     --> ConcreteColleague 2_A 具体同事类;
 * @see TextBox                    --> ConcreteColleague 2_B 具体同事类;
 * @see ListBox                    --> ConcreteColleague 2_C 具体同事类;
 * @see SearchBox                  --> ConcreteColleague 2_D 具体同事类;
 * @see AbstractComponentMediator  --> IAMediator        3   抽象中介者类;
 * @see ConcreteComponentMediator  --> ConcreteMediator  4   具体中介者类;
 */
public class MediatorPatternMain {

    public static void main(String[] args) {

        ConcreteComponentMediator mediator = new ConcreteComponentMediator();

        SearchBox searchBox = new SearchBox(mediator);
        Button button = new Button(mediator);
        ListBox listBox = new ListBox(mediator);
        TextBox textBox = new TextBox(mediator);

        mediator.setSearchBox(searchBox)
                .setButton(button)
                .setListBox(listBox)
                .setTextBox(textBox);

        searchBox.onEvent(BaseComponent.Event.INPUT);
        button.onEvent(BaseComponent.Event.CLICK);
        listBox.onEvent(BaseComponent.Event.FOCUS);
        textBox.onEvent(BaseComponent.Event.SHOW);
    }
}
