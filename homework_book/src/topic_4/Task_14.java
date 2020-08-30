package topic_4;

public class Task_14 {
    public static void main(String[] args) {
        sumNums(7_893_823_445L);
    }

    public static void sumNums(long num) {
        int sum = 0;

        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);

        System.out.println(sum);
    }
}
