package homework_9.comparators;

import homework_9.chief_class.Student;

import java.util.Comparator;

public class ComparatorByMarkFromHigh implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getMark() - o1.getMark();
    }
}
