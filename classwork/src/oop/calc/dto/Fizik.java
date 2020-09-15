package oop.calc.dto;

public class Fizik {
    private ICalc calc;

    public Fizik(ICalc calc) {
        this.calc = calc;
    }

    public double calc(int a, int b) {
        return this.calc.minus(a, b);
    }

    public ICalc getCalc() {
        return this.calc;
    }
}
