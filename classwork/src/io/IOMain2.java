package io;

import java.io.*;

public class IOMain2 {
    public static void main(String[] args) /* throws IOException */ {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("classwork/src/io/file.txt"));

            long start = System.currentTimeMillis();
            for (int i = 0; i < 10_000; i++) {
                writer.write("1");
                //writer.flush();
                if (i == 9999) {
                    throw new IllegalArgumentException("У нас все очень плохо.");
                }
            }

            long finish = System.currentTimeMillis();
            System.out.println(finish - start);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Все плохо");
                }
            }
        }
    }
}