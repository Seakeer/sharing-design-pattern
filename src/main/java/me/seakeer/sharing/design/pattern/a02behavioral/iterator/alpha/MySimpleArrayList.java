package me.seakeer.sharing.design.pattern.a02behavioral.iterator.alpha;

import java.util.Arrays;

/**
 * MySimpleArrayList: ConcreteAggregate 2_A;
 * 具体聚合类;
 *
 * @author Seakeer;
 * @date 2020/3/25;
 */
public class MySimpleArrayList<E> implements MySimpleList<E> {

    private Object[] elementData;
    private int size;

    public MySimpleArrayList() {
        elementData = new Object[10];
    }


    @Override
    public MySimpleList<E> add(E e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
        return this;
    }

    private void ensureCapacity(int miniCapacity) {
        if (miniCapacity - elementData.length > 0) {
            elementData = Arrays.copyOf(elementData, elementData.length + elementData.length >> 2);
        }
    }

    @Override
    public boolean remove(E o) {
        if (o == null) {
            for (int index = 0; index < size; index++) {
                if (elementData[index] == null) {
                    fastRemove(index);
                    return true;
                }
            }
        } else {
            for (int index = 0; index < size; index++) {
                if (o.equals(elementData[index])) {
                    fastRemove(index);
                    return true;
                }
            }
        }
        return false;
    }

    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        }
        // clear to let GC do its work
        elementData[--size] = null;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < size) {
            return (E) elementData[index];
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public MySimpleListIterator<E> createItr() {
        return new MySimpleArrayListIterator(this);
    }


}
