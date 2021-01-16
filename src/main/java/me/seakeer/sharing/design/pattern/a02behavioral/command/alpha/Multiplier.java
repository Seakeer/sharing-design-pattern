package me.seakeer.sharing.design.pattern.a02behavioral.command.alpha;

/**
 * Multiplier: Receiver 3_B;
 * 乘法器：接收者;
 *
 * @author Seakeer;
 * @date 2020/3/22;
 */
public class Multiplier {

    private float result = 1.0F;

    private float cur = 1.0F;

    public float multiply(float v) {
        cur = v;
        return result();
    }

    public float multiply(float v1, float v2) {
        result = v1;
        cur = v2;
        return result();
    }

    public float undo() {
        if (0 != cur) {
            result /= cur;
            cur = 1;
            return result;
        }
        return Float.NaN;
    }

    private float result() {
        return result *= cur;
    }
}
