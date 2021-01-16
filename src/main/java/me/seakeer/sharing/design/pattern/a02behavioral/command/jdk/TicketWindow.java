package me.seakeer.sharing.design.pattern.a02behavioral.command.jdk;

/**
 * TicketWindow;
 *
 * @author Seakeer;
 * @date 2020/3/23;
 */
public class TicketWindow {

    private final String name;

    private final TicketSaleTask ticketSaleTask;

    public TicketWindow(String name, TicketSaleTask ticketSaleTask) {
        this.name = name;
        this.ticketSaleTask = ticketSaleTask;
    }

    @SuppressWarnings("AlibabaAvoidManuallyCreateThread")
    public void open() {
        new Thread(ticketSaleTask, name).start();
    }
}
