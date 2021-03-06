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

        CalculatorWithConterDecorator calculator = new CalculatorWithConterDecorator(calcWithMathExtends);

        double resultWithConterDecorator = calculator.addNum(calculator.addNum(4.1, calculator.multiNum(15, 7)), calculator.expNum(calculator.divNum(28, 5), 2));
        System.out.printf("Задание №9) 4.1 + 15 * 7 + (28 / 5)^ 2 = " + "%.2f", resultWithConterDecorator);
        System.out.println();
        System.out.println(calculator.divNum(resultWithConterDecorator, 0));    // В обоих случаях у меня деление на 0 даёт бесконечность т.к. метод принимает double.
        System.out.println(calculator.divNum(resultWithConterDecorator, 0.0d));//Если был бы int - выдало бы исключение.

//        CalcWithMemoryDecorator cWiMeDe = new CalcWithMemoryDecorator(calcWithMathExtends);
//        double result = cWiMeDe.loadFromMemory();
//        System.out.printf("Загрузка памяти - " + "%.2f", result);
//        System.out.println();
//        cWiMeDe.saveToMemory(cWiMeDe.divNum(28, 5));
//        result = cWiMeDe.loadFromMemory();
//        System.out.printf("Загрузка памяти - " + "%.2f", result);
//        System.out.println();
//        cWiMeDe.saveToMemory(cWiMeDe.expNum(result, 2));
//        result = cWiMeDe.loadFromMemory();
//        System.out.printf("Загрузка памяти - " + "%.2f", result);
//        System.out.println();
//        cWiMeDe.saveToMemory(cWiMeDe.addNum(cWiMeDe.multiNum(15, 7), result));
//        result = cWiMeDe.loadFromMemory();
//        System.out.printf("Загрузка памяти - " + "%.2f", result);
//        System.out.println();
//        cWiMeDe.saveToMemory(cWiMeDe.addNum(4.1, result));
//        result = cWiMeDe.loadFromMemory();
//        System.out.printf("Загрузка памяти - " + "%.2f", result);
//        System.out.println();

        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(calcWithMathExtends);

        calculatorWithMemory.divNum(28, 5);
        calculatorWithMemory.expNum(calculatorWithMemory.getMemoryShort(), 2);
        calculatorWithMemory.setMemoryLong();
        calculatorWithMemory.multiNum(15, 7);
        calculatorWithMemory.addNum(4.1, calculatorWithMemory.getMemoryShort());

        System.out.printf("Задание №11) 4.1 + 15 * 7 + (28 / 5)^ 2 = " + "%.2f", calculatorWithMemory.addNum(calculatorWithMemory.getMemoryShort(), calculatorWithMemory.getMemoryLongAndErase()));
        System.out.println();
        System.out.println("Количество операций = " + calculatorWithMemory.getCounter());
        System.out.println(calculatorWithMemory.divNum(resultWithConterDecorator, 0));    // В обоих случаях у меня деление на 0 даёт бесконечность т.к. метод принимает double.
        System.out.println(calculatorWithMemory.divNum(resultWithConterDecorator, 0.0d));//Если был бы int - выдало бы исключение.
    }
}
