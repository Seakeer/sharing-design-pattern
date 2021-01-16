package me.seakeer.sharing.design.pattern.a01structual.decorator.alpha;

/**
 * DecoratorPatternMain;
 * 装饰者模式：通过关联关系给对象动态增加职责、功能扩展，具体构件和具体装饰类独立变化;
 * 关联关系给对象动态增加职责、功能扩展；
 *
 * @author Seakeer;
 * @date 2020/3/15; 2018/8/13;
 * @see Reader      --> IAComponent       1   抽象构件;
 * @see TextReader  --> ConcreteComponent 2   具体构件;
 * @see SuperReader --> ACDecorator       3   抽象装饰者;
 * @see ImageReader --> ConcreteDecorator 4_A 具体装饰者;
 * @see VideoReader --> ConcreteDecorator 4_B 具体装饰者;
 */
public class DecoratorPatternMain {

    public static void main(String[] args) {

        System.out.println("------Original Function------");
        TextReader reader = new TextReader();
        reader.read();

        System.out.println("------Upgrade Function First Time------ ");
        ImageReader imageReader = new ImageReader(reader);
        imageReader.read();

        System.out.println("------Upgrade Function Second Time------ ");
        VideoReader videoReader = new VideoReader(reader);
        videoReader.read();

        System.out.println("------Upgrade Function Third Time------");
        VideoReader vr = new VideoReader(new ImageReader(reader));
        vr.read();
    }
}
