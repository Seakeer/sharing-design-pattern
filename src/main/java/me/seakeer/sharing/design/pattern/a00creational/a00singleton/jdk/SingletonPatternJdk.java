package me.seakeer.sharing.design.pattern.a00creational.a00singleton.jdk;

import java.util.concurrent.TimeUnit;

/**
 * SingletonPatternJdk;
 *
 * @author Seakeer;
 * @date 2020-11-30;
 * @see java.lang.Runtime;
 */
public class SingletonPatternJdk {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Runtime.getRuntime());
        System.out.println(Runtime.getRuntime());
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Shutdown hook executed.")));

        TimeUnit.SECONDS.sleep(1);
        System.out.println("availableProcessors: " + Runtime.getRuntime().availableProcessors());
        TimeUnit.SECONDS.sleep(5);
    }
}
