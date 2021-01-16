package me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha;

import me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha.support.ChessmanColor;

import java.util.HashMap;

/**
 * ChessmanPool: FlyweightFactory 3;
 * 棋子池: 享元工厂角色;
 * 静态工厂;
 * 单例(急加载)
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class ChessmanPool {

    private static final ChessmanPool CHESSMAN_POOL = new ChessmanPool();

    private HashMap<ChessmanColor, BaseChessman> colorChessmanMap;

    private ChessmanPool() {
        colorChessmanMap = new HashMap<>(2);
        colorChessmanMap.put(ChessmanColor.BLACK, new BlackChessman());
        colorChessmanMap.put(ChessmanColor.WHITE, new WhiteChessman());
    }

    public static ChessmanPool getChessmanPool() {
        return CHESSMAN_POOL;
    }

    public BaseChessman getChessman(ChessmanColor chessmanColor) {
        return colorChessmanMap.get(chessmanColor);
    }
}
