package oop;

public class Man {
    private String name;
    private int hairLength;

    private int variable1;
    protected int variable2;
    int variable3;
    public int variable4;

    public Man() {
        name = "Иван";
        hairLength = 5;
    }

    public Man(String name, int hairLength) {
        this.name = name;
        this.hairLength = hairLength;
    }

    public String getName() {
        return this.name;
    }

    public int getHairLength() {
        return this.hairLength;
    }

    public String sayHello() {
        return "Привет!";
    }

    public void grow() {
        hairLength++;
    }

    public String toString() {
        return "Имя: " + this.name + ", Длинна волос: " + this.hairLength;
    }
}
