package repeats;

public class WhileMain1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(a++ + a++ + ++b);

        a = 10;
        a = a++ + a++;
        System.out.println(a);



        int i = 1;

        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }


    }
}
