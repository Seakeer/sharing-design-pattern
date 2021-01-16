package me.seakeer.sharing.design.pattern.a01structual.adapter.alpha.c02defaultadapter;

/**
 * DCOutput: IATarget 2;
 * 直流输出接口：目标抽象（类）角色;
 * 通常有大量方法
 *
 * @author Seakeer;
 * @date 2020/3/10;
 */
public interface DCOutput {

    /**
     * 5V output
     *
     * @return dc 5v
     */
    Integer output5v();

    /**
     * 9V output
     *
     * @return dc 9v
     */
    Integer output9v();

    /**
     * 12V output
     *
     * @return dc 12v
     */
    Integer output12v();

    /**
     * 24V output
     *
     * @return dc 24v
     */
    Integer output24v();
}
