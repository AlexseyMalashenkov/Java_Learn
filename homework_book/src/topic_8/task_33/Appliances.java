package topic_8.task_33;

public class Appliances {
    private double length;
    private double width;
    private double height;
    private double weight;
    private String title;

    public Appliances(double length, double width, double height, double weight, String title) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.title = title;
        System.out.println("Создалась бытовая техника");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }
}
