package oop;

import oop.calc.dto.ICalc;

import javax.naming.ldap.SortControl;

public class SortMain {
    public static void main(String[] args) {
        SomeComparator comparator = new SomeComparator();
        BadComparator badComparator = new BadComparator();
        DataContainerCW<Integer> container = new DataContainerCW(new Integer[5]);
        container.add(4);
        container.add(7);
        container.add(25);
        container.add(1);
        container.add(0);

        System.out.println(container.toString());
        container.sort(comparator);
        //container.sort(badComparator);
        System.out.println(container.toString());

        DataContainerCW<ICalc> iCalcDataContainerCW = new DataContainerCW<>(new ICalc[10]);
        //DataContainerCW.sort(iCalcDataContainerCW);
        DataContainerCW.sort(container);
        DataContainerCW.sort(container, comparator);

    }
}
