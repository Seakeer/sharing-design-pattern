package me.seakeer.sharing.design.pattern.a00creational.a04builder.beta;

/**
 * Director;
 *
 * @author Seakeer;
 * @date 2020/3/9;
 */
public class Director {

    public Human createHumanByDirector(IHumanBuilder bh) {
        bh.buildBody();
        bh.buildFeet();
        bh.buildHands();
        bh.buildHead();
        return bh.createHuman();
    }
}

