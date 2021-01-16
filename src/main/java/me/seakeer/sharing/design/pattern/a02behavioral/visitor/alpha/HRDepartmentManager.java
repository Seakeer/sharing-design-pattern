package me.seakeer.sharing.design.pattern.a02behavioral.visitor.alpha;

/**
 * HRDepartmentManager: ConcreteVisitor 3_B;
 * 人力资源部：具体访问者 3_B;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public class HRDepartmentManager extends BaseDepartmentManager {

    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        int realWorkDays = fullTimeEmployee.getMonthlyWorkDays();
        int overtimeDays = 0;
        int absenceDays = 0;

        if (realWorkDays > BASIC_MONTHLY_WORK_DAYS) {
            overtimeDays = fullTimeEmployee.getMonthlyWorkDays() - BASIC_MONTHLY_WORK_DAYS;
        } else if (realWorkDays < BASIC_MONTHLY_WORK_DAYS) {
            absenceDays = BASIC_MONTHLY_WORK_DAYS - fullTimeEmployee.getMonthlyWorkDays();
        }

        System.out.println("正式员工：" + fullTimeEmployee.getUniqueName() + "; "
                + "工作时间：" + realWorkDays + "天; "
                + "加班时间：" + overtimeDays + "天; "
                + "缺勤时间：" + absenceDays + "天");
    }

    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        System.out.println("临时员工：" + partTimeEmployee.getUniqueName() + "; "
                + "工作时间：" + partTimeEmployee.getWorkHours() + "小时");
    }
}
