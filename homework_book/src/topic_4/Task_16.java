package topic_4;

public class Task_16 {
    public static void main(String[] args) {
        integerDivisibleBySeven(1, 100);
    }

    public static void integerDivisibleBySeven(int first, int second) {
        for (int i = first; i < second; i++) {
            if(i % 7 == 0) {
                System.out.println(i + ") Hope!");
            }
        }
    }
}
