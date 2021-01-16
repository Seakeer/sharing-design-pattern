package me.seakeer.sharing.design.pattern.a01structual.bridge.beta;

import me.seakeer.sharing.design.pattern.support.OperatingSystem;

/**
 * ImageReader: IAImplementor 1;
 * 图片阅读器：抽象实现者(角色) 1;
 * IAAdditiveAttribute;
 *
 * @author Seakeer;
 * @date 2020/3/11;
 */
public interface ImageReader {

    /**
     * be driven
     *
     * @param os OperatingSystem
     */
    void beDriven(OperatingSystem os);
}
