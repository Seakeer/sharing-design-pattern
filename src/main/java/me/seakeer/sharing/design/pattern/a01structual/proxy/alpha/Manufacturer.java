package me.seakeer.sharing.design.pattern.a01structual.proxy.alpha;

/**
 * Manufacturer: RealSubject 2;
 * 生产商: 真实主题角色;
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class Manufacturer implements Business {

    @Override
    public void sellProduct() {
        System.out.println("Sell Product");
    }
}
