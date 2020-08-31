package topic_3;

public class Task_2 {
    public static void main(String[] args) {
        numInNumber(2342);
    }

    public static void numInNumber(int number) {
        int num = 0;
        while (number != 0) {
            num++;
            number /= 10;
        }
        System.out.println(num);
    }
}
