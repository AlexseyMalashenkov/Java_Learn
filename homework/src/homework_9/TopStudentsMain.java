package homework_9;

import homework_9.chief_class.Student;
import homework_9.utils.files.ReadFromFiles;

import java.io.File;
import java.util.List;

import static homework_9.StreamStudentsMain.DEFAULT_PATH_TOP;

public class TopStudentsMain {
    public static void main(String[] args) {
        loadTopStudents(10);
    }

    private static void loadTopStudents(int count) {
        ReadFromFiles readFromFiles = new ReadFromFiles();
        List<Student> studentList = null;

        studentList = readFromFiles.read(new File(DEFAULT_PATH_TOP));

        try {
            if (studentList.size() >= count) {
                for (int i = 0; i < count; i++) {
                    System.out.println(i + ") " + studentList.get(i).getFullName() + " " + studentList.get(i).getMark());
                }
            } else {
                System.out.println("Не правильный размер");
            }
        } catch (Exception e) {
            System.out.println("Файл пустой " + e.getMessage());
        }


    }
}
