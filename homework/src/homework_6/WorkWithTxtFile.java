package homework_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class WorkWithTxtFile {

    public String readAllBytesJava7(String filePath)
    {
        String content = "";

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }

    public Set<String> findDups(String[] str) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String s : str) {
            if (!uniques.add(s)) {
                dups.add(s);
            }
        }

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);

        return uniques;
    }
    public String[] singleWord(String str) {
        str = str.replaceAll("[^a-zA-Zа-яА-Я]", " ");
        return str.split("\\s+");
    }
}
