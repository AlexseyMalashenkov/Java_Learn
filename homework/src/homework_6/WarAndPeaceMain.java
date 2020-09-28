package homework_6;

import java.util.Map;
import java.util.Set;

public class WarAndPeaceMain {
    public static void main(String[] args) {
        WorkWithTxtFile workWithTxtFile = new WorkWithTxtFile();
        String filePath = "homework/src/homework_6/resources/Война и мир_книга.txt";

        String warAndPeace= workWithTxtFile.readAllBytesJava7(filePath);

        Set<String> uniq = workWithTxtFile.findDups(warAndPeace);

        System.out.println(uniq.size());

        Map<String, Integer> result = workWithTxtFile.topTenWords(warAndPeace);

        for(Map.Entry<String, Integer> item : result.entrySet()){

            System.out.printf("Key: %s  Value: %d \n", item.getKey(), item.getValue());
        }
    }
}