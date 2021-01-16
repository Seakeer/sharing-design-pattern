package me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.dynamicproxy.cglib;

import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Business;
import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Manufacturer;

/**
 * DynamicProxyPatternMain;
 * CGLIB的动态代理;
 * code generate library;
 *
 * @author Seakeer;
 * @date 2020-04-12;
 * @see Business                                 --> IASuject            1 抽象主题;
 * @see Manufacturer                             --> RealSubject         2 真实主题;
 * @see DynamicProxyHandler#proxyEnhancer(Class) --> Proxy,ProxyHandler  3 代理;
 * @see net.sf.cglib.proxy.MethodInterceptor     --> AbstractProxyHandler;
 */
public class DynamicProxyPatternMain {

    public static void main(String[] args) {
        //System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "src/main/resources");
        DynamicProxyHandler proxyHandler = new DynamicProxyHandler();
        Business dynamicProxy = proxyHandler.proxyEnhancer(Manufacturer.class);
        dynamicProxy.sellProduct();
    }
}
