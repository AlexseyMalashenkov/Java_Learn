package homework_5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T> {
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

    private void deleteNullElements() {
        int countNulls = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                countNulls++;
            }
        }

        T[] tmp = Arrays.copyOf(data, data.length - countNulls);

        for (int i = 0, j = 0; i < data.length; i++) {
            if (data[i] != null) {
                tmp[j] = data[i];
                j++;
            }
        }
        data = tmp;
    }

    public void sort(Comparator<T> comparator) {
        boolean isSorted = false;
        T tmp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < this.data.length; i++) {
                if (comparator.compare(this.data[i], this.data[i - 1]) < 0) {
                    tmp = this.data[i];
                    this.data[i] = this.data[i - 1];
                    this.data[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    public static <V extends Comparable> void sort(DataContainer<V> container) {
        boolean isSorted = false;
        V tmp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < container.data.length; i++) {
                if ((container.data[i].compareTo(container.data[i - 1])) < 0) {
                    tmp = container.data[i];
                    container.data[i] = container.data[i - 1];
                    container.data[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    public static <V> void sort(DataContainer<V> container, Comparator<V> comparator) {
        boolean isSorted = false;
        V tmp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < container.data.length; i++) {
                if (comparator.compare(container.data[i],container.data[i - 1]) < 0) {
                    tmp = container.data[i];
                    container.data[i] = container.data[i - 1];
                    container.data[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    public T get(int index) {
        if (index < data.length) {
            return data[index];
        } else {
            return null;
        }
    }

    public T[] getItems() {
        return data;
    }

    @Override
    public String toString() {
        deleteNullElements();
        return "DataContainer {" + "data = " + Arrays.toString(data) + "}";
    }
}
