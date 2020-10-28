package homework_6.utils.sorts;

import java.util.Comparator;
import java.util.List;

public class BubbleSort {
    public static <T> void bubbleSortList(List<T> list, Comparator<T> comparator) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            int maxIndex = i;
            for (int j = i; j < list.size(); j++) {
                if (comparator.compare(list.get(maxIndex), list.get(j)) > 0) {
                    maxIndex = j;
                }
            }
            T tmp = list.get(maxIndex);
            list.set(maxIndex, list.get(i));
            list.set(i, tmp);
        }

        long finish = System.currentTimeMillis();

        System.out.println("Время сортировки методом пузырька: " + (finish - start));
    }
}
