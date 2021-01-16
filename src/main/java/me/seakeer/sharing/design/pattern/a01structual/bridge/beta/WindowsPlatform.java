package me.seakeer.sharing.design.pattern.a01structual.bridge.beta;

import me.seakeer.sharing.design.pattern.support.OperatingSystem;

/**
 * WindowsPlatform: RefinedAbstraction 4_B;
 * Windows：扩充抽象类角色 4_B
 * ConcreteBuildinAttribute
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public class WindowsPlatform extends BaseImgReaderPlatform {

    @Override
    public void run() {
        imageReader.beDriven(OperatingSystem.WINDOWS);
    }
}
