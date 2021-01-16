package me.seakeer.sharing.design.pattern.a02behavioral.memento.alpha;

import me.seakeer.sharing.design.pattern.a02behavioral.memento.support.Piece;

/**
 * MementoPatternMain;
 * 备忘录模式：状态保存与恢复;
 * 原发器依赖备忘录;
 *
 * @author Seakeer;
 * @date 2020/3/30; 2018/8/21;
 * @see Chessman         --> Originator 1 原发器;
 * @see ChessmanMemento  --> Memento    2 备忘录;
 * @see MementoCaretaker --> Caretaker  3 负责人;
 */
public class MementoPatternMain {

    public static void main(String[] args) {

        MementoCaretaker caretaker = new MementoCaretaker();

        System.out.println("------初始状态------");
        Chessman chessman = new Chessman(Piece.CHARIOT, 0, 0);
        caretaker.add(chessman.init());

        System.out.println("------走棋------");
        caretaker.add(chessman.go(0, 1));
        caretaker.add(chessman.go(0, 2));
        caretaker.add(chessman.go(0, 3));
        caretaker.add(chessman.go(0, 4));
        caretaker.add(chessman.go(0, 5));


        System.out.println("------悔棋------");
        chessman.restore(caretaker.undo());
        chessman.restore(caretaker.undo());
        chessman.restore(caretaker.undo());
        chessman.restore(caretaker.undo());

        System.out.println("---撤销悔棋---");
        chessman.restore(caretaker.redo());
        chessman.restore(caretaker.redo());


        System.out.println("------走棋------");
        caretaker.override(chessman.go(4, 1));
        caretaker.add(chessman.go(5, 1));

        System.out.println("------悔棋------");
        chessman.restore(caretaker.undo());
        chessman.restore(caretaker.undo());

    }
}
