package me.seakeer.sharing.design.pattern.a02behavioral.chainofresponsibility.alpha;

/**
 * BaseApprover: AHandler 2;
 * 请假审批者：抽象处理者;
 *
 * @author Seakeer;
 * @date 2020/3/17;
 */
public abstract class BaseApprover {

    /**
     * 处理者职位
     */
    private String pos;

    /**
     * 允许审批的最大请假天数
     */
    private int permitDays;

    /**
     * 后继处理者
     */
    private BaseApprover successor;

    public BaseApprover(String pos, int permitDays) {
        this.pos = pos;
        this.permitDays = permitDays;
    }

    public String getPos() {
        return pos;
    }

    public BaseApprover setPos(String pos) {
        this.pos = pos;
        return this;
    }

    public BaseApprover getSuccessor() {
        return successor;
    }

    public void setSuccessor(BaseApprover successor) {
        this.successor = successor;
    }

    public int getPermitDays() {
        return permitDays;
    }

    public BaseApprover setPermitDays(int permitDays) {
        this.permitDays = permitDays;
        return this;
    }

    /**
     * handle
     *
     * @param request leave request
     */
    public abstract void handleRequest(LeaveRequest request);

    public void pass(LeaveRequest request) {
        System.out.println("--------- Leave Request Passed ---------");
        System.out.println(request.toString()
                + "Approver: " + getPos());
    }

    public void notPass(LeaveRequest request) {
        System.out.println("--------- Leave Request Not Passed ---------");
        System.out.println(request.toString()
                + "Not Pass.");
    }

}
