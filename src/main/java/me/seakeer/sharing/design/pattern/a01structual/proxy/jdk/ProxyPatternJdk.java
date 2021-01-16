package me.seakeer.sharing.design.pattern.a01structual.proxy.jdk;

import javax.management.openmbean.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * ProxyPatternJdk;
 *
 * @author Seakeer;
 * @date 2020-12-05;
 * @see com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory.CompositeBuilderViaProxy
 * @see javax.management.openmbean.CompositeDataInvocationHandler
 * @see java.lang.reflect.InvocationHandler
 */
public class ProxyPatternJdk {

    public static void main(String[] args) throws OpenDataException {
        CompositeData compositeData =
                new CompositeDataSupport(
                        new CompositeType("namedNumber", "Named Number",
                                new String[]{"name", "number"}, new String[]{"name", "number"},
                                new SimpleType<?>[]{SimpleType.STRING, SimpleType.INTEGER}),
                        new String[]{"name", "number"},
                        new Object[]{"lucky", 9}
                );
        InvocationHandler invocationHandler = new CompositeDataInvocationHandler(compositeData);
        ClassLoader classLoader = NamedNumber.class.getClassLoader();
        NamedNumber namedNumber = (NamedNumber) Proxy.newProxyInstance(classLoader, new Class[]{NamedNumber.class}, invocationHandler);
        System.out.println(namedNumber.getName() + ": " + namedNumber.getNumber());
    }

    public interface NamedNumber {

        /***
         * name;
         *
         * @return name;
         */
        String getName();

        /**
         * number;
         *
         * @return number;
         */
        int getNumber();
    }
}
