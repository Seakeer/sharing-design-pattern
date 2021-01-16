package me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha;

import me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha.support.ChessmanColor;

/**
 * WhiteChessman: ConcreteFlyweight 2_B;
 * 白棋: 具体享元角色;
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class WhiteChessman extends BaseChessman {

    @Override
    public ChessmanColor getColor() {
        return ChessmanColor.WHITE;
    }
}
