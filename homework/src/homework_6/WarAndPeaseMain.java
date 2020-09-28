package homework_6;

import java.util.Set;

public class WarAndPeaseMain {
    public static void main(String[] args) {
        WorkWithTxtFile workWithTxtFile = new WorkWithTxtFile();
        String filePath = "homework/src/homework_6/resources/Война и мир_книга.txt";
        String warAndPease= workWithTxtFile.readAllBytesJava7(filePath);

        String[] strToArray = workWithTxtFile.singleWord(warAndPease);

        Set<String> uniq = workWithTxtFile.findDups(strToArray);

        for (String s : uniq) {
            System.out.println(s);
        }
        System.out.println(uniq.size());
    }
}