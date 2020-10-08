package homework_4_2;

import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkWithString workWithString = new WorkWithString();

        System.out.println("Введите число от -999_999_999 до 999_999_999");
        if (scanner.hasNextInt()) {
            int numInt = scanner.nextInt();

            System.out.println(workWithString.intToStr(numInt));
        } else {
            System.out.println("Вы ввели не целочисленное число! Пример: 123456789");
        }

        System.out.println("Введите число от -999_999_999,999 до 999_999_999,999");
        if (scanner.hasNextDouble()) {
            double numDouble = scanner.nextDouble();

            System.out.println(workWithString.doubleToStr(numDouble));
        } else {
            System.out.println("Вы ввели не целочисленное число! Пример: 123456789,348");
        }

        System.out.println("Введите количество дней от 0 до 999_999_999");
        if (scanner.hasNextInt()) {
            int dayInt = scanner.nextInt();

            System.out.println(workWithString.toWeek(dayInt));
        } else {
            System.out.println("Вы ввели не целочисленное число! Пример: 123456789");
        }

        System.out.println(workWithString.toHoursMinuteSecondMillisecond(3601001, false));
    }
}