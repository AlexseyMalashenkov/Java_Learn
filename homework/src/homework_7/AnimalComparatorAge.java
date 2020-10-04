package homework_7;

import java.util.Comparator;

public class AnimalComparatorAge implements Comparator<Byte> {
    @Override
    public int compare(Byte o1, Byte o2) {
        return o1.compareTo(o2);
    }
}
