package me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.staticproxy;

import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Business;
import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Manufacturer;

/**
 * Reseller: StaticProxy 3;
 * 代理商: 代理角色;
 * 关联关系;
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class Reseller implements Business {

    private Manufacturer manufacturer;

    public Reseller(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void sellProduct() {
        System.out.println("pre-sale service");
        manufacturer.sellProduct();
        System.out.println("after-sale service");
    }
}