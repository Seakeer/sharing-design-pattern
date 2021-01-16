package me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.staticproxy;

import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Manufacturer;

/**
 * SubCompany: StaticProxy 3;
 * 子公司: 代理角色;
 * 继承关系;
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class SubCompany extends Manufacturer {

    @Override
    public void sellProduct() {
        System.out.println("pre-sale service");
        super.sellProduct();
        System.out.println("after-sale service");
    }
}