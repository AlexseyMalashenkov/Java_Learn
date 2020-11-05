package homework_9;


import homework_9.chief_class.Student;
import homework_9.comparators.ComparatorMarkAndName;
import homework_9.utils.files.ReadFromFiles;
import homework_9.utils.files.WriteToFiles;
import homework_9.utils.generator.Generator;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStudentsMain {
    public static final String DEFAULT_PATH = "homework/src/homework_9/out/students.bin";
    public static final String PATH_TXT = "homework/src/homework_9/out/students.txt";
    public static final String DEFAULT_PATH_TOP = "homework/src/homework_9/out/topStudents.bin";

    public static void main(String[] args) {
        List<Student> students = logicTask2();
        logicTask3(students, 10);
    }

    private static List<Student> logicTask2() {
        System.out.println("Введите путь для чтения файла. Если путь будет не корректный или пустой - будет использоваться путь по умолчанию.");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        List<Student> studentList = null;

        if(file.exists() && !file.isDirectory()) {
            ReadFromFiles readFromFiles = new ReadFromFiles();

            studentList = readFromFiles.read(file);

            try {
                for (Student student : studentList) {
                    System.out.println(student.getFullName() + " " + student.getMark());
                }
            } catch (Exception e) {
                System.out.println("Файл пустой " + e.getMessage());
            }

        } else {
            WriteToFiles writeToFiles = new WriteToFiles();

            studentList = Stream.generate(Generator::generateStudent)
                                                .limit(10_000)
                                                .collect(Collectors.toList());

            writeToFiles.writeToTxt(PATH_TXT, studentList);
            writeToFiles.writeToBin(DEFAULT_PATH, studentList);
        }

        return studentList;
    }

    private static void logicTask3(List<Student> students, int studentCount) {
        ComparatorMarkAndName comparatorMarkAndName = new ComparatorMarkAndName();
        List<Student> topStudent = null;

        System.out.println("\n*\n*\t\t\t\t\tВывод " + studentCount + " лучших студентов\n*\n");

        try {
            topStudent = students.stream().sorted(comparatorMarkAndName)
                                                .limit(studentCount)
                                                .collect(Collectors.toList());

            for (Student student : topStudent) {
                System.out.println(student.getFullName() + " " + student.getMark());
            }

            WriteToFiles writeToFiles = new WriteToFiles();
            writeToFiles.writeToBin(DEFAULT_PATH_TOP, topStudent);
        } catch (Exception e) {
            System.out.println("Файл пустой " + e.getMessage());
        }
    }
}