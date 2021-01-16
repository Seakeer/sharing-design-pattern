package me.seakeer.sharing.design.pattern.a02behavioral.iterator.alpha;

import java.util.stream.IntStream;

/**
 * IteratorPatternMain;
 * 迭代器模式：分离聚合对象的存储数据和遍历数据，使用迭代器对象顺序访问；
 * 聚合类和迭代器分离;
 *
 * @author Seakeer;
 * @date 2020/3/25; 2018/8/20;
 * @see MySimpleList                                  --> IAAggregate       1   抽象聚合类;
 * @see MySimpleArrayList                             --> ConcreteAggregate 2_A 具体聚合类;
 * @see MySimpleLinkedList                            --> ConcreteAggregate 2_B 具体聚合类;
 * @see MySimpleListIterator                          --> IIterator         3   抽象迭代器;
 * @see MySimpleArrayListIterator                     --> ConreteIterator   4_A 具体迭代器;
 * @see MySimpleLinkedList.MySimpleLinkedListIterator --> ConreteIterator   4_B 具体迭代器;
 */
public class IteratorPatternMain {

    public static void main(String[] args) {

        System.out.println("--------- MySimpleArrayListIterator ---------");
        test(new MySimpleArrayList<>());

        System.out.println("--------- MySimpleLinkedListIterator ---------");
        test(new MySimpleLinkedList<>());
    }

    private static void test(MySimpleList<Integer> mySimpleList) {
        IntStream.range(0, 10).forEach(mySimpleList::add);
        System.out.println("size: " + mySimpleList.size());
        IntStream.range(0, 5).forEach(mySimpleList::remove);
        System.out.println("size: " + mySimpleList.size());

        MySimpleListIterator<Integer> itr = mySimpleList.createItr();
        System.out.println("first: " + itr.first() + "; last: " + itr.last());
        while (itr.hasNext()) {
            System.out.print(itr.next() + "; ");
        }
        System.out.println();

        while (itr.hasPrev()) {
            System.out.print(itr.prev() + "; ");
        }
        System.out.println();
    }
}
