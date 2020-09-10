package topic_7;

import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String str = scanner.nextLine();
        System.out.println("Вы ввели - " + str);

        outLastChar(str);
    }

    public static void outLastChar(String str) {
        if (str.length() != 0) {
            String[] tmp = str.split(" ");

            for (String s : tmp) {
                if (!s.equals("")) {
                    char c = s.toLowerCase().charAt(s.length() - 1);
                    System.out.print(c + " ");
                }
            }
        } else {
            System.out.println("Вы ввели не коректную строку");
        }
    }
}
