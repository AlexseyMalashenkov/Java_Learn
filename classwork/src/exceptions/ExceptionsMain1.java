package exceptions;

import oop.Man;

import java.util.LinkedList;
import java.util.List;

public class ExceptionsMain1 {
    public static void main(String[] args) {
        List<Man> mans = new LinkedList<>();
        int i = 0;

        try {
            while (1 == 1) {
                mans.add(new Man());
                System.out.println(i);
                i++;
            }
        } catch (OutOfMemoryError error) {

        }

        System.out.println("Work");
    }
}
