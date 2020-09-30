package homework_6;

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

    public Set<String> findUniq(String str) {
        String[] strings = strToArray(str);
        Set<String> mySet = new HashSet<>(Arrays.asList(strings));

        return mySet;
    }

    private String[] strToArray(String str) {
        str = str.replaceAll("[^а-яА-Я]", " ");
        return str.split("\\s+");
    }

    public Map<String, Integer> topTenWords(String str) {
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
}
