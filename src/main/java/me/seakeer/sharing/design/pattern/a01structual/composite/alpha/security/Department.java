package me.seakeer.sharing.design.pattern.a01structual.composite.alpha.security;

import java.util.ArrayList;
import java.util.List;

/**
 * Department: Composite 2;
 * 部门：容器构件（角色） 2
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public class Department implements CompanyItem {

    private List<CompanyItem> companyItems = new ArrayList<>();
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void add(CompanyItem companyItem) {
        if (null != companyItem) {
            companyItems.add(companyItem);
        }
    }

    public void remove(CompanyItem companyItem) {
        if (null != companyItem) {
            companyItems.remove(companyItem);
        }
    }

    @Override
    public void showName() {
        System.out.println(name);
        for (CompanyItem each : companyItems) {
            each.showName();
        }
    }
}
