package homework_3;

public class CalculatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator calcWithOperator = new CalculatorWithOperator();

        double resultWithOperator = calcWithOperator.addNum(calcWithOperator.addNum(4.1, calcWithOperator.multiNum(15, 7)), calcWithOperator.expNum(calcWithOperator.divNum(28, 5), 2));
        System.out.printf("Задание №2) 4.1 + 15 * 7 + (28 / 5)^ 2 = " + "%.2f", resultWithOperator);
        System.out.println();
        System.out.println(calcWithOperator.divNum(resultWithOperator, 0));    // В обоих случаях у меня деление на 0 даёт бесконечность т.к. метод принимает double.
        System.out.println(calcWithOperator.divNum(resultWithOperator, 0.0d));//Если был бы int - выдало бы исключение.

        CalculatorWithMathCopy calcWithMathCopy = new CalculatorWithMathCopy();

        double resultWithMathCopy = calcWithMathCopy.addNum(calcWithMathCopy.addNum(4.1, calcWithMathCopy.multiNum(15, 7)), calcWithMathCopy.expNum(calcWithMathCopy.divNum(28, 5), 2));
        System.out.printf("Задание №5) 4.1 + 15 * 7 + (28 / 5)^ 2 = " + "%.2f", resultWithMathCopy);
        System.out.println();
        System.out.println(calcWithMathCopy.divNum(resultWithMathCopy, 0));    // В обоих случаях у меня деление на 0 даёт бесконечность т.к. метод принимает double.
        System.out.println(calcWithMathCopy.divNum(resultWithMathCopy, 0.0d));//Если был бы int - выдало бы исключение.

        CalculatorWithMathExtends calcWithMathExtends = new CalculatorWithMathExtends();

        double resultWithMathExtends = calcWithMathExtends.addNum(calcWithMathExtends.addNum(4.1, calcWithMathExtends.multiNum(15, 7)), calcWithMathExtends.expNum(calcWithMathExtends.divNum(28, 5), 2));
        System.out.printf("Задание №7) 4.1 + 15 * 7 + (28 / 5)^ 2 = " + "%.2f", resultWithMathExtends);
        System.out.println();
        System.out.println(calcWithMathExtends.divNum(resultWithMathExtends, 0));    // В обоих случаях у меня деление на 0 даёт бесконечность т.к. метод принимает double.
        System.out.println(calcWithMathExtends.divNum(resultWithMathExtends, 0.0d));//Если был бы int - выдало бы исключение.

        CalculatorWithCounter calculatorWithCounter = new CalculatorWithCounter(calcWithOperator);

        double resultWithCounter = calculatorWithCounter.addNum(calculatorWithCounter.addNum(4.1, calculatorWithCounter.multiNum(15, 7)), calculatorWithCounter.expNum(calculatorWithCounter.divNum(28, 5), 2));
        System.out.printf("Задание №7) 4.1 + 15 * 7 + (28 / 5)^ 2 = " + "%.2f", resultWithCounter);
        System.out.println();
        System.out.println(calculatorWithCounter.divNum(resultWithCounter, 0));    // В обоих случаях у меня деление на 0 даёт бесконечность т.к. метод принимает double.
        System.out.println(calculatorWithCounter.divNum(resultWithCounter, 0.0d));//Если был бы int - выдало бы исключение.
    }
}
