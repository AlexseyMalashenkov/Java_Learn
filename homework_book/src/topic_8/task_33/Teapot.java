package topic_8.task_33;

public class Teapot extends Appliances {
    private String color;
    private double waterVolume;
    private double power;

    public Teapot(double length, double width, double height, double weight, String title, String color, double waterVolume, double power) {
        super(length, width, height, weight, title);
        this.color = color;
        this.waterVolume = waterVolume;
        this.power = power;
        System.out.println("Создался чайник");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(double waterVolume) {
        this.waterVolume = waterVolume;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
