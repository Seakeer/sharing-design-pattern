package me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha;

import me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha.support.ChessmanColor;
import me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha.support.Coordinate;

/**
 * BaseChessman: IAFlyweight 1;
 * 棋子: 抽象享元角色
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public abstract class BaseChessman {

    private Integer count = 0;

    /**
     * color;
     *
     * @return ChessmanColor.BLACK or ChessmanColor.WHITE;
     */
    public abstract ChessmanColor getColor();

    public void go(Coordinate coordinates) {

        System.out.println(getColor().name() + ++count + ": " + coordinates.getCoordinates());
    }
}
