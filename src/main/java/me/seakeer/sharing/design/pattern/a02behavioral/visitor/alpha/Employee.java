package me.seakeer.sharing.design.pattern.a02behavioral.visitor.alpha;

/**
 * Employee: IAElement 1;
 * 员工接口：抽象元素 1;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public interface Employee {

    /**
     * 接受一个部门经理(抽象访问者)访问;
     *
     * @param departmentManager manager
     */
    void accept(BaseDepartmentManager departmentManager);

    /**
     * get employee unique name ;
     *
     * @return employee unique name;
     */
    String getUniqueName();
}
