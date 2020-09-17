package generic;

import generic.dto.BoxNumber;

public class GenericMain4 {
    public static void main(String[] args) {
        BoxNumber<Integer> box1 = new BoxNumber<>();

        box1.setItem(123);

        System.out.println(box1.getItem());
    }
}
