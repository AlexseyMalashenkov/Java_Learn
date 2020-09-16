package homework_3;

public class CalculatorWithMathCopy implements ICalculatorCommand{

    public double addNum(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public double subNum(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public double multiNum(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public double divNum(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

    public double expNum(double num, int exp) {
        return Math.pow(num, exp);
    }

    public double absNum(double num) {
        return Math.abs(num);
    }

    public double sqrtNum(double num) {
        return Math.sqrt(num);
    }
}