package me.seakeer.sharing.design.pattern.a02behavioral.command.alpha;

/**
 * MultiplyCmd: ConcreteCommand 2_B;
 * 乘法命令：具体命令类（角色）;
 *
 * @author Seakeer;
 * @date 2020/3/22;
 */
public class MultiplyCmd extends BaseCalculateCmd {

    private final Multiplier multiplier = new Multiplier();

    @Override
    public float execute(float value) {
        return multiplier.multiply(value);
    }

    @Override
    public float execute(float value1, float value2) {
        return multiplier.multiply(value1, value2);
    }

    @Override
    public float undo() {
        return multiplier.undo();
    }
}
