package me.seakeer.sharing.design.pattern.a02behavioral.visitor.alpha;

/**
 * Department: AVisitor 3;
 * 部门管理者：抽象访问者 3;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public abstract class BaseDepartmentManager {

    public static final int BASIC_MONTHLY_WORK_DAYS = 20;

    /**
     * visit;
     *
     * @param fullTimeEmployee fullTimeEmployee;
     */
    public abstract void visit(FullTimeEmployee fullTimeEmployee);

    /**
     * visit;
     *
     * @param partTimeEmployee partTimeEmployee;
     */
    public abstract void visit(PartTimeEmployee partTimeEmployee);
}
