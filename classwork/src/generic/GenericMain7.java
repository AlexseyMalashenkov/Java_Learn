package generic;

import oop.Man;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class GenericMain7 {
    public static void main(String[] args) {
        Collection<Man> data1 = new ArrayList<>();

        Generator.generator(data1, Generator::generateMan, 10_000); //Ссылка на метод

        job(data1);

        sort(data1, Sorts::sortByName);
        sort(data1, Sorts::sortByYearOld);
    }

    public static <T> void sort(Collection<T> data, Comparator<T> comparator) {
        Iterator<T> iterator = data.iterator();
        while (iterator.hasNext()) {
            T left = iterator.next();
            T right = iterator.next();
            if (comparator.compare(left, right) > 1) {

            }
        }
    }

    public static <T> void job(Collection<T> data) {
        for (T o : data) {
            System.out.println(o);
        }
    }
}
