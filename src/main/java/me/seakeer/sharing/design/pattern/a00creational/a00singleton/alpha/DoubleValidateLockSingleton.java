package me.seakeer.sharing.design.pattern.a00creational.a00singleton.alpha;

/**
 * DoubleValidateLockSingleton;
 * 双重校验锁，懒加载
 *
 * @author Seakeer;
 * @date 2020/3/3; 2018/7/19;
 */
public class DoubleValidateLockSingleton {

    /**
     * volatile:
     * 1.保证内存可见性： 共享变量对所有线程的可见性
     * 2.禁止指令重排序优化
     */
    private static volatile DoubleValidateLockSingleton instance;

    private DoubleValidateLockSingleton() {
    }

    public static DoubleValidateLockSingleton getInstance() {
        // 第一重校验
        // 未加锁, 使用volatile保证内存可见性以及禁止指令重排
        // (new 非原子性, 指令重排可能导致 null != instance但instance未实例化完成)
        if (null == instance) {
            //锁定创建实例的代码块
            synchronized (DoubleValidateLockSingleton.class) {
                // 第二重校验
                if (null == instance) {
                    //1. 分配堆空间; 2. 实例化(构造方法等) 3. 指向堆空间
                    //volatile保证顺序1->2->3; 1->3->2可能会导致instance未实例化完成
                    instance = new DoubleValidateLockSingleton();
                }
            }
        }

        return instance;
    }
}
