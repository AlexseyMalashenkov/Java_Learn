package homework_3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double addNum(double firstNum, double secondNum) {
        return super.addNum(firstNum, secondNum);
    }

    @Override
    public double subNum(double firstNum, double secondNum) {
        return super.subNum(firstNum, secondNum);
    }

    @Override
    public double multiNum(double firstNum, double secondNum) {
        return super.multiNum(firstNum, secondNum);
    }

    @Override
    public double divNum(double firstNum, double secondNum) {
        return super.divNum(firstNum, secondNum);
    }

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
