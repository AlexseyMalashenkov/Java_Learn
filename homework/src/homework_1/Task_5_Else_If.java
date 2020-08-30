package homework_1;
import java.util.Scanner;

public class Task_5_Else_If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        outIfElse(name);
    }

    public static void outIfElse(String name) {
        if(name.equals("Вася")) {
            System.out.println("Привет!" + "\n" + "Я тебя так долго ждал");
        } else if(name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
