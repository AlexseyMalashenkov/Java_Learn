package homework_6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public Set<String> findDups(String str) {
        Set<String> uniques = new HashSet();
        Set<String> dups = new HashSet();

        String[] strings = strToArray(str);

        for (String s : strings) {
            if (!uniques.add(s)) {
                dups.add(s);
            }
        }

        uniques.removeAll(dups);

        return uniques;
    }

    private String[] strToArray(String str) {
        str = str.replaceAll("[^a-zA-Zа-яА-Я]", " ");
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
