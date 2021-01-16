package me.seakeer.sharing.design.pattern.a02behavioral.state.alpha;

/**
 * PhysicalEnvironment: Context 3;
 * 物理环境: 环境类 3;
 *
 * @author Seakeer;
 * @date 2020/4/1;
 */
public class PhysicalEnvironment {

    public static final float ZERO = 0;
    public static final float HUNDRED = 100;

    private AbstractH2OStatus status;

    /**
     * 摄氏温度
     */
    private float celciusTemperature;

    public PhysicalEnvironment(float celciusTemperature) {
        this.celciusTemperature = celciusTemperature;
        statusChanging();
    }

    public void showInfo() {
        System.out.println(info());
    }

    private String info() {
        return "CelciusTemperature: " + celciusTemperature
                + "; Status: " + status.status()
                + "; Alias: " + status.alias()
                + "; SuitableContainer: " + status.container();
    }

    private void statusChanging() {
        if (getCelciusTemperature() < ZERO) {
            this.status = new SolidH2O();
            return;
        }

        if (getCelciusTemperature() > HUNDRED) {
            this.status = new GasH2O();
            return;
        }
        this.status = new LiquidH2O();
    }

    public float getCelciusTemperature() {
        return celciusTemperature;
    }

    public PhysicalEnvironment setCelciusTemperature(float celciusTemperature) {
        this.celciusTemperature = celciusTemperature;
        statusChanging();
        return this;
    }

}
