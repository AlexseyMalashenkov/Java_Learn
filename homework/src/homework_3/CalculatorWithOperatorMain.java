package homework_3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();

        double result = calc.addNum(calc.addNum(4.1, calc.multiNum(15, 7)), calc.expNum(calc.divNum(28, 5), 2));
        System.out.printf("4.1 + 15 * 7 + (28 / 5)^ 2 = " + "%.2f", result);
        System.out.println();
        System.out.println(calc.divNum(result, 0));    // В обоих случаях у меня деление на 0 даёт бесконечность т.к. метод принимает double.
        System.out.println(calc.divNum(result, 0.0d)); //Если был бы int - выдало бы исключение.
    }
}
