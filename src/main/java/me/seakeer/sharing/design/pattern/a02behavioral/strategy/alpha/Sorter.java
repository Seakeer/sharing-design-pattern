package me.seakeer.sharing.design.pattern.a02behavioral.strategy.alpha;

/**
 * SortingData: Context 3;
 * 排序器：环境类 3;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public class Sorter<E> {

    /**
     * 待排序的数组
     */
    private E[] sortingData;

    /**
     * 排序算法
     */
    private AbstractSortAlgorithm<E> sortAlgorithm;

    public Sorter() {
    }

    public Sorter(E[] sortingData, AbstractSortAlgorithm<E> sortAlgorithm) {
        this.sortingData = sortingData;
        this.sortAlgorithm = sortAlgorithm;
    }

    public E[] getSortingData() {
        return sortingData;
    }

    public Sorter<E> setSortingData(E[] sortingData) {
        this.sortingData = sortingData;
        return this;
    }

    public AbstractSortAlgorithm<E> getSortAlgorithm() {
        return sortAlgorithm;
    }

    public Sorter<E> setSortAlgorithm(AbstractSortAlgorithm<E> sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
        return this;
    }

    public E[] sort(Order sortOrder) {

        return sortAlgorithm.sort(sortingData, sortOrder);
    }

    public E[] sortDesc() {

        return sortAlgorithm.sort(sortingData, Order.DESC);
    }

    public E[] sortAsc() {

        return sortAlgorithm.sort(sortingData, Order.ASC);
    }

    public enum Order {

        /**
         * ascending
         */
        ASC,

        /**
         * descending
         */
        DESC
    }
}
