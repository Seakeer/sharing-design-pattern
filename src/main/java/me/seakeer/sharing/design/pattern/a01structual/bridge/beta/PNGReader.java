package me.seakeer.sharing.design.pattern.a01structual.bridge.beta;

import me.seakeer.sharing.design.pattern.support.OperatingSystem;

/**
 * PNGReader: ConcreteImplementor 2_A;
 * PNG图片阅读器：具体实现者（角色） 2_A;
 * ConcreteAdditiveAttribute;
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public class PNGReader implements ImageReader {

    @Override
    public void beDriven(OperatingSystem os) {
        System.out.println("PNG Reader is being driven on " + os);
    }
}
