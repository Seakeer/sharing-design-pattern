package me.seakeer.sharing.design.pattern.a01structual.decorator.alpha;

/**
 * RadioReader: ConcreteDecorator 4_B;
 * 音频阅读器：具体装饰类（角色）
 *
 * @author Seakeer;
 * @date 2020/3/15;
 */
public class VideoReader extends SuperReader {

    public VideoReader(Reader reader) {
        super(reader);
    }

    public void readVideo() {
        System.out.println("Can Read Video");
    }

    @Override
    public void read() {
        super.read();
        readVideo();
    }
}
