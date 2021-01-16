package me.seakeer.sharing.design.pattern.a02behavioral.strategy.alpha;

import java.util.Comparator;

/**
 * AbstractSortAlgorithm: IAStrategy 1;
 * 排序算法：抽象策略类 1;
 *
 * @author Seakeer;
 * @date 2020/4/1;
 */
public abstract class AbstractSortAlgorithm<E> {

    /**
     * ? super E 表示可以使用父类的比较方法比较子类;
     */
    private Comparator<? super E> comparator;

    public AbstractSortAlgorithm() {
    }

    public AbstractSortAlgorithm(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    /**
     * 可以比较null值的比较器;
     *
     * @param comparator   普通比较器
     * @param isNullBigger true: null大于非null值; false: null小于非null值
     * @param <T>          指定的是改方法的泛型, 和类的泛型E没有关系
     * @return comparator;
     */
    public static <T> Comparator<T> comparatorWithNull(Comparator<? super T> comparator, boolean isNullBigger) {
        return (activeOne, passiveOne) -> {
            if (null == activeOne) {
                return null == passiveOne ? 0 : isNullBigger ? 1 : -1;
            } else {
                return null != passiveOne ?
                        comparator.compare(activeOne, passiveOne)
                        : isNullBigger ? -1 : 1;
            }
        };
    }

    @SuppressWarnings("unchecked")
    public int compare(E activeOne, E passiveOne) {
        return null == getComparator() ? ((Comparable<? super E>) activeOne).compareTo(passiveOne)
                : getComparator().compare(activeOne, passiveOne);
    }

    public Comparator<? super E> getComparator() {
        return comparator;
    }

    public E[] sort(E[] data, Sorter.Order sortOrder) {
        if (Sorter.Order.ASC.equals(sortOrder)) {
            return sortAsc(data);
        } else {
            return sortDesc(data);
        }
    }

    /**
     * Ascending sort;
     *
     * @param data array data to be sort;
     * @return sorted array, equals data
     */
    public abstract E[] sortAsc(E[] data);

    /**
     * Ascending sort;
     *
     * @param data array data to be sort;
     * @return sorted array, equals data
     */
    public abstract E[] sortDesc(E[] data);
}

