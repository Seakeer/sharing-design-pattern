package me.seakeer.sharing.design.pattern.a00creational.a00singleton.alpha;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ReflectBreakSingletonMain;
 * 测试反射破坏单例情况;
 *
 * @author Seakeer;
 * @date 2020/3/25;
 */
@SuppressWarnings("JavaReflectionMemberAccess")
public class ReflectBreakSingletonMain {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        DoubleValidateLockSingleton doubleValidateLockInstance = DoubleValidateLockSingleton.getInstance();
        Constructor<?>[] constructors = DoubleValidateLockSingleton.class.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        DoubleValidateLockSingleton doubleValidateLockObj = (DoubleValidateLockSingleton) constructors[0].newInstance();
        System.out.println("doubleValidateLockInstance == doubleValidateLockObj: "
                + (doubleValidateLockInstance == doubleValidateLockObj));

        StaticInnerClassSingleton staticInnerClassInstance = StaticInnerClassSingleton.getInstance();
        Constructor<StaticInnerClassSingleton> staticInnerClassConstructor = StaticInnerClassSingleton.class.getDeclaredConstructor((Class<?>[]) null);
        staticInnerClassConstructor.setAccessible(true);
        StaticInnerClassSingleton staticInnerClassObj = staticInnerClassConstructor.newInstance();
        System.out.println("staticInnerClassInstance == staticInnerClassObj: " +
                (staticInnerClassInstance == staticInnerClassObj));

        //enum 对象都是数Enum的子类, 其构造方法protected Enum(String name, int ordinal) {}
        Constructor<EnumSingleton> enumConstructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
        enumConstructor.setAccessible(true);
        EnumSingleton enumSingleton = enumConstructor.newInstance("INSTANCE", 0);
        System.out.println(EnumSingleton.INSTANCE == enumSingleton);
    }
}
