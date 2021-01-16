package me.seakeer.sharing.design.pattern.a02behavioral.mediator.alpha;

/**
 * ConcreteComponentMediator: ConcreteMediator 4;
 * 具体组件中介者类：具体中介者类 4;
 *
 * @author Seakeer;
 * @date 2020/4/3;
 */
public class ConcreteComponentMediator extends AbstractComponentMediator {

    private SearchBox searchBox;
    private Button button;
    private ListBox listBox;
    private TextBox textBox;

    @Override
    public void onEvent(BaseComponent component, BaseComponent.Event event) {

        String text = "Hello World";

        if (component instanceof SearchBox) {
            System.out.println("---搜索框SearchBox---");
            if (BaseComponent.Event.INPUT.equals(event)) {
                searchBox.input(text);
                button.active();
            }
        }
        if (component instanceof Button) {
            System.out.println("---按钮Button---");
            if (BaseComponent.Event.CLICK.equals(event)) {
                button.click();
                listBox.focus(searchBox.getValue());
                textBox.showText(searchBox.getValue());
            }
        }
        if (component instanceof ListBox) {
            System.out.println("---列表框ListBox---");
            if (BaseComponent.Event.FOCUS.equals(event)) {
                listBox.focus(text);
                textBox.showText(listBox.getValue());
                searchBox.input(listBox.getValue());
            }
        }
        if (component instanceof TextBox) {
            System.out.println("---文本框TextBox---");
            if (BaseComponent.Event.SHOW.equals(event)) {
                textBox.showText(listBox.getValue());
            }
        }
    }

    public Button getButton() {
        return button;
    }

    public ConcreteComponentMediator setButton(Button button) {
        this.button = button;
        return this;
    }

    public ListBox getListBox() {
        return listBox;
    }

    public ConcreteComponentMediator setListBox(ListBox listBox) {
        this.listBox = listBox;
        return this;
    }

    public TextBox getTextBox() {
        return textBox;
    }

    public ConcreteComponentMediator setTextBox(TextBox textBox) {
        this.textBox = textBox;
        return this;
    }

    public SearchBox getSearchBox() {
        return searchBox;
    }

    public ConcreteComponentMediator setSearchBox(SearchBox searchBox) {
        this.searchBox = searchBox;
        return this;
    }
}
