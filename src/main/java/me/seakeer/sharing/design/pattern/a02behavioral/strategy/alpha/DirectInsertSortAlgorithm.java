package me.seakeer.sharing.design.pattern.a02behavioral.strategy.alpha;

import java.util.Comparator;

/**
 * DirectInsertSortAlgorithm;
 * 插入排序;
 *
 * @author Seakeer;
 * @date 2020-04-10;
 */
public class DirectInsertSortAlgorithm<E> extends AbstractSortAlgorithm<E> {

    public DirectInsertSortAlgorithm() {
    }

    public DirectInsertSortAlgorithm(Comparator<? super E> comparator) {
        super(comparator);
    }

    @Override
    public E[] sortAsc(E[] data) {
        //[ data[1], data[len-1] ], 第二个到最后一个
        for (int i = 1; i < data.length; i++) {
            // 记录当前结点，与前一个结点比较
            // 如果小于，则将前一个结点后移，给当前结点让位置；
            E current = data[i];
            int j;
            // 与前面的结点比较，找到插入的位置
            for (j = i - 1; j >= 0 && compare(current, data[j]) < 0; j--) {
                data[j + 1] = data[j];
            }
            data[j + 1] = current;
        }
        return data;
    }

    @Override
    public E[] sortDesc(E[] data) {
        for (int i = 0; i < data.length; i++) {
            E current = data[i];
            int j;
            for (j = i - 1; j >= 0 && compare(current, data[j]) > 0; j--) {
                data[j + 1] = data[j];
            }
            data[j + 1] = current;
        }
        return data;
    }
}
