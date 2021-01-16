package me.seakeer.sharing.design.pattern.a02behavioral.strategy.jdk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * StrategyPatternJdk;
 *
 * @author Seakeer;
 * @date 2020/4/1;
 * @see java.util.Comparator                     --> IAStrategy        1   抽象策略类;
 * @see java.util.Collections.ReverseComparator2 --> ConcreteStrategy  2_A 具体策略类;
 * @see java.util.Collections.ReverseComparator  --> ConcreteStrategy  2_B 具体策略类;
 * @see java.util.Collections                    --> Context           3   环境类;
 */
public class StrategyPatternJdk {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 3, 5, 7, 9);
        values.sort(Collections.reverseOrder());
        System.out.println(values);
        values.sort(Collections.reverseOrder(Integer::compareTo));
        System.out.println(values);
    }
}
