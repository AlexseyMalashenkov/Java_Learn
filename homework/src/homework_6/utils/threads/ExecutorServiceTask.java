package homework_6.utils.threads;


import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTask<T> {
    private List<T> list;
    private Comparator<T> comparator;

    public ExecutorServiceTask(List<T> list, Comparator<T> comparator) {
        this.list = list;
        this.comparator = comparator;

        ExecutorService executor = Executors.newSingleThreadExecutor();

        System.out.println("Запуск потока сортировки пузырьком");

        executor.execute(new BubbleSortThread<T>(list, comparator));

        executor.shutdown();
    }
}
