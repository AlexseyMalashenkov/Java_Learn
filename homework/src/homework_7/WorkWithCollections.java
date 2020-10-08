package homework_7;

import collections.utils.AnyRandom;

import java.util.*;
import java.util.stream.Collectors;

import static collections.utils.AnyRandom.getRandomNumberInRange;

public class WorkWithCollections {
    public void printIteratorWhile(Collection collection) {
        long start = System.currentTimeMillis();

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время вывода используя iterator & while: " + (finish - start));
    }

    public void printIteratorForEach(Collection collection) {
        long start = System.currentTimeMillis();

        for (Object o : collection) {
            System.out.println(o);
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время вывода используя forEach: " + (finish - start));
    }

    public void printIteratorFor(Collection collection) {
        long start = System.currentTimeMillis();

        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время вывода используя iterator и for: " + (finish - start));
    }

    public void addElements(Collection collection, boolean isPeople) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            if (isPeople == true) {
                collection.add(new Person(AnyRandom.nextString(getRandomNumberInRange(5, 10)),
                        AnyRandom.nextString(getRandomNumberInRange(5, 10))));
            } else {
                collection.add(new Animal(getRandomNumberInRange(5, 10),
                        AnyRandom.nextString(getRandomNumberInRange(5, 10))));
            }
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время добавления используя простой цикл до 1_000_000: " + (finish - start));
    }

    public void iterationUseIteratorWhile(Collection collection) {
        long start = System.currentTimeMillis();

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время итерирования используя iterator & while: " + (finish - start));
    }

    public void iterationUseIteratorFor(Collection collection) {
        long start = System.currentTimeMillis();

        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext();) {
            iterator.next();
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время итерирования используя iterator & for: " + (finish - start));
    }

    public void iterationUseFor(Collection collection) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < collection.size(); i++) {

        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время итерирования используя for: " + (finish - start));
    }

    public void deleteUseIteratorFor(Collection collection) {
        long start = System.currentTimeMillis();

        for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
            iterator.next();
            iterator.remove();
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время удаления используя iterator & for: " + (finish - start));
    }

    public void deleteUseForEach(Collection collection) {
        long start = System.currentTimeMillis();

        for (Object o : collection) {
            collection.remove(o);
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время удаления используя foreach: " + (finish - start));
    }

    public void deleteUseIteratorWhile(Collection collection) {
        long start = System.currentTimeMillis();

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время удаления используя iterator & while: " + (finish - start));
    }

    public void sortList(List list, Comparator comparator) {
        long start = System.currentTimeMillis();

        list.sort(comparator);

        long finish = System.currentTimeMillis();

        System.out.println("Время сортировки List: " + (finish - start));
    }

    public void sortSet(Set set, Comparator comparator) {
        long start = System.currentTimeMillis();

        printIteratorWhile(Collections.singleton(set.stream().sorted(comparator).collect(Collectors.toList())));

        long finish = System.currentTimeMillis();

        System.out.println("Время сортировки Set: " + (finish - start));
    }
}