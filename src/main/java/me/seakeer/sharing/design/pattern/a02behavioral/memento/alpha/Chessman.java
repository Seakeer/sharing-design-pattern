package me.seakeer.sharing.design.pattern.a02behavioral.memento.alpha;

import me.seakeer.sharing.design.pattern.a02behavioral.memento.support.Piece;

/**
 * Chessman: Originator 1;
 * 象棋棋子类：原发器;
 * 需要保存内部状态的类;
 *
 * @author Seakeer;
 * @date 2020/3/30;
 */
public class Chessman {

    private Piece piece;
    private int posX;
    private int posY;

    public Chessman(Piece piece, int posX, int posY) {
        this.piece = piece;
        this.posX = posX;
        this.posY = posY;
    }

    public ChessmanMemento init() {
        return go(posX, posY);
    }

    public ChessmanMemento go(int x, int y) {
        setPosX(x).setPosY(y);
        display();
        return new ChessmanMemento(getPiece(), x, y);
    }

    public void display() {
        System.out.println(getPiece().getChineseName()
                + "(" + getPiece().getColorSide().getChineseName() + ")"
                + ":" + getPosX() + "," + getPosY());
    }

    public void restore(ChessmanMemento memento) {
        piece = memento.getPiece();
        posX = memento.getPosX();
        posY = memento.getPosY();
        display();
    }

    public Piece getPiece() {
        return piece;
    }

    public Chessman setPiece(Piece piece) {
        this.piece = piece;
        return this;
    }

    public int getPosX() {
        return posX;
    }

    public Chessman setPosX(int posX) {
        this.posX = posX;
        return this;
    }

    public int getPosY() {
        return posY;
    }

    public Chessman setPosY(int posY) {
        this.posY = posY;
        return this;
    }
}
