package homework_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(Class tClass, int length) {
        this.data = (T[]) Array.newInstance(tClass, length);
    }

    public int add(T item) {
        for (int i = 0;; i++) {
            if (i < data.length) {
                if (data[i] == null) {
                    data[i] = item;
                    return i;
                }
            } else {
                T[] tmp = Arrays.copyOf(data, data.length + 1);
                data = tmp;
                data[i] = item;
                return i;
            }
        }
    }

    public T get(int index) {
        return data[index];
    }

    public T[] getItems() {
        return data;
    }
}
