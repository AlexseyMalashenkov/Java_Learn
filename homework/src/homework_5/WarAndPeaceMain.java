package homework_5;

import java.util.*;

public class WarAndPeaceMain {
    public static void main(String[] args) {
        WorkWithTxtFile workWithTxtFile = new WorkWithTxtFile();
        String filePath = "homework/src/homework_6/resources/Война и мир_книга.txt";

        String warAndPeace= workWithTxtFile.readAllBytesJava7(filePath);

        Set<String> unique = workWithTxtFile.findUnique(warAndPeace);

        System.out.println(unique.size());

        Map<String, Integer> map = workWithTxtFile.topWords(warAndPeace);

        workWithTxtFile.printTopTenWords(map);

        EasySearch search = new EasySearch();
        System.out.println("Слово война встречается в тексте " + search.search(warAndPeace.toLowerCase(), "война") + " раз.");
        System.out.println("Слово и встречается в тексте " + search.search(warAndPeace.toLowerCase(), "и") + " раз.");
        System.out.println("Слово мир встречается в тексте " + search.search(warAndPeace.toLowerCase(), "мир") + " раз.");

        RegExSearch exSearch = new RegExSearch();
        System.out.println("Слово война встречается в тексте " + exSearch.search(warAndPeace.toLowerCase(), "война") + " раз.");
        System.out.println("Слово и встречается в тексте " + exSearch.search(warAndPeace.toLowerCase(), "и") + " раз.");
        System.out.println("Слово мир встречается в тексте " + exSearch.search(warAndPeace.toLowerCase(), "мир") + " раз.");


        PrimitivEasySearch primitivEasySearch = new PrimitivEasySearch();
        System.out.println("Слово война встречается в тексте " + primitivEasySearch.search(warAndPeace.toLowerCase(), "война") + " раз.");
        System.out.println("Слово и встречается в тексте " + primitivEasySearch.search(warAndPeace.toLowerCase(), "и") + " раз.");
        System.out.println("Слово мир встречается в тексте " + primitivEasySearch.search(warAndPeace.toLowerCase(), "мир") + " раз.");
    }
}