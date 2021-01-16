package me.seakeer.sharing.design.pattern.a02behavioral.chainofresponsibility.alpha;

/**
 * ChainOfResponsibilityPatternMain;
 * 责任链模式：同一请求多对象链式处理；
 * 纯责任链：处理or不处理，不存在部分处理；
 *
 * @author Seakeer;
 * @date 2020/3/16; 2018/8/20;
 * @see LeaveRequest  --> Requester       1   请求者;
 * @see BaseApprover  --> AHandler        2   抽象处理者;
 * @see Director      --> ConcreteHandler 3_A 具体处理者;
 * @see Manager       --> ConcreteHandler 3_B 具体处理者;
 * @see President     --> ConcreteHandler 3_C 具体处理者;
 */
public class ChainOfResponsibilityPatternMain {

    public static void main(String[] args) {

        BaseApprover director, manager, president;

        director = new Director("主管", 2);
        manager = new Manager("经理", 5);
        president = new President("董事长", 7);

        director.setSuccessor(manager);
        manager.setSuccessor(president);

        LeaveRequest request2 = new LeaveRequest("Jack", "出差", 2);
        LeaveRequest request5 = new LeaveRequest("Jerry", "出差", 5);
        LeaveRequest request7 = new LeaveRequest("Tom", "出差", 7);
        LeaveRequest request9 = new LeaveRequest("Torry", "出差", 9);

        director.handleRequest(request2);
        director.handleRequest(request5);
        director.handleRequest(request7);
        director.handleRequest(request9);
    }
}
