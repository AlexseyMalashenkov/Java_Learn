package enums;

import java.util.Scanner;

public class EnumMain4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayName = scanner.nextLine();
        Day day = Day.valueOf(dayName);
        System.out.println("Русское название " + day.getRusName());
        System.out.println("Рабочий день? - " + day.isWorkDay());
        System.out.println("Наименование элемента " + day.name());
    }
}
