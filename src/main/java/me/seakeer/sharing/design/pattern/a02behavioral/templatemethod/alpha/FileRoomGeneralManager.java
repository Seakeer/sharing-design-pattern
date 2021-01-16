package me.seakeer.sharing.design.pattern.a02behavioral.templatemethod.alpha;

/**
 * FileRoomGeneralManager: ConcreteClass 2_B;
 * 档案室普通管理员：具体类 2_B;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public class FileRoomGeneralManager extends BaseFileRoomManager {

    @Override
    public void dealFile() {
        bringIn();
    }

    @Override
    public boolean isOtherInFileRoom() {
        return true;
    }

    @Override
    public void doTurnLightsOn() {
        System.out.println("Turn Some Lights On");
    }

    private void bringIn() {
        System.out.println("Brought File In");
    }
}


