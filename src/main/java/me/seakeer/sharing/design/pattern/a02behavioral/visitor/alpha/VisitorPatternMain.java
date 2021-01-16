package me.seakeer.sharing.design.pattern.a02behavioral.visitor.alpha;

/**
 * VisitorPatternMain;
 * 访问者模式：对象结构中不同类型的对象提供不同类型的访问操作;
 * 访问者元素类互相关联;
 *
 * @author Seakeer;
 * @date 2020/4/2; 2018/8/22;
 * @see Employee                 --> IAElement        1   抽象元素;
 * @see FullTimeEmployee         --> ConcreteElement  2_A 具体元素;
 * @see PartTimeEmployee         --> ConcreteElement  2_B 具体元素;
 * @see BaseDepartmentManager    --> AVisitor         3   抽象访问者;
 * @see FinanceDepartmentManager --> ConcreteVisitor  3_A 具体访问者;
 * @see HRDepartmentManager      --> ConcreteVisitor  3_B 具体访问者;
 * @see EmployeeGroup            --> ObjectStructure  4   对象结构;
 */
public class VisitorPatternMain {

    public static void main(String[] args) {

        EmployeeGroup employeeGroup = initEmployeeGroup();

        BaseDepartmentManager financeManager, hrManager;
        financeManager = new FinanceDepartmentManager();
        hrManager = new HRDepartmentManager();

        System.out.println("---财务部经理访问所有员工---");
        employeeGroup.accept(financeManager);

        System.out.println("---人资部经理访问所有员工---");
        employeeGroup.accept(hrManager);

        System.out.println("---人资部经理访问正式员工A---");
        employeeGroup.getEmployee("A").accept(hrManager);
    }

    private static EmployeeGroup initEmployeeGroup() {

        EmployeeGroup employeeGroup = new EmployeeGroup();

        Employee fullTimeA, fullTimeB, fullTimeC, partTimeD, parTimeE;

        fullTimeA = new FullTimeEmployee("A", 100000, 15);
        fullTimeB = new FullTimeEmployee("B", 100000, 20);
        fullTimeC = new FullTimeEmployee("C", 100000, 25);

        partTimeD = new PartTimeEmployee("D", 100, 20);
        parTimeE = new PartTimeEmployee("E", 200, 40);

        employeeGroup.addEmployee(fullTimeA)
                .addEmployee(fullTimeB)
                .addEmployee(fullTimeC)
                .addEmployee(partTimeD)
                .addEmployee(parTimeE);
        return employeeGroup;
    }
}
