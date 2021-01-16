package me.seakeer.sharing.design.pattern.a01structual.flyweight.alpha.support;

/**
 * Coordinate: ExtrinsicState;
 * 坐标类: 外部状态;
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getCoordinates() {

        return x + "," + y;
    }

    public int getX() {
        return x;
    }

    public Coordinate setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Coordinate setY(int y) {
        this.y = y;
        return this;
    }
}
