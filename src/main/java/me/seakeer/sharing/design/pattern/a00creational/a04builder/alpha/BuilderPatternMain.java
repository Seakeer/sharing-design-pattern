package me.seakeer.sharing.design.pattern.a00creational.a04builder.alpha;

/**
 * BuilderPatternMain;
 * 建造者模式：分离对象的构建和表示;
 * 抽象类或接口持有对象类型的属性并提供创建属性的方法;
 *
 * @author Seakeer;
 * @date 2020/3/7; 2018/8/29;
 * @see Computer                   --> Product         1   产品角色;
 * @see BaseComputerBuilder        --> IABuilder       2   抽象建造者;
 * @see PersonalComputerBuilder    --> ConcreteBuilder 3_A 具体建造者;
 * @see SuperComputerBuilder       --> ConcreteBuilder 3_B 具体建造者;
 * @see ComputerBuildingController --> Director        4   指挥者角色;
 */
public class BuilderPatternMain {

    public static void main(String[] args) {

        System.out.println("------Build PC------");
        //建造者
        BaseComputerBuilder computerBuilder = new PersonalComputerBuilder();

        //指挥者
        ComputerBuildingController director = new ComputerBuildingController();

        //指挥者指挥创建
        Computer computer = director.createComputer(computerBuilder);

        System.out.println(computer.getCpu());
        System.out.println(computer.getMemory());
        System.out.println(computer.getIo());

        System.out.println("------Build SuperComputer------");
        computerBuilder = new SuperComputerBuilder();
        computer = director.createComputer(computerBuilder);

        System.out.println(computer.getCpu());
        System.out.println(computer.getMemory());
        System.out.println(computer.getIo());
    }
}
