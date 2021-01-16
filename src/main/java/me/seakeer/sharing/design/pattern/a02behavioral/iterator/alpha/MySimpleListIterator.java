package me.seakeer.sharing.design.pattern.a02behavioral.iterator.alpha;

/**
 * MySimpleListIterator: IIterator 3;
 * 抽象迭代器;
 *
 * @author Seakeer;
 * @date 2020/3/26;
 */
public interface MySimpleListIterator<E> {

    /**
     * hasNext;
     *
     * @return true if has next element;
     */
    boolean hasNext();

    /**
     * next;
     *
     * @return next element;
     */
    E next();

    /**
     * hasPrev;
     *
     * @return true if has prev element;
     */
    boolean hasPrev();

    /**
     * prev;
     *
     * @return prev element;
     */
    E prev();

    /**
     * first;
     *
     * @return first element;
     */
    E first();

    /**
     * last;
     *
     * @return last element;
     */
    E last();
}
