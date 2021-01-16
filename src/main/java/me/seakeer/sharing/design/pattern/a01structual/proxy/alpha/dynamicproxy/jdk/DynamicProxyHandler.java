package me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.dynamicproxy.jdk;

import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Business;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * DynamicProxyHandler;
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class DynamicProxyHandler implements InvocationHandler {

    private final Business business;

    public DynamicProxyHandler(Business business) {
        this.business = business;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("pre-sale service");
        Object rst = method.invoke(business, args);
        System.out.println("after-sale service");
        return rst;
    }
}
