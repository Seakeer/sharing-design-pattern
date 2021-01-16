package me.seakeer.sharing.design.pattern.a00creational.a04builder.beta;

/**
 * IHumanBuilder;
 *
 * @author Seakeer;
 * @date 2020/3/9;
 */
public interface IHumanBuilder {

    /**
     * head
     */
    void buildHead();

    /**
     * body
     */
    void buildBody();

    /**
     * hand
     */
    void buildHands();

    /**
     * feet
     */
    void buildFeet();

    /**
     * creat human
     *
     * @return human created
     */
    Human createHuman();
}