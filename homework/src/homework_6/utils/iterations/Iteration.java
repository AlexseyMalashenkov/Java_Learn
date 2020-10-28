package homework_6.utils.iterations;

import java.util.Collection;
import java.util.Iterator;

public class Iteration {
    public void iterationUseIteratorWhile(Collection collection) {
        long start = System.currentTimeMillis();

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время итерирования используя iterator & while: " + (finish - start));
    }

    public void iterationUseIteratorFor(Collection collection) {
        long start = System.currentTimeMillis();

        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext();) {
            iterator.next();
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время итерирования используя iterator & for: " + (finish - start));
    }

    public void iterationUseFor(Collection collection) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < collection.size(); i++) {

        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время итерирования используя for: " + (finish - start));
    }
}
