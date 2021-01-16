package me.seakeer.sharing.design.pattern.a00creational.a00singleton.alpha;

/**
 * LazyLoadMultiThreadSingleton;
 * 懒加载，多线程，单例
 *
 * @author Seakeer;
 * @date 2020/3/3; 2018/7/19;
 */
public class LazyLoadMultiThreadSingleton {

    private static LazyLoadMultiThreadSingleton instance;

    private LazyLoadMultiThreadSingleton() {
    }

    public static synchronized LazyLoadMultiThreadSingleton getInstance() {
        if (null == instance) {
            instance = new LazyLoadMultiThreadSingleton();
        }
        return instance;
    }
}