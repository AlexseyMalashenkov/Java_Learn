package homework_8.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class WorkWithFiles {
    public void saveRateToFile(String filePath, List<Double> rates) {
        pathToFile();
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filePath)))) {

            for (Double rate : rates) {
                writer.write(String.valueOf(rate));
                writer.write(" ");
                writer.write("\r\n");
            }

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File pathToFile() {
        System.out.println("Введите корректный путь для сохранения файла с именем файла");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.next();

        if(new File(filePath).exists()) {
            System.out.println("тут");
            return new File(filePath);
        } else {
            System.err.println("Error: " + filePath + " does not exist.");
            return new File("homework/src/homework_8/out/Rates.txt");
        }
    }
}
