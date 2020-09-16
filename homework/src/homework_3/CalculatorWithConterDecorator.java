package homework_3;

public class CalculatorWithConterDecorator implements ICalculatorWithCounter{
    private final ICalculatorCommand calc;
    private long counter = 0;

    public CalculatorWithConterDecorator(ICalculatorCommand calc) {
        this.calc = calc;
    }

    public double addNum(double firstNum, double secondNum) {
        this.counter++;
        return calc.addNum(firstNum, secondNum);
    }

    public double subNum(double firstNum, double secondNum) {
        this.counter++;
        return calc.subNum(firstNum, secondNum);
    }

    public double multiNum(double firstNum, double secondNum) {
        this.counter++;
        return calc.multiNum(firstNum, secondNum);
    }

    public double divNum(double firstNum, double secondNum) {
        this.counter++;
        return calc.divNum(firstNum, secondNum);
    }

    public double expNum(double num, int exp) {
        this.counter++;
        return calc.expNum(num, exp);
    }

    public double absNum(double num) {
        this.counter++;
        return calc.absNum(num);
    }

    public double sqrtNum(double num) {
        this.counter++;
        return calc.sqrtNum(num);
    }

    @Override
    public long getCounter() {
        return this.counter;
    }
}
