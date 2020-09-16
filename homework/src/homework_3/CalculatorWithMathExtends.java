package homework_3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double expNum(double num, int exp) {
        return Math.pow(num, exp);
    }

    @Override
    public double absNum(double num) {
        return Math.abs(num);
    }

    @Override
    public double sqrtNum(double num) {
        return Math.sqrt(num);
    }
}