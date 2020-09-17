package generic;

import generic.dto.BoxGeneric;
import generic.dto.BoxGenericTwo;

public class GenericMain3 {
    public static void main(String[] args) {
        BoxGeneric<String> box1 = new BoxGeneric<>();

        box1.setItem("Привет");

        System.out.println(box1.getItem());

        BoxGeneric<Integer> box2 = new BoxGeneric<>();

        box2.setItem(123);

        System.out.println(box2.getItem());

        BoxGenericTwo<String, Integer> box3 = new BoxGenericTwo<>();

        box3.setItem("Hello");
        box3.setItemTwo(123);
    }
}
