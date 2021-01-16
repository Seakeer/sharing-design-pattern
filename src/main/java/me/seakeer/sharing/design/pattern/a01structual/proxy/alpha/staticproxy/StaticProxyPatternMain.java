package me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.staticproxy;

import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Business;
import me.seakeer.sharing.design.pattern.a01structual.proxy.alpha.Manufacturer;

/**
 * StaticProxyPatternMain;
 * 静态代理模式;
 *
 * @author Seakeer;
 * @date 2020/3/15; 2018/8/17;
 * @see Business     --> IASuject    1 抽象主题;
 * @see Manufacturer --> RealSubject 2 真实主题;
 * @see Reseller     --> Proxy       3 代理;
 * @see SubCompany   --> Proxy       3 代理;
 */
public class StaticProxyPatternMain {

    public static void main(String[] args) {

        System.out.println("------ Sell Directly ------");
        Business business = new Manufacturer();
        business.sellProduct();

        System.out.println("------ Sell by Reseller ------");
        business = new Reseller((Manufacturer) business);
        business.sellProduct();

        System.out.println("------ Sell by SubCompany ------");
        business = new SubCompany();
        business.sellProduct();
    }
}
