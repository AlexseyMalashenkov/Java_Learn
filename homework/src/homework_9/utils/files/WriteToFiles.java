package homework_9.utils.files;

import homework_9.chief_class.Student;

import java.io.*;
import java.util.List;

public class WriteToFiles {
    public void writeToTxt(String filePath, String fileName, List<Student> studentList) {
        File file = new File(checkPath(filePath) + fileName);

        try {
            FileWriter writer = new FileWriter(file);

            for(Student student: studentList) {
                writer.write(student + System.lineSeparator());
            }

            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeToBin(String filePath, String fileName, List<Student> studentList) {
        try (FileOutputStream fos = new FileOutputStream(checkPath(filePath) + fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(studentList);
        } catch(FileNotFoundException e) {
            System.out.println("Что-то не так " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то не так " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private String checkPath(String filePath) {
        String  saveToFolder = filePath;
        String defaultFolder = "homework/src/homework_9/out/";

        try {
            File file = new File(saveToFolder);

            if (!file.exists() && !file.isDirectory()) {
                saveToFolder = defaultFolder;
            }
        } catch(Exception e) {
            saveToFolder = defaultFolder;
        }

        return saveToFolder;
    }
}
