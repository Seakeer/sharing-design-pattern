package me.seakeer.sharing.design.pattern.a00creational.a00singleton.alpha;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * SingletonPatternMain;
 * 单例模式：确保一个类只有一个实例，并提供一个全局访问点（收缩范围，统一管理）;
 * 构造方法私有；提供访问实例的静态方法;
 *
 * @author Seakeer;
 * @date 2020/3/3; 2018/7/19;
 * @see LazyLoadSingleThreadSingleton --> e.g.1;
 * @see LazyLoadMultiThreadSingleton  --> e.g.2;
 * @see EagerLoadSingleton            --> e.g.3;
 * @see DoubleValidateLockSingleton   --> e.g.4;
 * @see StaticInnerClassSingleton     --> e.g.5;
 * @see EnumSingleton                 --> e.g.6;
 * @see ReflectBreakSingletonMain
 * @see AntiReflectionSingleton
 */
@SuppressWarnings("rawtypes")
public class SingletonPatternMain {

    public static final int THREAD_COUNT = 3;

    public static void main(String[] args) throws InterruptedException {

        Vector lazyLoadSingleThreadSingletonVector = new Vector<>();
        Vector lazyLoadMultiThreadSingletonVector = new Vector<>();
        Vector eagerLoadSingletonVector = new Vector<>();
        Vector doubleValidateLockSingletonVector = new Vector<>();
        Vector staticInnerClassSingletonVector = new Vector<>();
        Vector enumSingletonVector = new Vector<>();

        CountDownLatch countDownLatch = new CountDownLatch(2);

        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(() -> {
                lazyLoadSingleThreadSingletonVector.add(LazyLoadSingleThreadSingleton.getInstance());
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lazyLoadMultiThreadSingletonVector.add(LazyLoadMultiThreadSingleton.getInstance());
                eagerLoadSingletonVector.add(EagerLoadSingleton.getInstance());
                doubleValidateLockSingletonVector.add(DoubleValidateLockSingleton.getInstance());
                staticInnerClassSingletonVector.add(StaticInnerClassSingleton.getInstance());
                enumSingletonVector.add(EnumSingleton.INSTANCE);
                //线程结束，统计数量减一
                countDownLatch.countDown();
            }).start();
        }

        //等待所有线程执行完毕
        countDownLatch.await();

        System.out.println("-----------------");
        System.out.println("多线程下验证单例模式");
        System.out.println("-----------------");

        System.out.println("------LazyLoadSingleThreadSingleton------");

        Iterator iter = lazyLoadSingleThreadSingletonVector.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        System.out.println("------LazyLoadMultiThreadSingleton------");

        iter = lazyLoadMultiThreadSingletonVector.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        System.out.println("------EagerLoadSingleton------");

        iter = eagerLoadSingletonVector.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("------DoubleValidateLockSingleton------");

        iter = doubleValidateLockSingletonVector.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("------StaticInnerClassSingleton------");

        iter = staticInnerClassSingletonVector.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("------EnumSingleton------");

        iter = enumSingletonVector.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}