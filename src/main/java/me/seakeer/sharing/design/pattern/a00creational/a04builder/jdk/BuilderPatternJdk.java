package me.seakeer.sharing.design.pattern.a00creational.a04builder.jdk;

/**
 * BuilderPatternJdk;
 *
 * @author Seakeer;
 * @date 2020-12-04;
 * @see java.lang.String                           --> Product         1   产品角色;
 * @see java.lang.AbstractStringBuilder#toString() --> IABuilder       2   抽象建造者;
 * @see java.lang.StringBuilder                    --> ConcreteBuilder 3_A 具体建造者;
 * @see java.lang.StringBuffer                     --> ConcreteBuilder 3_B 具体建造者;
 * @see ...                                        --> Director        4   指挥者角色;
 */
public class BuilderPatternJdk {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder()
                .append(1)
                .append("2")
                .append(true);
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer()
                .append(1)
                .append("2")
                .append(true);
        System.out.println(stringBuffer.toString());
    }
}
