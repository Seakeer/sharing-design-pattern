package me.seakeer.sharing.design.pattern.a02behavioral.command.alpha;

/**
 * AddCmd: ConcreteCommand 2_A;
 * 加法命令：具体命令类（角色）;
 *
 * @author Seakeer;
 * @date 2020/3/22;
 */
public class AddCmd extends BaseCalculateCmd {

    private final Adder adder = new Adder();

    @Override
    public float execute(float value) {
        return adder.add(value);
    }

    @Override
    public float execute(float value1, float value2) {
        return adder.add(value1, value2);
    }

    @Override
    public float undo() {
        return adder.undo();
    }
}
