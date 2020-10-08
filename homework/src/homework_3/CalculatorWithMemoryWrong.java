package homework_3;

public class CalculatorWithMemoryWrong extends CalculatorWithOperator {
    private double calculatorMemory;
    private boolean isKey = false; //ключ для проверки записано ли что-то в память

    CalculatorWithMemoryWrong() {
        calculatorMemory = 0.0;
    }

    public void setCalculatorMemory(double calculatorMemory) {
        if (isKey == false) {
            this.calculatorMemory = calculatorMemory;
            isKey = true;
        } else {
            System.out.println("В памяти записано число - " + this.calculatorMemory + " оно будет перезаписанно.");
            this.calculatorMemory = calculatorMemory;
        }
    }

    public double getCalculatorMemory() {
        double tmp = this.calculatorMemory;
        if (isKey == false) {
            System.out.println("Память калькулятора - пуста.");
            return 0;
        } else {
            System.out.println("Вы получили из памяти число - " + this.calculatorMemory);
            System.out.println("Память очищенна");
            this.calculatorMemory = 0.0;
            return tmp;
        }
    }
}
