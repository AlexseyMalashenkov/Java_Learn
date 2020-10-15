package io;

import generic.dto.BoxObject;

import java.io.*;
import java.util.Date;

public class IOMain5 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("classwork/src/io/data.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            int i = ois.readInt();
            String today = (String) ois.readObject();
            Date date = (Date) ois.readObject();

            BoxObject boxObject = (BoxObject) ois.readObject();

            System.out.println(i);
            System.out.println(today);
            System.out.println(date);
            System.out.println(boxObject);
            System.out.println(boxObject.getItem());

            ois.close();
        } catch(FileNotFoundException e) {
            System.out.println("Что-то не так " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то не так " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Что-то не так " + e.getMessage());
        }
    }
}
