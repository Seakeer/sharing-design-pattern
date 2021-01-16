package me.seakeer.sharing.design.pattern.a01structual.decorator.jdk;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * DecoratorPatternJdk;
 * 使用BufferedInputStream给FileInputStream扩充功能;
 *
 * @author Seakeer;
 * @date 2020/3/15; 2018/8/13;
 * @see java.io.InputStream         --> IAComponent       1   抽象构件;
 * @see java.io.FileInputStream     --> ConcreteComponent 2   具体构件;
 * @see java.io.FilterInputStream   --> ACDecorator       3   抽象装饰者;
 * @see java.io.BufferedInputStream --> ConcreteDecorator 4_A 具体装饰者;
 * @see java.io.DataInputStream     --> ConcreteDecorator 4_B 具体装饰者;
 */
@SuppressWarnings("ResultOfMethodCallIgnored")
public class DecoratorPatternJdk {

    public static void main(String[] args) throws IOException {

        byte[] bytes = new byte[19];
        File file = new File("src/main/resources/DecoratorPatternJdkSupportFile.md");

        System.out.println("------文件输入流------");
        try (InputStream fis = new FileInputStream(file)) {
            fis.read(bytes);
            System.out.println(new String(bytes, StandardCharsets.UTF_8));
        }

        System.out.println("------带有缓冲区的文件输入流------ ");
        try (BufferedInputStream bufferedFis = new BufferedInputStream(new FileInputStream(file))) {
            bufferedFis.read(bytes);
            System.out.println(new String(bytes, StandardCharsets.UTF_8));
        }

        System.out.println("------以与机器无关的方式读取Java基本数据类型的文件输入流------ ");
        try (DataInputStream dataFis = new DataInputStream(new FileInputStream(file))) {
            System.out.println(dataFis.readBoolean());
        }

        System.out.println("------与机器无关, 带缓冲区, 文件输入流------");
        try (DataInputStream dataBufferedFis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            System.out.println(dataBufferedFis.readBoolean());
        }

    }
}
