package me.seakeer.sharing.design.pattern.a01structual.bridge.beta;

import me.seakeer.sharing.design.pattern.support.OperatingSystem;

/**
 * JPGReader: ConcreteImplementor 2_B;
 * JPG 图片阅读器：具体实现者（角色） 2_B;
 * ConcreteAdditiveAttribute;
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public class JPGReader implements ImageReader {

    @Override
    public void beDriven(OperatingSystem os) {
        System.out.println("JPG Reader is being driven on " + os);
    }
}
