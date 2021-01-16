package me.seakeer.sharing.design.pattern.a00creational.a00singleton.alpha;

/**
 * EagerLoadSingleton;
 * 急加载，线程同步
 *
 * @author Seakeer;
 * @date 2020/3/3; 2018/7/19;
 * @see Runtime 即采用该方式创建单例
 */
public class EagerLoadSingleton {

    private static EagerLoadSingleton instance = new EagerLoadSingleton();

    /*
    或采用动态代码块
    static {
        instance = new EagerLoadSingleton();
    }
    */

    private EagerLoadSingleton() {
    }

    public static EagerLoadSingleton getInstance() {
        return instance;
    }
}