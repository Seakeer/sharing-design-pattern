package me.seakeer.sharing.design.pattern.a02behavioral.memento.support;

/**
 * ColorSide;
 *
 * @author Seakeer;
 * @date 2020-12-20;
 */
public enum ColorSide {

    /**
     * red side;
     */
    RED("红"),

    /**
     * black side;
     */
    BLACK("黑");

    private final String chineseName;

    ColorSide(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getChineseName() {
        return chineseName;
    }
}