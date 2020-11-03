package homework_9.utils.files;

import homework_9.chief_class.Student;

import java.io.*;
import java.util.List;

public class ReadFromFiles {
    public List<Student> readFromBin(String filePath, String fileName) {
        List<Student> studentList = null;

        try (FileInputStream fileIn = new FileInputStream(filePath + fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            try {
                studentList = (List<Student>) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch(FileNotFoundException e) {
            System.out.println("Что-то не так " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то не так " + e.getMessage());
            throw new RuntimeException(e);
        }

        return studentList;
    }
}
