package me.seakeer.sharing.design.pattern.a02behavioral.iterator.alpha;

/**
 * MySimpleArrayListIterator: ConcreteIterator 4_A;
 * 具体迭代器;
 *
 * @author Seakeer;
 * @date 2020/3/26;
 */
public class MySimpleArrayListIterator<E> implements MySimpleListIterator<E> {

    /**
     * 正向遍历游标: [0, size()]
     */
    private int forwardCursor;

    /**
     * 反向遍历游标: [ -1, size() - 1 ]
     */
    private int backwardCursor;

    private final MySimpleArrayList<E> mySimpleArrayList;

    public MySimpleArrayListIterator(MySimpleArrayList<E> mySimpleArrayList) {
        forwardCursor = 0;
        backwardCursor = mySimpleArrayList.size() - 1;
        this.mySimpleArrayList = mySimpleArrayList;
    }

    @Override
    public boolean hasNext() {
        return forwardCursor != mySimpleArrayList.size();
    }

    @Override
    public E next() {
        return mySimpleArrayList.get(forwardCursor++);
    }

    @Override
    public boolean hasPrev() {
        return backwardCursor != -1;
    }

    @Override
    public E prev() {
        return mySimpleArrayList.get(backwardCursor--);
    }

    @Override
    public E first() {
        return mySimpleArrayList.get(0);
    }

    @Override
    public E last() {
        return mySimpleArrayList.get(mySimpleArrayList.size() - 1);
    }
}