package homework_6.utils.sorts;

import homework_6.utils.prints.Print;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UsualSort {
    public <T> void sortList(List<T> list, Comparator<T> comparator) {
        long start = System.currentTimeMillis();

        list.sort(comparator);

        long finish = System.currentTimeMillis();

        System.out.println("Время сортировки List: " + (finish - start));
    }

    public <T> void sortSet(Set<T> set, Comparator<T> comparator) {
        long start = System.currentTimeMillis();
        Print print = new Print();
        print.printIteratorWhile(Collections.singleton(set.stream().sorted(comparator).collect(Collectors.toList())));

        long finish = System.currentTimeMillis();

        System.out.println("Время сортировки Set: " + (finish - start));
    }
}
