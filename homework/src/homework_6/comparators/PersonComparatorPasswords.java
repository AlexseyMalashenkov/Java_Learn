package homework_6.comparators;

import java.util.Comparator;

public class PersonComparatorPasswords implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
