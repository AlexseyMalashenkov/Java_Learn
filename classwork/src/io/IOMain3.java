package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOMain3 {
    public static void main(String[] args) /* throws IOException */ {
        String path = "classwork/src/io/file.txt";
        File file = new File(path);

        System.out.println(file.exists());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){

            long start = System.currentTimeMillis();
            for (int i = 0; i < 10_000; i++) {
                writer.write("2");
                //writer.flush();
//                if (i == 9999) {
//                    throw new IllegalArgumentException("У нас все очень плохо.");
//                }
            }

            long finish = System.currentTimeMillis();
            System.out.println(finish - start);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}