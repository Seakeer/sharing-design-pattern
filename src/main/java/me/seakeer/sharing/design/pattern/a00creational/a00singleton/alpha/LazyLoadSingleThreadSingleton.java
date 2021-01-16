package me.seakeer.sharing.design.pattern.a00creational.a00singleton.alpha;

/**
 * LazyLoadSingleThreadSingleton;
 * 懒加载,单线程,单例;
 *
 * @author Seakeer;
 * @date 2020/3/3; 2018/7/19;
 */
public class LazyLoadSingleThreadSingleton {

    private static LazyLoadSingleThreadSingleton instance;

    private LazyLoadSingleThreadSingleton() {
    }

    public static LazyLoadSingleThreadSingleton getInstance() {

        if (null == instance) {
            instance = new LazyLoadSingleThreadSingleton();
        }
        return instance;
    }
}