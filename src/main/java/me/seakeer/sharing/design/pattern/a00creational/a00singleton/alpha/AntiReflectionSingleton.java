package me.seakeer.sharing.design.pattern.a00creational.a00singleton.alpha;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * AntiReflectionSingleton;
 * 反射无法破坏的单例;
 * 懒加载下在构造方法防止反射破坏不可行(先反射后getInstance会创建两个实例)
 *
 * @author Seakeer;
 * @date 2020/3/25;
 */
public class AntiReflectionSingleton {

    private static final AntiReflectionSingleton INSTANCE = new AntiReflectionSingleton();
    // 使用标志位, 反射可进行修改
    // private static boolean initialized = false;

    private AntiReflectionSingleton() {
        //多线程反射调用安全
        synchronized (AntiReflectionSingleton.class) {
            if (null != INSTANCE) {
                throw new IllegalArgumentException("Cannot reflectively create AntiReflectionSingleton objects");
            }
        }
    }

    public static AntiReflectionSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor<AntiReflectionSingleton> constructor = AntiReflectionSingleton.class.getDeclaredConstructor((Class<?>[]) null);
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
