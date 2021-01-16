package me.seakeer.sharing.design.pattern.a02behavioral.command.alpha;

/**
 * BaseCalculateCmd: IACommand 1;
 * 运算命令：抽象命令类（角色）
 *
 * @author Seakeer;
 * @date 2020/3/22;
 */
public abstract class BaseCalculateCmd {

    /**
     * execute;
     *
     * @param value number to execute
     * @return result
     */
    public abstract float execute(float value);

    /**
     * execute;
     *
     * @param value1
     * @param value2
     * @return
     */
    public abstract float execute(float value1, float value2);

    /**
     * undo
     *
     * @return
     */
    public abstract float undo();
}
