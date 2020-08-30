package homework_1;
import java.util.Scanner;

public class Task_5_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        outSwitch(name);
    }

    public static void outSwitch(String name) {
        switch (name) {
            case "Вася":
                System.out.println("Привет!" + "\n" + "Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
