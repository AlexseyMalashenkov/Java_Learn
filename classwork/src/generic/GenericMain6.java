package generic;

import oop.Man;
import oop.ManNameComparator;

public class GenericMain6 {
    public static void main(String[] args) {
        Man man1 = new Man("Лёша", 123);
        Man man2 = new Man("ЛёшА", 12);

        System.out.println(man1.compareTo(man2));
        System.out.println(man2.compareTo(man1));

        ManNameComparator manNameComparator1 = new ManNameComparator();
        System.out.println(manNameComparator1.compare(man1, man2));
    }
}
