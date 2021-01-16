package me.seakeer.sharing.design.pattern.a02behavioral.chainofresponsibility.alpha;

/**
 * Manager: ConcreteHandler 3_B;
 * 审批人经理：具体处理者;
 *
 * @author Seakeer;
 * @date 2020/3/17;
 */
public class Manager extends BaseApprover {

    public Manager(String pos, int permitDays) {
        super(pos, permitDays);
    }

    @Override
    public void handleRequest(LeaveRequest request) {

        if (request.getDays() <= getPermitDays()) {
            pass(request);
        } else {
            this.getSuccessor().handleRequest(request);
        }
    }
}
