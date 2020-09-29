package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMain3 {
    public static void main(String[] args) {
        List<Integer> data = new LinkedList<>();

        for (int i = 0; i <= 1000; i++) {
            data.add(i);
        }

        System.out.println(data);

        Iterator<Integer> iterator = data.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------");

        iterator = data.iterator();

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next + next);
        }

    }
}