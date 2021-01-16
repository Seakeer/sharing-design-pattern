package me.seakeer.sharing.design.pattern.a00creational.a05prototype.beta;

import me.seakeer.sharing.design.pattern.a00creational.a05prototype.beta.support.ObjectCloneable;
import me.seakeer.sharing.design.pattern.a00creational.a05prototype.beta.support.ObjectNotCloneable;

import java.io.*;

/**
 * ConcretePrototype: ConcretePrototype 2;
 * 具体原型，抽象原型为Object类
 * 实现Serializable 接口是为了通过序列化来实现深克隆
 *
 * @author Seakeer;
 * @date 2020/3/10; 2018/8/8;
 */
public class ConcretePrototype implements Cloneable, Serializable {

    private int intAttr;

    private Integer integerAttr;

    private String stringAttr;

    private String[] stringArrAttr;

    private ObjectCloneable objectCloneableAttr;

    private ObjectNotCloneable objectNotCloneableAttr;

    public ConcretePrototype() {

    }

    public ConcretePrototype(int intAttr, Integer integerAttr, String stringAttr, String[] stringArrAttr) {

        this.intAttr = intAttr;
        this.integerAttr = integerAttr;
        this.stringAttr = stringAttr;
        this.stringArrAttr = stringArrAttr;
    }

    @Override
    public ConcretePrototype clone() {

        ConcretePrototype prototypePattern = null;
        try {
            prototypePattern = (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypePattern;
    }

    public ConcretePrototype deepClone() {

        ConcretePrototype prototypePattern = null;
        try {
            prototypePattern = (ConcretePrototype) super.clone();
            if (null != prototypePattern
                    && null != prototypePattern.getObjectCloneableAttr()) {
                prototypePattern.setObjectCloneableAttr(prototypePattern.getObjectCloneableAttr().clone());
            }
            if (null != prototypePattern
                    && null != prototypePattern.getStringArrAttr()) {
                prototypePattern.setStringArrAttr(prototypePattern.getStringArrAttr().clone());
            }

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypePattern;
    }

    public ConcretePrototype deepCloneBySerialization() {

        try {
            //对象写入流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            //从流中取出对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (ConcretePrototype) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("DeepCloneBySerialization Failed");
        }

        return null;
    }

    //-----------------getter setter-----------------

    public int getIntAttr() {
        return intAttr;
    }

    public ConcretePrototype setIntAttr(int intAttr) {
        this.intAttr = intAttr;
        return this;
    }

    public Integer getIntegerAttr() {
        return integerAttr;
    }

    public ConcretePrototype setIntegerAttr(Integer integerAttr) {
        this.integerAttr = integerAttr;
        return this;
    }

    public String getStringAttr() {
        return stringAttr;
    }

    public ConcretePrototype setStringAttr(String stringAttr) {
        this.stringAttr = stringAttr;
        return this;
    }

    public String[] getStringArrAttr() {
        return stringArrAttr;
    }

    public ConcretePrototype setStringArrAttr(String[] stringArrAttr) {
        this.stringArrAttr = stringArrAttr;
        return this;
    }

    public ObjectCloneable getObjectCloneableAttr() {
        return objectCloneableAttr;
    }

    public ConcretePrototype setObjectCloneableAttr(ObjectCloneable objectCloneableAttr) {
        this.objectCloneableAttr = objectCloneableAttr;
        return this;
    }

    public ObjectNotCloneable getObjectNotCloneableAttr() {
        return objectNotCloneableAttr;
    }

    public ConcretePrototype setObjectNotCloneableAttr(ObjectNotCloneable objectNotCloneableAttr) {
        this.objectNotCloneableAttr = objectNotCloneableAttr;
        return this;
    }
}
