package generic;

import oop.Man;

public class Sorts {
    public static int sortByYearOld(Man man1, Man man2) {
        return man1.getYearOld() - man2.getYearOld();
    }

    public static int sortByName(Man man1, Man man2) {
        return man1.getName().compareTo(man2.getName());
    }
}
