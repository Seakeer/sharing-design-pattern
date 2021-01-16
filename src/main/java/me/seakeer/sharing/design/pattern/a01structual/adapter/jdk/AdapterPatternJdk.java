package me.seakeer.sharing.design.pattern.a01structual.adapter.jdk;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * AdapterPatternJdk;
 * 对象适配器，将字节流适配为字符流。
 *
 * @author Seakeer;
 * @date 2020-12-05;
 * @see java.io.InputStream,FileInputStream --> Adaptee       1 被适配者;
 * @see java.io.Reader                      --> IATarget      2 目标抽象类;
 * @see java.io.InputStreamReader           --> ObjectAdapter 3 适配器;
 */
public class AdapterPatternJdk {

    public static void main(String[] args) {
        try (Reader reader = new InputStreamReader(new FileInputStream("src/main/resources/AdapterPatternJdkSupportFile.md"));) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = new char[1024];
            int readLength;
            do {
                readLength = reader.read(chars, 0, 1024);
                if (-1 != readLength) {
                    stringBuilder.append(chars, 0, readLength);
                }
            } while (-1 != readLength);

            System.out.println(stringBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
