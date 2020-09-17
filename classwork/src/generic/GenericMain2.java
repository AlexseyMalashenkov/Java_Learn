package generic;

import generic.dto.BoxObject;

public class GenericMain2 {
    public static void main(String[] args) {
        BoxObject box1 = new BoxObject();

        box1.setItem("Привет");

        String item1 = (String) box1.getItem();

        System.out.println(item1);

        box1.setItem(123);

        int item2 = (int) box1.getItem();

        System.out.println(item2);
    }
}
