package homework_9.comparators;

import homework_9.chief_class.Student;

import java.util.Comparator;

public class ComparatorMarkAndName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        ComparatorByMark comparatorByMark = new ComparatorByMark();

        int ageCompare =  comparatorByMark.compare(o1.getMark(), o2.getMark());
        if (ageCompare != 0) {
            return ageCompare;
        } else {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
