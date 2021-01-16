package me.seakeer.sharing.design.pattern.a00creational.a04builder.alpha;

/**
 * ComputerBuildingController: Director 4;
 * 计算机建造控制中心：指挥者角色;
 *
 * @author Seakeer;
 * @date 2020/3/7;
 */
public class ComputerBuildingController {

    public Computer createComputer(BaseComputerBuilder computerBuilder) {
        computerBuilder
                .buildCPU()
                .buildMemory()
                .buildIO();

        if (computerBuilder.whetherInit()) {
            System.out.println("---initialised---");
        }
        return computerBuilder.buildComputer();
    }
}
