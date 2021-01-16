package me.seakeer.sharing.design.pattern.a02behavioral.chainofresponsibility.alpha;

/**
 * Director: ConcreteHandler 3_A;
 * 审批人主管：具体处理者;
 *
 * @author Seakeer;
 * @date 2020/3/17;
 */
public class Director extends BaseApprover {

    public Director(String pos, int permitDays) {
        super(pos, permitDays);
    }

    @Override
    public void handleRequest(LeaveRequest request) {

        if (request.getDays() <= this.getPermitDays()) {
            pass(request);
        } else {
            this.getSuccessor().handleRequest(request);
        }
    }
}
