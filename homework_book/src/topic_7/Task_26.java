package topic_7;

import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку.");

        String str = scanner.nextLine();
        System.out.println("Вы ввели - " + str);

        System.out.println("Количество знаков препинания в строке = " + punctuationMark(str));
    }

    public static int punctuationMark(String str) {
        int result = 0;

        if (str.length() != 0) {
            // . ? ! ; , - " '
            for (int i = 0; i < str.length(); i++) {
                char tmp = str.charAt(i);

                switch (tmp) {
                    case '.':
                    case ';':
                    case '!':
                    case '?':
                    case ',':
                    case '-':
                    case '"':
                    case '\'':
                        result++;
                        break;
                }

            }
            return result;
        } else {
            return 0;
        }
    }
}
