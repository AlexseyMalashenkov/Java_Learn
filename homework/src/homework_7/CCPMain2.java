package homework_7;

import collections.utils.AnyRandom;
import java.util.*;

public class CCPMain2 {
    public static void main(String[] args) {
        Random rand = new Random();

        PersonComparatorPersons comparatorPersons = new PersonComparatorPersons();

        List<Person> personLinkedList = new LinkedList<>();
        List<Person> personArrayList = new ArrayList<>();
        Set<Person> personHashSet = new HashSet<>();
        Set<Person> personTreeSet = new TreeSet(comparatorPersons);

        long startLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            personLinkedList.add(new Person(AnyRandom.nextString(AnyRandom.getRandomNumberInRange(5, 10)),
                    AnyRandom.nextString(AnyRandom.getRandomNumberInRange(5, 10))));
        }
        long finishLinkedList = System.currentTimeMillis();

        long startArrayList = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            personArrayList.add(new Person(AnyRandom.nextString(AnyRandom.getRandomNumberInRange(5, 10)),
                    AnyRandom.nextString(AnyRandom.getRandomNumberInRange(5, 10))));
        }
        long finishArrayList = System.currentTimeMillis();

        long startHashSet = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            personHashSet.add(new Person(AnyRandom.nextString(AnyRandom.getRandomNumberInRange(5, 10)),
                    AnyRandom.nextString(AnyRandom.getRandomNumberInRange(5, 10))));
        }
        long finishHashSet = System.currentTimeMillis();

        long startTreeSet = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            personTreeSet.add(new Person(AnyRandom.nextString(AnyRandom.getRandomNumberInRange(5, 10)),
                    AnyRandom.nextString(AnyRandom.getRandomNumberInRange(5, 10))));
        }
        long finishTreeSet = System.currentTimeMillis();

        System.out.println("LinkedList add time: " + (finishLinkedList - startLinkedList));
        System.out.println("ArrayList add time: " + (finishArrayList - startArrayList));
        System.out.println("HashSet add time: " + (finishHashSet - startHashSet));
        System.out.println("TreeSet add time: " + (finishTreeSet - startTreeSet));

        startLinkedList  = System.currentTimeMillis();
        personLinkedList.sort(comparatorPersons);
        finishLinkedList = System.currentTimeMillis();

        startArrayList  = System.currentTimeMillis();
        personArrayList.sort(comparatorPersons);
        finishArrayList = System.currentTimeMillis();

        startHashSet  = System.currentTimeMillis();
        personHashSet.stream().sorted(comparatorPersons);
        finishHashSet  = System.currentTimeMillis();

        startTreeSet  = System.currentTimeMillis();
        personTreeSet.stream().sorted(comparatorPersons);
        finishTreeSet  = System.currentTimeMillis();

        System.out.println("LinkedList sort time: " + (finishLinkedList - startLinkedList));
        System.out.println("ArrayList sort time: " + (finishArrayList - startArrayList));
        System.out.println("HashSet sort time: " + (finishHashSet - startHashSet));
        System.out.println("TreeSet sort time: " + (finishTreeSet - startTreeSet));
    }
}
