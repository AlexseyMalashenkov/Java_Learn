package generic;

import generic.dto.BoxObject;

public class GenericMain1 {
    public static void main(String[] args) {
        BoxObject box1 = new BoxObject();

        box1.setItem("Привет");

        System.out.println(box1.getItem());
    }
}
