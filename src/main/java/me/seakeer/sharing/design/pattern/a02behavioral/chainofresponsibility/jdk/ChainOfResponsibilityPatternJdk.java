package me.seakeer.sharing.design.pattern.a02behavioral.chainofresponsibility.jdk;


import org.apache.catalina.startup.Bootstrap;

/**
 * ChainOfResponsibilityPatternJdk;
 *
 * @author Seakeer;
 * @date 2020-12-13;
 * @see jakarta.servlet.ServletResponse
 * @see jakarta.servlet.ServletRequest
 * @see jakarta.servlet.Filter
 * @see jakarta.servlet.FilterChain
 * @see jakarta.servlet.FilterConfig
 * @see org.apache.catalina.connector.RequestFacade            --> Requester       1   请求者;
 * @see org.apache.catalina.filters.FilterBase                 --> AHandler        2   抽象处理者;
 * @see org.apache.catalina.filters.HttpHeaderSecurityFilter   --> ConcreteHandler 3_A 具体处理者;
 * @see org.apache.catalina.filters.SetCharacterEncodingFilter --> ConcreteHandler 3_B 具体处理者;
 * @see org.apache.catalina.filters.FailedRequestFilter        --> ConcreteHandler 3_C 具体处理者;
 */
public class ChainOfResponsibilityPatternJdk {

    /**
     * -Dcatalina.home=./src/main/resources/tomcat
     * 启动tomcat
     * 访问localhost:8080
     * doFilter实现加断点可debug跟踪Filter的执行过程
     */
    public static void main(String[] args) {
        Bootstrap.main(args);
    }
}
