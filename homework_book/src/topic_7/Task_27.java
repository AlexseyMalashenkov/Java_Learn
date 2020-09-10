package topic_7;

import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String str = scanner.nextLine();
        System.out.println("Вы ввели - " + str);

        System.out.println("Количество слов в строке - " + space(str));
    }

    public static int space(String str) {
        int result = 0;

        if (str.length() != 0) {
            String[] tmp = str.split(" ");

            for (String s : tmp) {
                if (!s.equals("")) {
                    result++;
                }
            }

            return result;
        } else {
            return 0;
        }
    }
}
