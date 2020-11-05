package homework_9.utils.files;

import homework_9.chief_class.Student;

import java.io.*;
import java.util.List;

public class WriteToFiles {
    public void writeToTxt(String filePath, List<Student> studentList) {
        File file = new File(filePath);

        try {
            FileWriter writer = new FileWriter(file);

            for(Student student: studentList) {
                writer.write("{" + student.getFirstName() + ","
                                    + student.getSecondName() + ","
                                    + student.getMiddleName() + ","
                                    + student.getMark() + "}"
                                    + "\n");

            }

            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeToBin(String filePath, List<Student> studentList) {
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(studentList);
        } catch(FileNotFoundException e) {
            System.out.println("Что-то не так " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Что-то не так " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
