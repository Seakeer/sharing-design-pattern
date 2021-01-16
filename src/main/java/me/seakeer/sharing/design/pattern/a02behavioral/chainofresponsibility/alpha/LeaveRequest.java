package me.seakeer.sharing.design.pattern.a02behavioral.chainofresponsibility.alpha;

/**
 * LeaveRequest: Requester 1;
 * 请假请求:请求者;
 *
 * @author Seakeer;
 * @date 2020/3/17;
 */
public class LeaveRequest {

    /**
     * 请假者姓名
     */
    private String name;

    /**
     * 请假原因
     */
    private String reason;

    /**
     * 请假天数
     */
    private Integer days;

    public LeaveRequest(String name, String reason, Integer days) {
        this.name = name;
        this.reason = reason;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public LeaveRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public LeaveRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public Integer getDays() {
        return days;
    }

    public LeaveRequest setDays(Integer days) {
        this.days = days;
        return this;
    }

    @Override
    public String toString() {
        return "Requester: " + getName() + "\n"
                + "Days: " + getDays() + "\n"
                + "Reason: " + getReason() + "\n";
    }
}
