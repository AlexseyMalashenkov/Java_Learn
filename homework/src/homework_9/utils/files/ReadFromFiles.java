package homework_9.utils.files;

import homework_9.chief_class.Student;

import java.io.*;
import java.util.List;

public class ReadFromFiles {
    public List<Student> readFromBin(File file) {
        List<Student> studentList = null;

        try {
            FileInputStream fileIn = new FileInputStream(file);

            ObjectInputStream in = new ObjectInputStream(fileIn);

            try {
                studentList = (List<Student>) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch(FileNotFoundException e) {
            System.out.println("Что-то не так " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то не так " + e.getMessage());
        }

        return studentList;
    }

    public List<Student> read(File file) {
        List<Student> studentList = null;

        ObjectInputStream objIn = null;
        try {
            FileInputStream fileIn = new FileInputStream(file);
            if (fileIn == null) {
                throw new IOException("Файл не найден");
            }
            objIn= new ObjectInputStream(fileIn);

            //while (true) {
                studentList = (List<Student>) objIn.readObject();
            //}
        } catch(FileNotFoundException e) {
            System.out.println("Файл не найден" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то не так " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objIn != null) {
                    objIn.close();
                }
            } catch (IOException closeException) {
                closeException.printStackTrace();
            }
        }

        return studentList;
    }
}
