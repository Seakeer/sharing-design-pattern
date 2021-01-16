package me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha;

import me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha.support.ChessmanColor;
import me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha.support.Coordinate;

/**
 * FlyweightPatternMain;
 * 享元模式：运用共享技术（享元池、享元工厂）有效地支持大量细粒度对象的复用；
 * 享元池，对象复用；
 *
 * @author Seakeer;
 * @date 2020/3/15; 2018/8/16;
 * @see BaseChessman  --> IAFlyweight       1   抽象享元;
 * @see BlackChessman --> ConcreteFlyweight 2_A 具体享元;
 * @see WhiteChessman --> ConcreteFlyweight 2_B 具体享元;
 * @see ChessmanPool  --> FlyweightFactory  3   享元工厂;
 */
public class FlyweightPatternMain {

    public static void main(String[] args) {

        ChessmanPool chessmanPool = ChessmanPool.getChessmanPool();

        BaseChessman blackChessman = chessmanPool.getChessman(ChessmanColor.BLACK);
        BaseChessman whiteChessman = chessmanPool.getChessman(ChessmanColor.WHITE);

        blackChessman.go(new Coordinate(0, 0));
        whiteChessman.go(new Coordinate(0, 1));
        blackChessman.go(new Coordinate(1, 0));
        whiteChessman.go(new Coordinate(1, 1));


        BaseChessman chessman = chessmanPool.getChessman(ChessmanColor.BLACK);
        System.out.println(chessman.equals(blackChessman));
        System.out.println(chessman == blackChessman);

    }
}
