package me.seakeer.sharing.design.pattern.a02behavioral.command.jdk;

import java.util.concurrent.TimeUnit;

/**
 * TicketSaleTask;
 *
 * @author Seakeer;
 * @date 2020/3/23;
 */
public class TicketSaleTask implements Runnable {

    private final Ticket ticket;

    public TicketSaleTask(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (ticket.count() > 0) {
            int lefts = ticket.sale();
            System.out.println("Current: " + Thread.currentThread().getName() + ";"
                    + " Tickets Left: " + lefts);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
