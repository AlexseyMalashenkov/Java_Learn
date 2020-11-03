package homework_9;


import homework_9.chief_class.Student;
import homework_9.comparators.ComparatorMarkAndName;
import homework_9.utils.files.ReadFromFiles;
import homework_9.utils.files.WriteToFiles;
import homework_9.utils.generator.Generator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ComparatorMarkAndName comparatorMarkAndName = new ComparatorMarkAndName();
        WriteToFiles writeToFiles = new WriteToFiles();

        List<Student> studentList = Stream
                .generate(Generator::generateStudent)
                .limit(10_000)
                .sorted(comparatorMarkAndName)
                .collect(Collectors.toList());

        writeToFiles.writeToTxt("", "out.txt", studentList);
        writeToFiles.writeToBin("", "out.bin", studentList);

        ReadFromFiles readFromFiles = new ReadFromFiles();

        System.out.println(readFromFiles.readFromBin("homework/src/homework_9/out/", "out.bin"));

    }
}
