package me.seakeer.sharing.design.pattern.a01structual.decorator.alpha;

/**
 * SuperReader: ACDecorator 3;
 * 超级阅读器: 抽象装饰者角色
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class SuperReader implements Reader {

    private Reader reader;

    public SuperReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public void read() {
        reader.read();
    }
}
