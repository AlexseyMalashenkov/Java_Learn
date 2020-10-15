package io;

import generic.dto.BoxObject;
import oop.SomeComparator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class IOMain4 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("classwork/src/io/data.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeInt(12345);
            oos.writeObject("Today");
            oos.writeObject(new Date());

            BoxObject boxObject = new BoxObject();
            boxObject.setItem(new SomeComparator());

            oos.writeObject(boxObject);
        } catch(FileNotFoundException e) {
            System.out.println("Что-то не так " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то не так " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
