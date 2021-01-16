package me.seakeer.sharing.design.pattern.a01structual.composite.alpha.open;

/**
 * Staff: Leaf 3;
 * 员工：叶子构件（角色） 3
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public class Staff implements CompanyItem {

    private String name;

    public Staff(String name) {
        this.name = name;
    }

    @Override
    public void add(CompanyItem companyItem) {
        System.out.println("Not Support");
    }

    @Override
    public void remove(CompanyItem companyItem) {
        System.out.println("Not Support");
    }

    @Override
    public void showName() {
        System.out.println(name);
    }
}
