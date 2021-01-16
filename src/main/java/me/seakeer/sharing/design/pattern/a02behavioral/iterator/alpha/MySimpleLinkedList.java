package me.seakeer.sharing.design.pattern.a02behavioral.iterator.alpha;

/**
 * MySimpleLinkedList: ConcreteAggregate 2_B;
 * 具体聚合类;
 *
 * @author Seakeer;
 * @date 2020/3/26;
 */
public class MySimpleLinkedList<E> implements MySimpleList<E> {

    private Node<E> first;

    private Node<E> last;

    private int size;

    @Override
    public MySimpleList<E> add(E e) {
        linkLast(e);
        return this;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean remove(E e) {
        if (e == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (e.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public MySimpleListIterator<E> createItr() {
        return new MySimpleLinkedListIterator(first, last);
    }

    private E unlink(Node<E> x) {

        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    /**
     * Links e as last element.
     */
    private void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * MySimpleLinkedList: ConcreteIterator 4_B;
     * 具体迭代器;
     *
     * @author Seakeer;
     * @date 2020/3/26;
     */
    private class MySimpleLinkedListIterator implements MySimpleListIterator<E> {

        private Node<E> next;

        private Node<E> prev;

        public MySimpleLinkedListIterator(Node<E> next, Node<E> prev) {
            this.next = next;
            this.prev = prev;
        }

        @Override
        public boolean hasNext() {
            return null != next;
        }

        @Override
        public E next() {
            E e = next.item;
            next = next.next;
            return e;
        }

        @Override
        public boolean hasPrev() {
            return null != prev;
        }

        @Override
        public E prev() {
            E e = prev.item;
            prev = prev.prev;
            return e;
        }

        @Override
        public E first() {
            return null == first ? null : first.item;
        }

        @Override
        public E last() {
            return null == last ? null : last.item;
        }
    }
}
