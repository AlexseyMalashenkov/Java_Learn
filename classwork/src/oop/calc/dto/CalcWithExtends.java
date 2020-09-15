package oop.calc.dto;

public class CalcWithExtends extends CalcWithOperator {
    @Override
    public double abs(double a) {
        return super.abs(a);
    }

    @Override
    public double power(double a, int b) {
        return super.power(a, b);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
