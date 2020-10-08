package homework_3;

public class CalculatorWithMemory extends CalculatorWithConterDecorator {
    private double memoryShort = .0;
    private double memoryLong = .0;

    public CalculatorWithMemory(ICalculatorCommand calc) {
        super(calc);
    }

    public double getMemoryShort() {
        return memoryShort;
    }

    public double getMemoryLongAndErase() {
        double temp = memoryLong;
        this.memoryLong = .0;
        return temp;
    }

    public void setMemoryLong() {
        this.memoryLong = memoryShort;
    }

    @Override
    public double addNum(double firstNum, double secondNum) {
        memoryShort = super.addNum(firstNum, secondNum);
        return memoryShort;
    }

    @Override
    public double subNum(double firstNum, double secondNum) {
        memoryShort = super.subNum(firstNum, secondNum);
        return memoryShort;
    }

    @Override
    public double multiNum(double firstNum, double secondNum) {
        memoryShort = super.multiNum(firstNum, secondNum);
        return memoryShort;
    }

    @Override
    public double divNum(double firstNum, double secondNum) {
        memoryShort = super.divNum(firstNum, secondNum);
        return memoryShort;
    }

    @Override
    public double expNum(double num, int exp) {
        memoryShort = super.expNum(num, exp);
        return memoryShort;
    }

    @Override
    public double absNum(double num) {
        memoryShort = super.absNum(num);
        return memoryShort;
    }

    @Override
    public double sqrtNum(double num) {
        memoryShort = super.sqrtNum(num);
        return memoryShort;
    }
}
