package homework_4;

import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от -999_999_999 до 999_999_999");
        int num = scanner.nextInt();

        NumToString numInt = new NumToString(num);
        System.out.println(numInt.intToStr());

        //int[] array = new int[1000];
        //for (int i = 0; i < array.length; i++) {
        //    array[i] = (int) Math.round((Math.random() * 2_000_000_000) - 1_000_000_000);
        //    NumToString numInt = new NumToString(array[i]);
        //    System.out.println(array[i] + " \t" + numInt.intToStr());
        //}
    }
}