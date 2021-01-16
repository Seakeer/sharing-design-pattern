package me.seakeer.sharing.design.pattern.a02behavioral.visitor.alpha;

/**
 * FullTimeEmployee: ConcreteElement 2_A;
 * 全职员工：具体元素 2_A;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public class FullTimeEmployee implements Employee {

    /**
     * 姓名
     */
    private String uniqueName;

    /**
     * 基本月薪
     */
    private double basicMonthlySalary;

    /**
     * 实际月薪
     */
    private double actualMonthlySalary;

    /**
     * 月工作时间
     */
    private int monthlyWorkDays;

    public FullTimeEmployee(String uniqueName, double basicMonthlySalary, int monthlyWorkDays) {
        this.uniqueName = uniqueName;
        this.basicMonthlySalary = basicMonthlySalary;
        this.monthlyWorkDays = monthlyWorkDays;
    }

    @Override
    public void accept(BaseDepartmentManager departmentManager) {
        departmentManager.visit(this);
    }

    @Override
    public String getUniqueName() {
        return uniqueName;
    }

    public FullTimeEmployee setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    public double getBasicMonthlySalary() {
        return basicMonthlySalary;
    }

    public FullTimeEmployee setBasicMonthlySalary(double basicMonthlySalary) {
        this.basicMonthlySalary = basicMonthlySalary;
        return this;
    }

    public int getMonthlyWorkDays() {
        return monthlyWorkDays;
    }

    public FullTimeEmployee setMonthlyWorkDays(int monthlyWorkDays) {
        this.monthlyWorkDays = monthlyWorkDays;
        return this;
    }

    public double getActualMonthlySalary() {
        return actualMonthlySalary;
    }

    public FullTimeEmployee setActualMonthlySalary(double actualMonthlySalary) {
        this.actualMonthlySalary = actualMonthlySalary;
        return this;
    }
}
