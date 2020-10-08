package homework_5;

import java.io.*;
import java.nio.file.Files;
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

    public Set<String> findUnique(String str) {
        String[] strings = strToArray(str);

        return new HashSet<>(Arrays.asList(strings));
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

    public void printTopTenWords(Map<String, Integer> map, int count) {
        TopWordComparator comparator = new TopWordComparator(map);
        TreeMap<String, Integer> sorted_map = new TreeMap<>(comparator);

        sorted_map.putAll(map);

        if (count <= sorted_map.size()) {
            int i = 0;
            for(Map.Entry<String, Integer> item : sorted_map.entrySet()){
                if (i <= count) {
                    System.out.printf("Слово: %s \t Количество: %d \n", item.getKey(), item.getValue());
                }
                i++;
            }
        } else {
            System.out.println("Вы ввели не правильное количество слов");
        }


    }
}