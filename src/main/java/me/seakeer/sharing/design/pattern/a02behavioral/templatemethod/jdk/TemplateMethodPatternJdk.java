package me.seakeer.sharing.design.pattern.a02behavioral.templatemethod.jdk;

import java.io.*;

/**
 * TemplateMethodPatternJdk;
 *
 * @author Seakeer;
 * @date 2020/5/11;
 * @see java.io.InputStream#read(byte[]) --> AAbstractClass 1   抽象类;
 * @see java.io.FileInputStream          --> ConcreteClass  2_A 具体类;
 * @see java.io.ObjectInputStream        --> ConcreteClass  2_B 具体类;
 */
public class TemplateMethodPatternJdk {

    public static final String VALUE = "HelloWorld";

    public static void main(String[] args) {
        testSerialization();
    }

    private static void testSerialization() {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(new SerializationTest().setValue(VALUE));
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                SerializationTest serializationTest = (SerializationTest) ois.readObject();
                System.out.println(serializationTest.getValue());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class SerializationTest implements Serializable {

        private String value;

        public String getValue() {
            return value;
        }

        public SerializationTest setValue(String value) {
            this.value = value;
            return this;
        }
    }
}
