package me.seakeer.sharing.design.pattern.a02behavioral.command.jdk;

/**
 * CommandPatternJdk;
 *
 * @author Seakeer;
 * @date 2020/3/23;
 * @see java.lang.Runnable --> IACommand       1 抽象命令类;
 * @see TicketSaleTask     --> ConcreteCommand 2 具体命令类;
 * @see Ticket             --> Receiver        3 接收者;
 * @see TicketWindow       --> Invoker         4 调用者;
 */
public class CommandPatternJdk {

    public static final int MAX = 20;

    public static void main(String[] args) {
        Ticket ticket = new Ticket(10);
        TicketSaleTask ticketSaleTask = new TicketSaleTask(ticket);
        for (int i = 1; i <= MAX; i++) {
            new TicketWindow("TicketWindow" + String.format("%02d", i), ticketSaleTask).open();
        }
    }
}
