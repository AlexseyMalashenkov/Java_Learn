package homework_3;

public class CalcWithMemoryDecorator implements ICalculatorWithMemory {

    private final ICalculatorCommand calc;
    private double memory = 0;
    private boolean isKey = false;

    CalcWithMemoryDecorator(ICalculatorCommand calc) {
        this.calc = calc;
    }

    public double addNum(double firstNum, double secondNum) {
        return calc.addNum(firstNum, secondNum);
    }

    public double subNum(double firstNum, double secondNum) {
        return calc.subNum(firstNum, secondNum);
    }

    public double multiNum(double firstNum, double secondNum) {
        return calc.multiNum(firstNum, secondNum);
    }

    public double divNum(double firstNum, double secondNum) {
        return calc.divNum(firstNum, secondNum);
    }

    public double expNum(double num, int exp) {
        return calc.expNum(num, exp);
    }

    public double absNum(double num) {
        return calc.absNum(num);
    }

    public double sqrtNum(double num) {
        return calc.sqrtNum(num);
    }

    @Override
    public void saveToMemory(double num) {
        if (isKey == false) {
            this.memory = num;
            isKey = true;
        } else {
            System.out.printf("В памяти записано число - " + "%.2f" + " оно будет перезаписанно.", this.memory );
            System.out.println();

            this.memory = num;
        }
    }

    @Override
    public double loadFromMemory() {
        double tmp = this.memory;
        if (isKey == false) {
            System.out.println("Память калькулятора - пуста.");
            return 0;
        } else {
            System.out.printf("Вы получили из памяти число - " + "%.2f", this.memory );
            System.out.println();

            System.out.println("Память очищенна");
            this.memory = 0.0;
            return tmp;
        }
    }
}
