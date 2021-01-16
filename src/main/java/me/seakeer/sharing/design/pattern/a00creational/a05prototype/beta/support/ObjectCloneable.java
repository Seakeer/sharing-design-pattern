package me.seakeer.sharing.design.pattern.a00creational.a05prototype.beta.support;

import java.io.Serializable;

/**
 * ObjectCloneable;
 *
 * @author Seakeer;
 * @date 2020/3/29;
 */
public class ObjectCloneable implements Cloneable, Serializable {

    private int intAttr;

    private Integer integerAttr;

    private String stringAttr;

    private String[] stringArrAttr;

    public ObjectCloneable(int intAttr, Integer integerAttr, String stringAttr, String[] stringArrAttr) {

        this.intAttr = intAttr;
        this.integerAttr = integerAttr;
        this.stringAttr = stringAttr;
        this.stringArrAttr = stringArrAttr;
    }

    @Override
    public ObjectCloneable clone() {

        ObjectCloneable objectCloneable = null;

        try {
            objectCloneable = (ObjectCloneable) super.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }

        return objectCloneable;

    }

    public int getIntAttr() {
        return intAttr;
    }

    public ObjectCloneable setIntAttr(int intAttr) {
        this.intAttr = intAttr;
        return this;
    }

    public Integer getIntegerAttr() {
        return integerAttr;
    }

    public ObjectCloneable setIntegerAttr(Integer integerAttr) {
        this.integerAttr = integerAttr;
        return this;
    }

    public String getStringAttr() {
        return stringAttr;
    }

    public ObjectCloneable setStringAttr(String stringAttr) {
        this.stringAttr = stringAttr;
        return this;
    }

    public String[] getStringArrAttr() {
        return stringArrAttr;
    }

    public ObjectCloneable setStringArrAttr(String[] stringArrAttr) {
        this.stringArrAttr = stringArrAttr;
        return this;
    }
}
