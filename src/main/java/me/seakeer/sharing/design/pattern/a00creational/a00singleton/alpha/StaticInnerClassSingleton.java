package me.seakeer.sharing.design.pattern.a00creational.a00singleton.alpha;

/**
 * StaticInnerClassSingleton;
 * 静态内部类，懒加载
 *
 * @author Seakeer;
 * @date 2020/3/3; 2018/7/19;
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {

        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}