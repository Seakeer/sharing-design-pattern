package me.seakeer.sharing.design.pattern.a02behavioral.templatemethod.alpha;

/**
 * TemplateMethodPatternMain;
 * 模板方法模式：模板方法封装执行步骤;
 * 父类统一步骤，子类进行差异化;
 *
 * @author Seakeer;
 * @date 2020/4/2; 2018/8/21;
 * @see BaseFileRoomManager    --> AAbstractClass 1   抽象类;
 * @see FileRoomSuperManager   --> ConcreteClass  2_A 具体类;
 * @see FileRoomGeneralManager --> ConcreteClass  2_B 具体类;
 */
public class TemplateMethodPatternMain {

    public static void main(String[] args) {
        System.out.println("------Super Manager------");
        BaseFileRoomManager fileRoomAdmin = new FileRoomSuperManager();
        fileRoomAdmin.executeManagementProcess();

        System.out.println("------General Manager------");
        System.out.println("Other Manager Is In File Room");
        BaseFileRoomManager fileRoomManagers = new FileRoomGeneralManager();
        fileRoomManagers.executeManagementProcess();
    }
}
