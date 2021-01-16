package me.seakeer.sharing.design.pattern.a02behavioral.visitor.alpha;

/**
 * FinanceDepartmentManager: ConcreteVisitor 3_A;
 * 财务部经理：具体访问者 3_A;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public class FinanceDepartmentManager extends BaseDepartmentManager {

    private static final int OVERTIME_DAY_WAGE_RATE = 3;

    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        calculateActualMonthlySalary(fullTimeEmployee);
        System.out.println("正式员工" + fullTimeEmployee.getUniqueName()
                + "实际工资：" + fullTimeEmployee.getActualMonthlySalary());
    }

    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        calculateTotalWage(partTimeEmployee);
        System.out.println("临时员工" + partTimeEmployee.getUniqueName()
                + "实际工资：" + partTimeEmployee.getTotalWage());
    }

    private void calculateTotalWage(PartTimeEmployee partTimeEmployee) {
        partTimeEmployee.setTotalWage(partTimeEmployee.getHourlyWage() * partTimeEmployee.getWorkHours());
    }

    private void calculateActualMonthlySalary(FullTimeEmployee fullTimeEmployee) {
        int actualMonthlyWorkDays = fullTimeEmployee.getMonthlyWorkDays();
        double basicDayWage = basicDayWage(fullTimeEmployee.getBasicMonthlySalary());
        double actualMonthlySalary;

        if (actualMonthlyWorkDays > BASIC_MONTHLY_WORK_DAYS) {
            actualMonthlySalary = fullTimeEmployee.getBasicMonthlySalary()
                    + overtimeWage(actualMonthlyWorkDays, basicDayWage);
        } else if (actualMonthlyWorkDays < BASIC_MONTHLY_WORK_DAYS) {
            actualMonthlySalary = fullTimeEmployee.getBasicMonthlySalary() -
                    deductedWage(actualMonthlyWorkDays, basicDayWage);
        } else {
            actualMonthlySalary = fullTimeEmployee.getBasicMonthlySalary();
        }
        fullTimeEmployee.setActualMonthlySalary(actualMonthlySalary);
    }

    /**
     * 缺勤应扣工资
     *
     * @param actualMonthlyWorkDays
     * @param basicDayWage
     * @return
     */
    private double deductedWage(int actualMonthlyWorkDays, double basicDayWage) {
        return (BASIC_MONTHLY_WORK_DAYS - actualMonthlyWorkDays) * basicDayWage;
    }

    /**
     * 加班工资
     *
     * @param actualMonthlyWorkDays
     * @param basicDayWage
     * @return
     */
    private double overtimeWage(int actualMonthlyWorkDays, double basicDayWage) {
        return (actualMonthlyWorkDays - BASIC_MONTHLY_WORK_DAYS)
                * (basicDayWage * OVERTIME_DAY_WAGE_RATE);
    }

    private double basicDayWage(double basicMonthlySalary) {
        return basicMonthlySalary / BASIC_MONTHLY_WORK_DAYS;
    }
}
