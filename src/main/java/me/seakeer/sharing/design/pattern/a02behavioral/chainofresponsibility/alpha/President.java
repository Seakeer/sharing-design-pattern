package me.seakeer.sharing.design.pattern.a02behavioral.chainofresponsibility.alpha;

/**
 * President: ConcreteHandler 3_C;
 * 审批人董事长：具体处理者;
 *
 * @author Seakeer;
 * @date 2020/3/17;
 */
public class President extends BaseApprover {

    public President(String pos, int permitDays) {
        super(pos, permitDays);
    }

    @Override
    public void handleRequest(LeaveRequest request) {

        if (request.getDays() <= getPermitDays()) {
            pass(request);
        } else {
            notPass(request);
        }
    }
}
