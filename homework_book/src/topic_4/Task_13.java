package topic_4;

public class Task_13 {
    public static void main(String[] args) {
        int i = 1;
        int out = 1;

        do {
            out *= i;
            i++;
        } while (i <= 25);

        System.out.println(out);
    }
}
