package me.seakeer.sharing.design.pattern.a02behavioral.iterator.alpha;

/**
 * MySimpleList: IAAggregate 1;
 * 抽象聚合类;
 *
 * @author Seakeer;
 * @date 2020/3/25;
 */
public interface MySimpleList<E> {

    /**
     * add element;
     *
     * @param e element
     * @return this;
     */
    MySimpleList<E> add(E e);

    /**
     * size;
     *
     * @return size;
     */
    int size();

    /**
     * remove element;
     *
     * @param e element;
     * @return result;
     */
    boolean remove(E e);

    /**
     * iterator;
     *
     * @return MySimpleListIterator;
     */
    MySimpleListIterator<E> createItr();
}
