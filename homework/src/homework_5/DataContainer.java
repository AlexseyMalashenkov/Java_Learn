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

    public boolean delete(int index) {
        if (index < data.length) {
            for (int i = index; i < data.length - 1; i++)
            {
                data[i] = data[i + 1];
            }
            T[] tmp = Arrays.copyOf(data, data.length - 1);
            data = tmp;

            return true;
        } else {
            return false;
        }
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                delete(i);
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public T get(int index) {
        return data[index];
    }

    public T[] getItems() {
        return data;
    }
}
