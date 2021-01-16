package me.seakeer.sharing.design.pattern.a01structual.decorator.alpha;

/**
 * TextReader: ConcreteComponent 2;
 * 文本阅读器: 具体构件角色
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class TextReader implements Reader {

    @Override
    public void read() {
        System.out.println("Can Read Text");
    }
}
