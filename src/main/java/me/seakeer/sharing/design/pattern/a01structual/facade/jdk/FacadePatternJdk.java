package me.seakeer.sharing.design.pattern.a01structual.facade.jdk;


import java.util.Arrays;

/**
 * FacadePatternJdk;
 *
 * @author Seakeer;
 * @date 2020-12-05;
 * @see jakarta.faces.context.FacesContextFactory   --> Subsystem 1_A 子系统;
 * @see jakarta.faces.lifecycle.Lifecycle           --> Subsystem 1_B 子系统;
 * @see jakarta.servlet.ServletConfig               --> Subsystem 1_C 子系统;
 * @see jakarta.faces.webapp.FacesServlet#destroy() --> Facade    2   外观角色;
 * @see ...
 * @see org.apache.catalina.connector.Request       --> Subsystem 1   子系统;
 * @see org.apache.catalina.connector.RequestFacade --> Facade    2   外观角色;
 */
public class FacadePatternJdk {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }
}
