package me.seakeer.sharing.design.pattern.a00creational.a05prototype.beta.support;

import java.io.Serializable;

/**
 * ObjectNotCloneable;
 *
 * @author Seakeer;
 * @date 2020/3/29;
 */
public class ObjectNotCloneable implements Serializable {

    private int intAttr;

    private Integer integerAttr;

    private String stringAttr;

    private String[] stringArrAttr;


    public ObjectNotCloneable(int intAttr, Integer integerAttr, String stringAttr, String[] stringArrAttr) {

        this.intAttr = intAttr;
        this.integerAttr = integerAttr;
        this.stringAttr = stringAttr;
        this.stringArrAttr = stringArrAttr;
    }

    public int getIntAttr() {
        return intAttr;
    }

    public ObjectNotCloneable setIntAttr(int intAttr) {
        this.intAttr = intAttr;
        return this;
    }

    public Integer getIntegerAttr() {
        return integerAttr;
    }

    public ObjectNotCloneable setIntegerAttr(Integer integerAttr) {
        this.integerAttr = integerAttr;
        return this;
    }

    public String getStringAttr() {
        return stringAttr;
    }

    public ObjectNotCloneable setStringAttr(String stringAttr) {
        this.stringAttr = stringAttr;
        return this;
    }

    public String[] getStringArrAttr() {
        return stringArrAttr;
    }

    public ObjectNotCloneable setStringArrAttr(String[] stringArrAttr) {
        this.stringArrAttr = stringArrAttr;
        return this;
    }
}
