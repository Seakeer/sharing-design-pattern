package me.seakeer.sharing.design.pattern.a00creational.a04builder.beta;

/**
 * HumanBuilderMain;
 *
 * @author Seakeer;
 * @date 2020/3/9;
 * @see Human
 * @see IHumanBuilder
 * @see SmartManBuilder
 * @see Director
 */
public class HumanBuilderMain {

    public static void main(String[] args) {

        Director director = new Director();
        Human human = director.createHumanByDirector(new SmartManBuilder());
        System.out.println(human.getHead());
        System.out.println(human.getBody());
        System.out.println(human.getHands());
        System.out.println(human.getFeet());
    }

}
