package homework_4;

import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от -999_999_999 до 999_999_999");
        int num = scanner.nextInt();

        NumsToString numsInt = new NumsToString(num);
        numsInt.numToStr();
    }
}