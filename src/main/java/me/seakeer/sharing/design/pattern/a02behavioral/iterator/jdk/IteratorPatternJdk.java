package me.seakeer.sharing.design.pattern.a02behavioral.iterator.jdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * IteratorPatternJdk;
 *
 * @author Seakeer;
 * @date 2020/3/25;
 * @see java.util.Collection         --> IAAggregate       1   抽象聚合类;
 * @see java.util.ArrayList          --> ConcreteAggregate 2_A 具体聚合类;
 * @see java.util.LinkedList         --> ConcreteAggregate 2_B 具体聚合类;
 * @see java.util.Iterator           --> IIterator         3   抽象迭代器;
 * @see java.util.ArrayList.Itr      --> ConreteIterator   4_A 具体迭代器;
 * @see java.util.LinkedList.ListItr --> ConreteIterator   4_B 具体迭代器;
 */
public class IteratorPatternJdk {

    public static void main(String[] args) {
        System.out.println("--------- ArrayList.Itr ---------");
        test(new ArrayList<>());
        System.out.println("--------- LinkedList.ListItr ---------");
        test(new LinkedList<>());
    }

    private static void test(Collection<Integer> collection) {

        IntStream.range(0, 10).forEach(collection::add);
        System.out.println("size: " + collection.size());

        Iterator<Integer> itr = collection.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "; ");
            itr.remove();
        }
        System.out.println();
        System.out.println("size: " + collection.size());
        System.out.println("Iterator: " + itr);
    }
}
