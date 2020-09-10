package topic_7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String str = scanner.nextLine();
        System.out.println("Вы ввели строку - " + str);

        findHexInStr(str);
    }

    public static void findHexInStr(String str) {
        Pattern pattern = Pattern.compile("0x((\\d|[abcdefABCDEF])+)");
        //0x([\\da-fA-F]+)
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
