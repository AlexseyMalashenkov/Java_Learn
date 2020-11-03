package homework_9.comparators;

import homework_9.chief_class.Student;

import java.util.Comparator;

public class ComparatorByMarkAndNameFromHigh implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        ComparatorByMarkFromHigh comparatorByMarkFromHigh = new ComparatorByMarkFromHigh();

        int markComp =  comparatorByMarkFromHigh.compare(o1, o2);
        if (markComp != 0) {
            return markComp;
        } else {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
