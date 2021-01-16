package me.seakeer.sharing.design.pattern.a02behavioral.strategy.alpha;

import java.util.Comparator;

/**
 * BubbleSortAlgorithm: ConcreteStrategy 2_A;
 * 冒泡排序：具体策略类 2_A;
 *
 * @author Seakeer;
 * @date 2020/4/1;
 */
public class BubbleSortAlgorithm<E> extends AbstractSortAlgorithm<E> {

    public BubbleSortAlgorithm() {
        super();
    }

    public BubbleSortAlgorithm(Comparator<? super E> comparator) {
        super(comparator);
    }

    @Override
    public E[] sortAsc(E[] data) {
        // 用于标记是否有后移，没有则表示已经排好序
        boolean isSwapped = true;

        //[ data[0], data[len-1] ): 第一个倒数第二个，最后一个不需要
        for (int i = 0; i < data.length - 1 && isSwapped; i++) {
            isSwapped = false;
            // 从data[0]到已经排好序的前一个
            // 每趟会把最大的移到后面
            // 2, 0, 4, 8, 3, 6 -->  0, 2, 4, 3, 6, 8 --> 0, 2, 3, 4, 6, 8
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (compare(data[j], data[j + 1]) > 0) {
                    //大的往后移动
                    E e = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = e;
                    isSwapped = true;
                }
            }
        }

        return data;
    }

    @Override
    public E[] sortDesc(E[] data) {
        boolean isSwapped = true;
        for (int i = 0; i < data.length - 1 && isSwapped; i++) {
            isSwapped = false;
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (compare(data[j], data[j + 1]) < 0) {
                    E e = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = e;
                    isSwapped = true;
                }
            }
        }
        return data;
    }

    /**
     * int, long 可采用加减完成换位, 而不需要申请临时空间;
     * float由于精度问题，采用加减方式会导致数据不一致;
     * 注意不考虑越界情况;
     *
     * @param data
     * @return
     */
    private int[] sortAsc(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    data[j] = data[j] + data[j + 1];
                    data[j + 1] = data[j] - data[j + 1];
                    data[j] = data[j] - data[j + 1];
                }
            }
        }
        return data;
    }
}
