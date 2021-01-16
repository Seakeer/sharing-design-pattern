package me.seakeer.sharing.design.pattern.a02behavioral.memento.alpha;

import me.seakeer.sharing.design.pattern.a02behavioral.memento.support.Piece;

/**
 * ChessmanMemento: Memento 2;
 * 象棋备忘录类：备忘录（角色） 2;
 * 存储原发器内部状态；非public，只允许同包类访问;
 * 状态保存与恢复；
 *
 * @author Seakeer;
 * @date 2020/3/30;
 */
class ChessmanMemento {

    /**
     * 棋子
     */
    private Piece piece;
    private int posX;
    private int posY;

    public ChessmanMemento(Piece piece, int posX, int posY) {
        this.piece = piece;
        this.posX = posX;
        this.posY = posY;
    }

    public Piece getPiece() {
        return piece;
    }

    public ChessmanMemento setPiece(Piece piece) {
        this.piece = piece;
        return this;
    }

    public int getPosX() {
        return posX;
    }

    public ChessmanMemento setPosX(int posX) {
        this.posX = posX;
        return this;
    }

    public int getPosY() {
        return posY;
    }

    public ChessmanMemento setPosY(int posY) {
        this.posY = posY;
        return this;
    }
}
