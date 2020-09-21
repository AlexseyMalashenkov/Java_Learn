package homework_4;

import java.util.Scanner;

public class Tasks_1_2_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от -999_999_999_999 до 999_999_999_999");
        Long num = scanner.nextLong();

        numToStr(num);
    }

    public static void numToStr(Long num) {
        System.out.println(num);
    }
}
