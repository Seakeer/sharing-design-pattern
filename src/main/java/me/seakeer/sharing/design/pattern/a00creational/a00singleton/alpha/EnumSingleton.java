package me.seakeer.sharing.design.pattern.a00creational.a00singleton.alpha;

/**
 * EnumSingleton;
 * 多线程安全; 反射不能破坏;
 *
 * @author Seakeer;
 * @date 2020/3/3; 2018/7/19;
 */
public enum EnumSingleton {

    /**
     * instance
     */
    INSTANCE;

    public void otherMethod() {
    }
}