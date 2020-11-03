package homework_9.utils.console;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Interactive {
    public void interactiveWithPeople() {
        System.out.println("Введите путь к файлу из которого будем десериализовать данные");
        Scanner scanner = new Scanner(System.in);
        String path = "";


        try {
            path = scanner.nextLine();
        } catch (NoSuchElementException | IllegalStateException e) {
            System.err.println(e.getMessage());
        }

        File file = new File(path);
        if(!file.exists() && file.isDirectory()) {
            
        }
    }
}
