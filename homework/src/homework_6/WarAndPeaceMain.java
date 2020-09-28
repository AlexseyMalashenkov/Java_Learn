package homework_6;

import java.io.IOException;
import java.util.Set;

public class WarAndPeaceMain {
    public static void main(String[] args) throws Exception {
        WorkWithTxtFile workWithTxtFile = new WorkWithTxtFile();
        String filePath = "homework/src/homework_6/resources/Война и мир_книга.txt";

        String warAndPeace= workWithTxtFile.readAllBytesJava7(filePath);

        String[] strToArray = workWithTxtFile.singleWord(warAndPeace);

        Set<String> uniq = workWithTxtFile.findDups(strToArray);

        for (String s : uniq) {
            System.out.println(s);
        }
        System.out.println(uniq.size());

        String filePath3 = "homework/src/homework_6/resources/Война и мир_книга_2.txt";
        workWithTxtFile.save(uniq, filePath3);
    }
}