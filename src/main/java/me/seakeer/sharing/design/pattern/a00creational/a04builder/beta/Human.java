package me.seakeer.sharing.design.pattern.a00creational.a04builder.beta;

/**
 * Human;
 *
 * @author Seakeer;
 * @date 2020/3/9;
 */
public class Human {

    private String head;
    private String body;
    private String hands;
    private String feet;

    public String getHead() {
        return head;
    }

    public Human setHead(String head) {
        this.head = head;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Human setBody(String body) {
        this.body = body;
        return this;
    }

    public String getHands() {
        return hands;
    }

    public Human setHands(String hands) {
        this.hands = hands;
        return this;
    }

    public String getFeet() {
        return feet;
    }

    public Human setFeet(String feet) {
        this.feet = feet;
        return this;
    }
}
