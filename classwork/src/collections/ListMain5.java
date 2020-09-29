package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMain5 {
    public static void main(String[] args) {
        List<Integer> data = new LinkedList<>();

        for (int i = 0; i <= 1000; i++) {
            data.add(i);
        }

        System.out.println(data);

        Iterator<Integer> iterator = data.iterator();

//        int i = -1;
//        while (iterator.hasNext()) {
//            i++;
//            Integer next = iterator.next();
//            if (next % 2 == 0) {
//                data.remove(i);
//            }
//        }

//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next % 2 == 0) {
//                iterator.remove();
//            }
//        }

        int i = -1;
        for (Integer datum : data) {
            i++;
            if (datum % 2 == 0) {
                data.remove(i);
            }
        }

        System.out.println(data);
    }
}
