package me.seakeer.sharing.design.pattern.a00creational.a01staticfactory.jdk;


import java.nio.charset.Charset;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * StaticFactoryPatternJdk;
 * Charset.forName();
 * 省略工厂类。
 *
 * @author Seakeer;
 * @date 2020-12-02;
 * @see java.util.ResourceBundle                   --> IAProduct       1   抽象产品;
 * @see java.util.PropertyResourceBundle           --> ConcreteProduct 2_A 具体产品;
 * @see sun.util.resources.cldr.CalendarData       --> ConcreteProduct 2_B 具体产品;
 * @see java.util.ResourceBundle#getBundle(String) --> StaticFactory   3   静态工厂;
 * @see java.nio.charset.Charset#forName(String)
 * @see java.util.Calendar#getInstance(Locale)
 */
public class StaticFactoryPatternJdk {

    public static void main(String[] args) {
        resourceBundleExample();
        charsetExample();
    }

    private static void charsetExample() {
        Charset utf8 = Charset.forName("UTF-8");
        System.out.println(utf8.displayName());
        Charset ascii = Charset.forName("ASCII");
        System.out.println(ascii.displayName(Locale.GERMAN));
    }

    private static void resourceBundleExample() {
        ResourceBundle propertyResourceBundle = ResourceBundle.getBundle("i18n", new Locale("zh", "CN"));
        ResourceBundle listResourceBundle = ResourceBundle.getBundle("sun.util.resources.CalendarData", Locale.US);
        System.out.println(listResourceBundle.getString("firstDayOfWeek"));
        System.out.println(propertyResourceBundle.getString("key"));
    }
}
