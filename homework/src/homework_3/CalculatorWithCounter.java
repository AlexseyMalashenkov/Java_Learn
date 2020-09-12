package homework_3;

public class CalculatorWithCounter {
    private int countOperation;
    private CalculatorTypes calculatorTypes;
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    CalculatorWithCounter(CalculatorWithOperator calculatorWithOperator) {
        countOperation = 0;
        this.calculatorWithOperator = calculatorWithOperator;
        calculatorTypes = CalculatorTypes.OPERATOR;
    }

    CalculatorWithCounter(CalculatorWithMathCopy calculatorWithMathCopy) {
        countOperation = 0;
        this.calculatorWithMathCopy = calculatorWithMathCopy;
        calculatorTypes = CalculatorTypes.COPY;
    }

    CalculatorWithCounter(CalculatorWithMathExtends calculatorWithMathExtends) {
        countOperation = 0;
        this.calculatorWithMathExtends = calculatorWithMathExtends;
        calculatorTypes = CalculatorTypes.EXTENDS;
    }

    public double addNum(double firstNum, double secondNum) {
        countOperation++;
        switch (calculatorTypes) {
            case OPERATOR:
                return calculatorWithOperator.addNum(firstNum, secondNum);
            case COPY:
                return calculatorWithMathCopy.addNum(firstNum, secondNum);
            case EXTENDS:
                return calculatorWithMathExtends.addNum(firstNum, secondNum);
            default:
                System.out.println("Не верный тип");
                return 0;
        }
    }

    public double subNum(double firstNum, double secondNum) {
        countOperation++;
        switch (calculatorTypes) {
            case OPERATOR:
                return calculatorWithOperator.subNum(firstNum, secondNum);
            case COPY:
                return calculatorWithMathCopy.subNum(firstNum, secondNum);
            case EXTENDS:
                return calculatorWithMathExtends.subNum(firstNum, secondNum);
            default:
                System.out.println("Не верный тип");
                return 0;
        }
    }

    public double multiNum(double firstNum, double secondNum) {
        countOperation++;
        switch (calculatorTypes) {
            case OPERATOR:
                return calculatorWithOperator.multiNum(firstNum, secondNum);
            case COPY:
                return calculatorWithMathCopy.multiNum(firstNum, secondNum);
            case EXTENDS:
                return calculatorWithMathExtends.multiNum(firstNum, secondNum);
            default:
                System.out.println("Не верный тип");
                return 0;
        }
    }

    public double divNum(double firstNum, double secondNum) {
        countOperation++;
        switch (calculatorTypes) {
            case OPERATOR:
                return calculatorWithOperator.divNum(firstNum, secondNum);
            case COPY:
                return calculatorWithMathCopy.divNum(firstNum, secondNum);
            case EXTENDS:
                return calculatorWithMathExtends.divNum(firstNum, secondNum);
            default:
                System.out.println("Не верный тип");
                return 0;
        }
    }

    public double expNum(double num, int exp) {
        countOperation++;
        switch (calculatorTypes) {
            case OPERATOR:
                return calculatorWithOperator.expNum(num, exp);
            case COPY:
                return calculatorWithMathCopy.expNum(num, exp);
            case EXTENDS:
                return calculatorWithMathExtends.expNum(num, exp);
            default:
                System.out.println("Не верный тип");
                return 0;
        }
    }

    public double absNum(double num) {
        countOperation++;
        switch (calculatorTypes) {
            case OPERATOR:
                return calculatorWithOperator.absNum(num);
            case COPY:
                return calculatorWithMathCopy.absNum(num);
            case EXTENDS:
                return calculatorWithMathExtends.absNum(num);
            default:
                System.out.println("Не верный тип");
                return 0;
        }
    }

    public double sqrtNum(double num) {
        countOperation++;
        switch (calculatorTypes) {
            case OPERATOR:
                return calculatorWithOperator.sqrtNum(num);
            case COPY:
                return calculatorWithMathCopy.sqrtNum(num);
            case EXTENDS:
                return calculatorWithMathExtends.sqrtNum(num);
            default:
                System.out.println("Не верный тип");
                return 0;
        }
    }

    public int getCountOperation() {
        return countOperation;
    }
}