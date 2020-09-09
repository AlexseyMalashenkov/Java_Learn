package classes;

public class Man {
    private String name = "Иван";
    private int hairLength = 5;

    public String sayHello() {
        return "Привет!";
    }

    public void grow() {
        hairLength++;
    }
}
