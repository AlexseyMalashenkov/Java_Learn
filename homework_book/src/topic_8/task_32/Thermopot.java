package topic_8.task_32;

public class Thermopot extends Teapot{
    private double waterTemperature;

    public Thermopot(double length, double width, double height, double weight, String title, String color, double waterVolume, double power, double waterTemperature) {
        super(length, width, height, weight, title, color, waterVolume, power);
        this.waterTemperature = waterTemperature;
        System.out.println("Создался термопот");
    }

    public double getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(double waterTemperature) {
        this.waterTemperature = waterTemperature;
    }
}
