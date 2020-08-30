package topic_4;

public class Task_15 {
    public static void main(String[] args) {
        findSecondPrimeNumber(50, 70);
    }

    public static void findSecondPrimeNumber(int first, int second) {
        int tmp = 0;
        for (int i = first; i < second; i++) {
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                tmp++;
            }
            if (tmp == 2) {
                System.out.println(i);
                break;
            }
        }
    }
}
