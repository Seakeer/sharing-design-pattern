package me.seakeer.sharing.design.pattern.a02behavioral.state.jdk;

import java.util.Arrays;

/**
 * StatePatternJdk;
 *
 * @author Seakeer;
 * @date 2020-11-15;
 * @see javax.faces.lifecycle.Lifecycle       --> IAState       1   抽象状态类;
 * @see com.sun.faces.lifecycle.LifecycleImpl --> ConcreteState 2_A 具体状态类;
 * @see com.sun.faces.action.ActionLifecycle  --> ConcreteState 2_B 具体状态类;
 * @see javax.faces.webapp.FacesServlet#init  --> Context       3   环境类;
 */
public class StatePatternJdk {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }
}
