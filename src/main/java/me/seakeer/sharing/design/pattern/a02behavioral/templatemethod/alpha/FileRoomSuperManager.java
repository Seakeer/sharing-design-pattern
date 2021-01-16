package me.seakeer.sharing.design.pattern.a02behavioral.templatemethod.alpha;

/**
 * FileRoomSuperManager: AAbstractClass 2_A;
 * 档案室Admin：具体类 2_A;
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public class FileRoomSuperManager extends BaseFileRoomManager {

    @Override
    public void dealFile() {
        takeOut();
    }

    @Override
    public void doCheckFileRoom() {
        System.out.println("File Room Checked");
    }

    private void takeOut() {
        System.out.println("Taken File Out");
    }
}
