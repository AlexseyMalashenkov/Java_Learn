package homework_6.utils.threads;

import java.util.Comparator;
import java.util.List;

public class BubbleSortThread<T> implements Runnable{
    private List<T> list;
    private Comparator<T> comparator;

    public BubbleSortThread(List<T> list, Comparator<T> comparator) {
        this.list = list;
        this.comparator = comparator;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < this.list.size(); i++) {
            int maxIndex = i;
            for (int j = i; j < this.list.size(); j++) {
                if (this.comparator.compare(this.list.get(maxIndex), this.list.get(j)) > 0) {
                    maxIndex = j;
                }
            }
            T tmp = this.list.get(maxIndex);
            this.list.set(maxIndex, this.list.get(i));
            this.list.set(i, tmp);
        }

        long finish = System.currentTimeMillis();

        System.out.println("Время сортировки методом пузырька: " + (finish - start));
    }
}
