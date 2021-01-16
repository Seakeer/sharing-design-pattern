package me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.dynamicproxy.jdk;

import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Business;
import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Manufacturer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * DynamicProxyPatternMain;
 * JDK的动态代理模式;
 * 代理模式：通过代理对象来间接访问无法直接访问或直接访问有困难的对象；
 * 代理角色关联或继承真实主题角色；
 *
 * @author Seakeer;
 * @date 2020/3/15; 2018/8/17;
 * @see Business                            --> IASuject     1 抽象主题;
 * @see Manufacturer                        --> RealSubject  2 真实主题;
 * @see java.lang.reflect.Proxy             --> Proxy        3 代理;
 * @see java.lang.reflect.InvocationHandler --> AbstractProxyHandler;
 * @see DynamicProxyHandler                 --> ProxyHandler;
 */
public class DynamicProxyPatternMain {

    public static void main(String[] args) {
        // 保存代理类class文件
        // System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Business business = new Manufacturer();
        InvocationHandler invocationHandler = new DynamicProxyHandler(business);
        ClassLoader classLoader = business.getClass().getClassLoader();
        // 反射创建代理类
        Business proxy = (Business) Proxy.newProxyInstance(classLoader, business.getClass().getInterfaces(), invocationHandler);
        proxy.sellProduct();
    }
}
