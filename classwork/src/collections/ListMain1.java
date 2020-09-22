package collections;

import java.util.ArrayList;
import java.util.List;

public class ListMain1 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();

        data.add(10);
        data.add(189);
        data.add(1000);
        data.add(99);
        data.add(1000);
        System.out.println(data);

        data.add(1, 789);
        System.out.println(data);

        Integer oldValue = data.set(1, 0);
        System.out.println(data);
        System.out.println(oldValue);

        //data.remove(1000);
        data.remove(Integer.valueOf(1000));
        System.out.println(data);

        int index = data.indexOf(1000);


    }
}