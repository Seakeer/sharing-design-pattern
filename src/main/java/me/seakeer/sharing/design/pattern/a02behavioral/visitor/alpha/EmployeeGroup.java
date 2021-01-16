package me.seakeer.sharing.design.pattern.a02behavioral.visitor.alpha;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * EmployeeGroup: ObjectStructure 4;
 * 员工组: 对象结构 4;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public class EmployeeGroup {

    private final Map<String, Employee> uniqueNameEmployeeMap = new LinkedHashMap<>();

    public void accept(BaseDepartmentManager departmentManager) {
        uniqueNameEmployeeMap.values().forEach(employee ->
                employee.accept(departmentManager));
    }

    public EmployeeGroup addEmployee(Employee employee) {
        uniqueNameEmployeeMap.put(employee.getUniqueName(), employee);
        return this;
    }

    public Employee getEmployee(String uniqueName) {
        return uniqueNameEmployeeMap.get(uniqueName);
    }
}
