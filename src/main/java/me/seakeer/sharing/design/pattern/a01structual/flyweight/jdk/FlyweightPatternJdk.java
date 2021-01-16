package me.seakeer.sharing.design.pattern.a01structual.flyweight.jdk;

/**
 * FlyweightPatternJdk;
 *
 * @author Seakeer;
 * @date 2020/5/12;
 * @see java.lang.Number               --> IAFlyweight       1   抽象享元;
 * @see ...  -128 - 0                  --> ConcreteFlyweight 2_A 具体享元;
 * @see ...  0 - 127                   --> ConcreteFlyweight 2_B 具体享元;
 * @see java.lang.Integer.IntegerCache --> FlyweightFactory  3   享元工厂;
 * @see java.lang.String;
 */
public class FlyweightPatternJdk {

    public static void main(String[] args) {
        System.out.println("---------- IntegerCache ----------");
        testIntegerCache();

        System.out.println("---------- StringCache ----------");
        testStringPool();
    }

    private static void testStringPool() {

        // JVM先去字符串常量池(方法区)查找，不存在，在池中创建并返回引用地址给s1
        String s1 = "abc";
        // 池中查找到，将引用地址返回给s2;
        String s2 = "abc";
        // 池中查找到，则不在池中创建（否则会先在池中创建）；堆中创建，将堆中的对象地址返回给s3
        String s3 = new String("abc");
        // 同s4 = "abc"; 编译期处理;
        String s4 = "a" + "b" + "c";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);
    }

    private static void testIntegerCache() {
        System.out.println(Integer.valueOf(127) == Integer.valueOf(127));
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128));
        System.out.println(new Integer(127) == new Integer(127));
    }
}
