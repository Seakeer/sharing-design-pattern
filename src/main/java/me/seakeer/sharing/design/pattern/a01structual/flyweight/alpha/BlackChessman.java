package me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha;

import me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha.support.ChessmanColor;

/**
 * BlackChessman: ConcreteFlyweight 2_A;
 * 黑棋：具体享元类
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class BlackChessman extends BaseChessman {

    @Override
    public ChessmanColor getColor() {
        return ChessmanColor.BLACK;
    }

}
