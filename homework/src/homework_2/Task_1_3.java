package homework_2;

import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {
        double result = 1.;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для возведения в степень");

        try {
            double number = scanner.nextDouble();
            System.out.println("Введите степень");
            int exponentiation = scanner.nextInt();

            if (exponentiation > 0) {
                for (int i = 1; i <= exponentiation; i++) {
                    result *= number;
                }
                System.out.println(result);
            } else {
                System.out.println("Вы ввели не правильное число для степени");
            }
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
