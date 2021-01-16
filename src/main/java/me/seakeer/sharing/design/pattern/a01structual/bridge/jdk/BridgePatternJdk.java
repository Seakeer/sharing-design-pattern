package me.seakeer.sharing.design.pattern.a01structual.bridge.jdk;

import java.util.logging.*;

/**
 * BridgePatternJdk;
 *
 * @author Seakeer;
 * @date 2020/5/12;
 * @see java.util.logging.Formatter       --> IAAdditiveAttribute       1 抽象附加属性;
 * @see java.util.logging.SimpleFormatter --> ConcreteAdditiveAttribute 2 具体附加属性;
 * @see java.util.logging.Handler         --> ABuildinAttribute         3 抽象固有属性;
 * @see java.util.logging.ConsoleHandler  --> ConcreteBuildinAttribute  4 具体固有属性;
 */
public class BridgePatternJdk {

    public static void main(String[] args) {
        Formatter formatter = new SimpleFormatter();
        Handler handler = new ConsoleHandler();
        handler.setFormatter(formatter);
        handler.publish(new LogRecord(Level.INFO, "HelloWorld"));
    }
}
