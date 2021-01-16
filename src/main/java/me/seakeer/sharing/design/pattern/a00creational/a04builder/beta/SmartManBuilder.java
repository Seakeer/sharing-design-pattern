package me.seakeer.sharing.design.pattern.a00creational.a04builder.beta;

/**
 * SmartManBuilder;
 *
 * @author Seakeer;
 * @date 2020/3/9; 2018/8/13;
 */
public class SmartManBuilder implements IHumanBuilder {

    private Human human;

    public SmartManBuilder() {
        human = new Human();
    }

    @Override
    public void buildHead() {
        human.setHead("Smart Head");
    }

    @Override
    public void buildBody() {
        human.setBody("Smart Body");

    }

    @Override
    public void buildHands() {
        human.setHands("Smart Hands");
    }

    @Override
    public void buildFeet() {
        human.setFeet("Smart Feet");

    }

    @Override
    public Human createHuman() {
        return human;
    }

}
