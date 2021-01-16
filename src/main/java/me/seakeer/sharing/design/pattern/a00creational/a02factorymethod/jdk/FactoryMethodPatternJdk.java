package me.seakeer.sharing.design.pattern.a00creational.a02factorymethod.jdk;

import sun.nio.cs.StandardCharsets;
import sun.nio.cs.ext.ExtendedCharsets;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * FactoryMethodPatternJdk;
 *
 * @author Seakeer;
 * @date 2020-12-01;
 * @see java.nio.charset.Charset             --> IAProduct       1   抽象产品;
 * @see sun.nio.cs.UTF_8                     --> ConcreteProduct 2_A 具体产品;
 * @see sun.nio.cs.ext.GBK                   --> ConcreteProduct 2_B 具体产品;
 * @see java.nio.charset.spi.CharsetProvider --> IFactory        3   抽象工厂;
 * @see sun.nio.cs.StandardCharsets          --> ConcreteFactory 4_A 具体工厂;
 * @see sun.nio.cs.ext.ExtendedCharsets      --> ConcreteFactory 4_B 具体工厂;
 */
public class FactoryMethodPatternJdk {

    public static void main(String[] args) {
        charsetExample();
        threadExample();
    }

    private static void charsetExample() {
        CharsetProvider standardCharsetsProvider = new StandardCharsets();
        Charset utf8 = standardCharsetsProvider.charsetForName("UTF-8");
        System.out.println(utf8.displayName());

        CharsetProvider extendedCharsetsProvider = new ExtendedCharsets();
        Charset gbk = extendedCharsetsProvider.charsetForName("GBK");
        System.out.println(gbk.displayName(Locale.CHINA));
    }

    /**
     * @see java.lang.Thread                                             --> IAProduct       1   抽象产品;
     * @see defaultThread                                                --> ConcreteProduct 2_A 具体产品;
     * @see urlLoaderThread                                              --> ConcreteProduct 2_B 具体产品;
     * @see java.util.concurrent.ThreadFactory                           --> IFactory        3   抽象工厂;
     * @see java.util.concurrent.Executors.DefaultThreadFactory          --> ConcreteFactory 4_A 具体工厂;
     * @see com.sun.webkit.network.NetworkContext.URLLoaderThreadFactory --> ConcreteFactory 4_B 具体工厂;
     */
    private static void threadExample() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5,
                10,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1024),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolExecutor.submit(() -> System.out.println("Hello World"));
    }
}
