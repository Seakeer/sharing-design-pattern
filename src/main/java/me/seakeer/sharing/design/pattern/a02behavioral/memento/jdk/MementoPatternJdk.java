package me.seakeer.sharing.design.pattern.a02behavioral.memento.jdk;

import java.time.Instant;

/**
 * MementoPatternJdk;
 *
 * @author Seakeer;
 * @date 2020-11-15;
 * @see java.time.Instant#seconds --> Originator 1 原发器;
 * @see java.time.Instant         --> Memento    2 备忘录;
 * @see java.time.Instant         --> Caretaker  3 负责人;
 */
public class MementoPatternJdk {

    public static void main(String[] args) {
        System.out.println(Instant.now().toEpochMilli());
    }
}
