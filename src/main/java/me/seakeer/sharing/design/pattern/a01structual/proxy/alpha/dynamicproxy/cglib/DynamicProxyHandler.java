package me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * DynamicProxyHandler;
 *
 * @author Seakeer;
 * @date 2020-04-12;
 */
public class DynamicProxyHandler implements MethodInterceptor {

    @SuppressWarnings("unchecked")
    public <T> T proxyEnhancer(Class<T> clz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("pre-sale service");
        Object o = proxy.invokeSuper(obj, args);
        System.out.println("after-sale service");
        return o;
    }
}
