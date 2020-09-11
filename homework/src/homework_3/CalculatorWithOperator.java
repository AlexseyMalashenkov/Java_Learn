package homework_3;

public class CalculatorWithOperator {

    public int addNum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public double addNum(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public int subNum(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public double subNum(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public int multiNum(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public double multiNum(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public int divNum(int firstNum, int secondNum) {
        return firstNum / secondNum;
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

    public int absNum(int num) {
        if (num >= 0) {
            return num;
        } else {
            return num + (-num * 2);
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

    public double sqrtNum(int num) {
        double tmp;
        double sqrtRoot = num / 2;
        do {
            tmp = sqrtRoot;
            sqrtRoot = (tmp + (num / tmp)) / 2;
        } while ((tmp - sqrtRoot) != 0);
        return sqrtRoot;
    }

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