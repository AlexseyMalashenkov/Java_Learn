package tasks_For_Chapter_1;

public class Task_1 {
    public static void main(String[] args) {
        numExponentiation(2, 4);
    }

    public static void numExponentiation(int num, int exponentiation) {
        int tmp = 1;

        for(int i = 0; i < exponentiation; i++) {
            tmp *= num;
            System.out.println(tmp);
        }
    }
}
