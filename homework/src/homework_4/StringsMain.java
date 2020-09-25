package homework_4;

import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от -999_999_999 до 999_999_999");
        if (scanner.hasNextInt()) {
            int numInt = scanner.nextInt();

            NumToString intToString = new NumToString(numInt);
            System.out.println(intToString.intToStr());
        } else {
            System.out.println("Вы ввели не целочисленное число! Пример: 123456789");
        }

        System.out.println("Введите число от -999_999_999,999 до 999_999_999,999");
        if (scanner.hasNextDouble()) {
            double numDouble = scanner.nextDouble();

            NumToString doubleToString = new NumToString(numDouble);
            System.out.println(doubleToString.doubleToStr());
        } else {
            System.out.println("Вы ввели не целочисленное число! Пример: 123456789,348");
        }
    }
}