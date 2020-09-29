package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMain4 {
    public static void main(String[] args) {
        List<Integer> data = new LinkedList<>();

        for (int i = 0; i <= 1000; i++) {
            data.add(i);
        }

        System.out.println(data);

        Iterator<Integer> iterator = data.iterator();

        data.set(3, 555555);

        data = new LinkedList<>();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}