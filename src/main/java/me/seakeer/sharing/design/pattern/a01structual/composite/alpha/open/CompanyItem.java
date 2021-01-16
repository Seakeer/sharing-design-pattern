package me.seakeer.sharing.design.pattern.a01structual.composite.alpha.open;

/**
 * CompanyItem: IAComponent 1;
 * 公司构成项：抽象构件（角色） 1
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public interface CompanyItem {

    /**
     * add
     *
     * @param companyItem company item
     */
    void add(CompanyItem companyItem);

    /**
     * remove
     *
     * @param companyItem company item
     */
    void remove(CompanyItem companyItem);

    /**
     * show name
     */
    void showName();
}
