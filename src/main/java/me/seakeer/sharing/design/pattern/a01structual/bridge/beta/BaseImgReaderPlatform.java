package me.seakeer.sharing.design.pattern.a01structual.bridge.beta;

/**
 * BaseImgReaderPlatform: AAbstraction 3;
 * 操作系统：抽象类角色 3;
 *
 * @author Seakeer;
 * @date 2020-03-12;
 */
public abstract class BaseImgReaderPlatform {

    protected ImageReader imageReader;

    public void setImageReader(ImageReader imageReader) {
        this.imageReader = imageReader;
    }

    /**
     * run
     */
    public abstract void run();
}
