package me.seakeer.sharing.design.pattern.a02behavioral.memento.support;

/**
 * Piece;
 * 棋子；
 *
 * @author Seakeer;
 * @date 2020-12-20;
 */
public enum Piece {

    /* ********************* RED ********************* */
    /**
     * chariot;
     */
    CHARIOT("車", ColorSide.RED),

    KNIGHT("马", ColorSide.RED),

    MINISTER("相", ColorSide.RED),

    OFFICER("仕", ColorSide.RED),

    KING("帅", ColorSide.RED),

    CANNONEER("炮", ColorSide.RED),

    SOLDIER("兵", ColorSide.RED),

    /* ********************* BLACK ********************* */

    ROOK("车", ColorSide.BLACK),

    HORSE("马", ColorSide.BLACK),

    ELEPHANT("象", ColorSide.BLACK),

    GUARD("士", ColorSide.BLACK),

    GENERAL("将", ColorSide.BLACK),

    CANNON("炮", ColorSide.BLACK),

    PAWN("卒", ColorSide.BLACK);

    private final String chineseName;
    private final ColorSide colorSide;

    Piece(String chineseName, ColorSide colorSide) {
        this.chineseName = chineseName;
        this.colorSide = colorSide;
    }

    public String getChineseName() {
        return chineseName;
    }

    public ColorSide getColorSide() {
        return colorSide;
    }
}
