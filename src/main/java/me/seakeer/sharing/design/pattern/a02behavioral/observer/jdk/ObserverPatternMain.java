package me.seakeer.sharing.design.pattern.a02behavioral.observer.jdk;

import javax.swing.*;
import javax.swing.event.ListSelectionListener;

/**
 * ObserverPatternMain;
 *
 * @author Seakeer;
 * @date 2020/3/31;
 * @see ListSelectionListener  # listenerList  --> IObserver        1 抽象观察者;
 * @see javax.swing.JList.ListSelectionHandler --> ConcreteObserver 2 具体观察者;
 * @see javax.swing.JComponent                 --> IACSubject       3 抽象目标;
 * @see javax.swing.JList                      --> ConcreteSubject  4 具体目标;
 */
public class ObserverPatternMain {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 200);
        JList<String> jList = new JList<>(new String[]{"Hello", "World"});
        jList.addListSelectionListener(e -> System.out.println("Selected"));
        jFrame.getContentPane().add(jList);
        jFrame.setVisible(true);
    }
}
