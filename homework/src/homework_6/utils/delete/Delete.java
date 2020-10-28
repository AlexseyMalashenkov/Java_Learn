package homework_6.utils.delete;

import java.util.Collection;
import java.util.Iterator;

public class Delete {
    public void deleteUseIteratorFor(Collection collection) {
        long start = System.currentTimeMillis();

        for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
            iterator.next();
            iterator.remove();
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время удаления используя iterator & for: " + (finish - start));
    }

    public void deleteUseForEach(Collection collection) {
        long start = System.currentTimeMillis();

        for (Object o : collection) {
            collection.remove(o);
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время удаления используя foreach: " + (finish - start));
    }

    public void deleteUseIteratorWhile(Collection collection) {
        long start = System.currentTimeMillis();

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        long finish = System.currentTimeMillis();

        System.out.println(collection.getClass() + " время удаления используя iterator & while: " + (finish - start));
    }
}
