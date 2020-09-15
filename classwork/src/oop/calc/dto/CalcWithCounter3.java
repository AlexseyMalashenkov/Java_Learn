package oop.calc.dto;

public class CalcWithCounter3 implements ICalcWithCounter {

    private final ICalc calc;
    private long counter = 0;

    public CalcWithCounter3(ICalc calc) {
        this.calc = calc;
    }

    public double plus(double a, double b) {
        this.counter++;
        return calc.plus(a, b);
    }

    public double minus(double a, double b) {
        this.counter++;
        return calc.minus(a, b);
    }

    public double div(double a, double b) {
        this.counter++;
        return calc.div(a, b);
    }

    public double multi(double a, double b) {
        this.counter++;
        return calc.multi(a, b);
    }

    public double abs(double a) {
        this.counter++;
        return calc.abs(a);
    }

    public double power(double a, int b) {
        this.counter++;
        return calc.power(a, b);
    }

    public double sqrt(double a) {
        this.counter++;
        return calc.sqrt(a);
    }

    public long getCounter() {
        return counter;
    }
}