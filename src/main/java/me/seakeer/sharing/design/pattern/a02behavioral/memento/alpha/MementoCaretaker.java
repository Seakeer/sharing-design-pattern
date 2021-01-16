package me.seakeer.sharing.design.pattern.a02behavioral.memento.alpha;

import java.util.ArrayList;
import java.util.List;

/**
 * MementoCaretaker: Caretaker 3;
 * 备忘录管理者类：负责人 3;
 * 保存备忘录;
 *
 * @author Seakeer;
 * @date 2020/3/30;
 */
public class MementoCaretaker {

    private final List<ChessmanMemento> mementoList = new ArrayList<>();

    /**
     * 标记执行撤销和恢复等操作后备忘录的位置
     */
    private int cursor = -1;

    public List<ChessmanMemento> add(ChessmanMemento memento) {
        mementoList.add(memento);
        cursor++;
        return mementoList;
    }

    public List<ChessmanMemento> override(ChessmanMemento memento) {
        int size = mementoList.size();
        int count = mementoList.size() - 1 - cursor;
        for (int i = 0; i < count; i++) {
            mementoList.remove(size - 1 - i);
        }
        return add(memento);
    }

    public ChessmanMemento undo() {
        cursor--;
        return mementoList.get(cursor);
    }

    public ChessmanMemento redo() {
        cursor++;
        return mementoList.get(cursor);
    }
}
