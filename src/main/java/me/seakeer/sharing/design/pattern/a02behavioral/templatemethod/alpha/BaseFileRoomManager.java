package me.seakeer.sharing.design.pattern.a02behavioral.templatemethod.alpha;

/**
 * BaseFileRoomManager: AAbstractClass 1;
 * 档案室管理员：抽象类 1;
 * 一般包含如下方法:
 * 模板方法: 封装一系列流程， 通常为final，不允许子类重写
 * 基本方法: 具体方法 + 抽象方法(具体类实现) + 钩子方法(默认实现 or 空实现)
 *
 * @author Seakeer;
 * @date 2020/4/2;
 */
public abstract class BaseFileRoomManager {

    /**
     * 执行管理流程
     * 模板方法: 封装一系列流程
     */
    public final void executeManagementProcess() {

        if (!isOtherInFileRoom()) {
            unlock();
            openDoor();
        }

        enterFileRoom();

        if (!isLightEnough()) {
            doTurnLightsOn();
        }

        dealFile();
        doCheckFileRoom();

        if (isOtherInFileRoom()) {
            exitFileRoom();
        } else {
            turnLightsOff();
            exitFileRoom();
            closeDoor();
            lock();
        }
    }

    /**
     * 开锁;
     * 基本方法：具体方法
     */
    public void unlock() {
        System.out.println("The Lock Unlocked");
    }

    public void openDoor() {
        System.out.println("The Door Opened");
    }

    public void enterFileRoom() {
        System.out.println("Entering The File Room");
    }

    /**
     * 开灯;
     * 基本方法：钩子方法, 默认实现
     */
    public void doTurnLightsOn() {
        System.out.println("All Lights Turned On");
    }

    /**
     * 处理文件;
     * 基本方法：抽象方法
     */
    public abstract void dealFile();

    public void turnLightsOff() {
        System.out.println("All Lights Turned Off");
    }

    public void exitFileRoom() {
        System.out.println("Exiting The File Room");
    }

    public void closeDoor() {
        System.out.println("The Door Closed");
    }

    public void lock() {
        System.out.println("The Lock Locked");
    }


    /**
     * 判断档案室内是否有其他管理员
     * 基本方法：钩子方法
     *
     * @return true
     */
    public boolean isOtherInFileRoom() {
        return false;
    }

    public boolean isLightEnough() {
        return false;
    }

    /**
     * 检查档案室
     * 基本方法：钩子方法,空实现
     */
    public void doCheckFileRoom() {

    }

}
