package homework_3;

public class CalculatorWithOperator {

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
        double result = num;

        if (num > 0) {
            for (int i = exp; i > 1; i--) {
                result *= num;
            }
            return result;
        } else {
            System.out.println("Вы ввели не положительное число");
            return 0;
        }
    }

    public double absNum(double num) {
        if (num >= 0) {
            return num;
        } else {
            return num * -1;
        }
    }

    //Метод Ньютона-Рафсона

    public double sqrtNum(double num) {
        double tmp;
        double squareRoot = num / 2;
        do {
            tmp = squareRoot;
            squareRoot = (tmp + (num / tmp)) / 2;
        } while ((tmp - squareRoot) != 0);
        return squareRoot;
    }
}