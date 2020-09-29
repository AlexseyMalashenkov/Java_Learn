package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMain4 {
    public static void main(String[] args) {
        Set<String> data = new LinkedHashSet<>();

        boolean isAns1 = data.add("Привет");
        boolean isAns2 = data.add("Пока");
        boolean isAns3 = data.add("Привет");

        System.out.println(isAns1);
        System.out.println(isAns2);
        System.out.println(isAns3);

        System.out.println(data);

        Iterator<String> iterator = data.iterator();


    }
}