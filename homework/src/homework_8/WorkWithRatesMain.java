package homework_8;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class WorkWithRatesMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startLogic();
    }

    private static void startLogic() {
        System.out.println("Введите курсы какого банка вам необходимы:" + "\n" + "\n" +
                "Альфа-банк (Беларусь) - введите 1" + "\n" +
                "Белагропромбанк - введите 2" + "\n" +
                "БПС-Сбербанк - введите 3" + "\n" +
                "Беларусбанк - введите 4" + "\n" +
                "Национальный банк Республики Беларусь - введите 0" + "\n");

        try {
            int chooseBank = scanner.nextInt();

            switch (chooseBank) {
                case 1:
                    System.out.println("Вы выбрали Альфа-банк (Беларусь)");
                    break;
                case 2:
                    System.out.println("Вы выбрали Белагропромбанк");
                    break;
                case 3:
                    System.out.println("Вы выбрали БПС-Сбербанк");
                    break;
                case 4:
                    System.out.println("Вы выбрали Беларусбанк");
                    break;
                case 0:
                    System.out.println("Вы выбрали Национальный банк Республики Беларусь");
                    break;
                default:
                    System.out.println("Вы ввели не правильное число. Попробуйте ещё раз...");
                    startLogic();
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println(e.toString() + " Всё очень плохо!");
        }
    }

    private static void needSafeToFile() {
        System.out.println("Нужно ли сохранять курсы в файл?" + "\n" +
                "Да - введите 1" + "\n" + "Нет - введите 2 \n");

        try {
            int saveInFile = scanner.nextInt();

            switch (saveInFile) {
                case 1:
                    System.out.println("Вы выбрали сохранить в файл");
                    break;
                case 2:
                    System.out.println("Вы выбрали не сохранять в файл");
                    break;
                default:
                    System.out.println("Вы ввели не правильное число. Попробуйте ещё раз...");
                    needSafeToFile();
            }
        } catch (IllegalStateException | NoSuchElementException e) {
            System.out.println(e.toString() + " Всё очень плохо!");
        }
    }
}