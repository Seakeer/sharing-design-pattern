package me.seakeer.sharing.design.pattern.a02behavioral.visitor.alpha;

/**
 * PartTimeEmployee: ConcreteElement 2_B;
 * 临时员工：具体元素 2_B;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public class PartTimeEmployee implements Employee {

    private String uniqueName;
    private double hourlyWage;
    private int workHours;

    private double totalWage;

    public PartTimeEmployee(String uniqueName, double hourlyWage, int workHours) {
        this.uniqueName = uniqueName;
        this.hourlyWage = hourlyWage;
        this.workHours = workHours;
    }

    @Override
    public void accept(BaseDepartmentManager departmentManager) {
        departmentManager.visit(this);
    }

    @Override
    public String getUniqueName() {
        return uniqueName;
    }

    public PartTimeEmployee setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public PartTimeEmployee setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
        return this;
    }

    public int getWorkHours() {
        return workHours;
    }

    public PartTimeEmployee setWorkHours(int workHours) {
        this.workHours = workHours;
        return this;
    }

    public double getTotalWage() {
        return totalWage;
    }

    public PartTimeEmployee setTotalWage(double totalWage) {
        this.totalWage = totalWage;
        return this;
    }
}
