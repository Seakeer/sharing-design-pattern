package me.seakeer.sharing.design.pattern.a01structual.bridge.beta;

/**
 * BridgePatternMain;
 *
 * @author Seakeer;
 * @date 2020/3/11; 2018/8/13;
 * @see ImageReader           --> IAImplementor       1   抽象实现者;
 * @see PNGReader             --> ConcreteImplementor 2_A 具体实现者;
 * @see JPGReader             --> ConcreteImplementor 2_B 具体实现者;
 * @see BaseImgReaderPlatform --> AAbstraction        3   抽象类角色;
 * @see LinuxPlatform         --> RefinedAbstraction  4_A 扩充抽象类角色;
 * @see WindowsPlatform       --> RefinedAbstraction  4_B 扩充抽象类角色;
 */
public class BridgePatternMain {

    public static void main(String[] args) {

        ImageReader pngReader = new PNGReader();
        ImageReader jpgReader = new JPGReader();

        BaseImgReaderPlatform windows = new WindowsPlatform();
        BaseImgReaderPlatform linux = new LinuxPlatform();

        windows.setImageReader(pngReader);
        linux.setImageReader(jpgReader);

        windows.run();
        linux.run();
    }
}
