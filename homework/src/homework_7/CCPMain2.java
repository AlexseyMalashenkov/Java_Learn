package homework_7;

import java.util.*;

public class CCPMain2 {
    public static void main(String[] args) {

        PersonComparatorPersons comparatorPersons = new PersonComparatorPersons();

        List<Person> personLinkedList = new LinkedList<>();
        List<Person> personArrayList = new ArrayList<>();
        Set<Person> personHashSet = new HashSet<>();
        Set<Person> personTreeSet = new TreeSet(comparatorPersons);

        WorkWithCollections collections = new WorkWithCollections();

        collections.addElements(personLinkedList);
        collections.addElements(personArrayList);
        collections.addElements(personHashSet);
        collections.addElements(personTreeSet);

        System.out.println(personLinkedList.size());
        System.out.println(personArrayList.size());
        System.out.println(personHashSet.size());
        System.out.println(personTreeSet.size());
    }
}
