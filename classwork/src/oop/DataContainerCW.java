package oop;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerCW<T> {
    private T[] data;

    public DataContainerCW(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }
        return -1;
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

    public static <V extends Comparable> void sort(DataContainerCW<V> container) {
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

    public static <V> void sort(DataContainerCW<V> container, Comparator<V> comparator) {
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

    @Override
    public String toString() {
        return "DataContainerCW{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
