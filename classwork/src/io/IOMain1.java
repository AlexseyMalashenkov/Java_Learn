package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOMain1 {
    public static void main(String[] args) /* throws FileNotFoundException */ {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("НЕ могу открыть файл4");
        }

    }
}
