package me.seakeer.sharing.design.pattern.a02behavioral.strategy.alpha;

import java.util.Arrays;

/**
 * StrategyPatternMain;
 * 策略模式：算法封装以便自由切换和扩展;
 * 环境类聚合自策略类;
 *
 * @author Seakeer;
 * @date 2020/4/1; 2018/8/21;
 * @see AbstractSortAlgorithm     --> IAStrategy       1   抽象策略类;
 * @see BubbleSortAlgorithm       --> ConcreteStrategy 2_A 具体策略类;
 * @see DirectInsertSortAlgorithm --> ConcreteStrategy 2_B 具体策略类;
 * @see Sorter                    --> Context          3   环境类;
 */
public class StrategyPatternMain {

    public static void main(String[] args) {
        testBubbleSort();
        testInsertSort();
    }

    private static void testInsertSort() {
        Integer[] sortingData = new Integer[]{2, 0, 4, 8, 3, 6, null, null};

        Sorter<Integer> sorter = new Sorter<>(sortingData,
                new DirectInsertSortAlgorithm<>(AbstractSortAlgorithm.comparatorWithNull(Integer::compareTo, false)));

        System.out.println("------排序前------");
        System.out.println(Arrays.toString(sorter.getSortingData()));

        Integer[] sortedData = sorter.sortAsc();
        System.out.println("------升序排序后------");
        System.out.println(Arrays.toString(sortedData));


        sortedData = sorter.sortDesc();
        System.out.println("------降序排序后------");
        System.out.println(Arrays.toString(sortedData));
    }

    private static void testBubbleSort() {
        Float[] sortingData = new Float[]{9.3F, 3.3F, 6.3F, null, null};

        Sorter<Float> sorter = new Sorter<>(sortingData,
                new BubbleSortAlgorithm<>(AbstractSortAlgorithm.comparatorWithNull(Float::compareTo, false)));

        System.out.println("------排序前------");
        System.out.println(Arrays.toString(sorter.getSortingData()));

        Float[] sortedData = sorter.sortAsc();
        System.out.println("------升序排序后------");
        System.out.println(Arrays.toString(sortedData));


        sortedData = sorter.sortDesc();
        System.out.println("------降序排序后------");
        System.out.println(Arrays.toString(sortedData));

        System.out.println("------排序前后------");
        System.out.println("sortingData eq sortedData: " + Arrays.equals(sortingData, sortedData));
        System.out.println("sortingData == sortedData: " + (sortingData == sortedData));
    }
}
