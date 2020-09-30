package homework_6;

import java.io.IOException;
import java.util.*;

public class WarAndPeaceMain {
    public static void main(String[] args) throws IOException {
        WorkWithTxtFile workWithTxtFile = new WorkWithTxtFile();
        String filePath = "homework/src/homework_6/resources/Война и мир_книга.txt";

        String warAndPeace= workWithTxtFile.readAllBytesJava7(filePath);

        Set<String> unique = workWithTxtFile.findUnique(warAndPeace);

        System.out.println(unique.size());

        Map<String, Integer> map = workWithTxtFile.topWords(warAndPeace);

        workWithTxtFile.printTopTenWords(map);
    }
}