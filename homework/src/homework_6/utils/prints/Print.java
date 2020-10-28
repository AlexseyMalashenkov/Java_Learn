package homework_6.utils.prints;

import java.util.Collection;
import java.util.Iterator;

public class Print {
    public void printIteratorWhile(Collection collection) {
        long start = System.currentTimeMillis();

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время вывода используя iterator & while: " + (finish - start));
    }

    public void printForEach(Collection collection) {
        long start = System.currentTimeMillis();

        for (Object o : collection) {
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время вывода используя forEach: " + (finish - start));
    }

    public void printIteratorFor(Collection collection) {
        long start = System.currentTimeMillis();

        for (Iterator iterator = collection.iterator(); iterator.hasNext(); ) {

        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время вывода используя iterator и for: " + (finish - start));
    }
}
