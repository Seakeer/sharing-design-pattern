package me.seakeer.sharing.design.pattern.a02behavioral.command.alpha;

/**
 * Adder: Receiver 3_A;
 * 加法器：接收者;
 *
 * @author Seakeer;
 * @date 2020/3/22;
 */
public class Adder {

    private float result = 0;

    private float cur = 0;

    public float add(float value) {
        cur = value;
        return result();
    }

    public float add(float value1, float value2) {
        result = value1;
        cur = value2;
        return result();
    }

    public float undo() {
        result -= cur;
        cur = 0;
        return result;
    }

    private float result() {
        return result += cur;
    }
}
