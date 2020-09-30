package homework_6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WorkWithTxtFile {

    public String readAllBytesJava7(String filePath)
    {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    public Set<String> findUnique(String str) throws IOException {
        String[] strings = strToArray(str);
        Path pathForSaveSet = Paths.get("homework/src/homework_6/resources/Война и мир_книга_set_out.txt");
        Set<String> mySet = new HashSet<>(Arrays.asList(strings));

        Files.write(pathForSaveSet, mySet);

        return mySet;
    }

    private String[] strToArray(String str) {
        str = str.replaceAll("[^а-яА-Я]", " ");
        return str.split("\\s+");
    }

    public Map<String, Integer> topWords(String str) {
        Map<String, Integer> result = new HashMap<>();
        String[] strings = strToArray(str);

        for (int i = 0; i < strings.length; i++) {
            Integer val = result.get(strings[i]);
            if (val != null) {
                result.put(strings[i], val + 1);
            } else {
                result.put(strings[i], 1);
            }
        }

        return result;
    }

    public void printTopTenWords(Map<String, Integer> map) {
        TopWordComparator comparator = new TopWordComparator(map);
        TreeMap<String, Integer> sorted_map = new TreeMap<>(comparator);

        sorted_map.putAll(map);


        int i = 0;
        for(Map.Entry<String, Integer> item : sorted_map.entrySet()){
            if (i <= 10) {
                System.out.printf("Key: %s  Value: %d \n", item.getKey(), item.getValue());

            }
            i++;
        }
    }
}
