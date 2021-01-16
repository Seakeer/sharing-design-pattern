package me.seakeer.sharing.design.pattern.a01structual.bridge.beta;

import me.seakeer.sharing.design.pattern.support.OperatingSystem;

/**
 * LinuxPlatform: RefinedAbstraction 4_A;
 * Linux：扩充抽象类角色 4_A;
 * ConcreteBuildinAttribute;
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public class LinuxPlatform extends BaseImgReaderPlatform {

    @Override
    public void run() {
        imageReader.beDriven(OperatingSystem.LINUX);
    }
}
