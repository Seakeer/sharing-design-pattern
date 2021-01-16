package me.seakeer.sharing.design.pattern.a02behavioral.command.jdk;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Ticket;
 *
 * @author Seakeer;
 * @date 2020/3/24;
 */
public class Ticket {

    private final ReentrantLock lock = new ReentrantLock();
    private int count;

    public Ticket() {
        this(0);
    }

    public Ticket(int count) {
        this.count = count;
    }

    public int count() {
        return count;
    }

    public int sale() {
        lock.lock();
        try {
            if (count() > 0) {
                return --count;
            } else {
                return 0;
            }
        } finally {
            lock.unlock();
        }
    }
}
