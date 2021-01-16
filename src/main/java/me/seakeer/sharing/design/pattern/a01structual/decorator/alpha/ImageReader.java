package me.seakeer.sharing.design.pattern.a01structual.decorator.alpha;

/**
 * ImageReader: ConcreteDecorator 4_A;
 * 图片阅读器: 具体装饰者角色
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class ImageReader extends SuperReader {

    public ImageReader(Reader reader) {
        super(reader);
    }

    public void readImage() {
        System.out.println("Can Read Image");
    }

    @Override
    public void read() {
        super.read();
        readImage();
    }
}
