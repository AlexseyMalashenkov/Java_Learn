package topic_2;

public class Task_1 {
    public static void main(String[] args) {
        int n = 99;
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
