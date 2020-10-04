package homework_7;

import java.util.Comparator;

public class PersonComparatorPersons implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        PersonComparatorPasswords comparatorPasswords = new PersonComparatorPasswords();

        int nickCompare = o1.getNick().compareTo(o2.getNick());
        if (nickCompare != 0) {
            return nickCompare;
        } else {
            return comparatorPasswords.compare(o1.getPassword().length(), o2.getPassword().length());
        }
    }
}
