package topic_5;

public class Task_18 {
    public static void main(String[] args) {
        int[] mass = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }

        for (int i: mass) {
            System.out.print(i + " ");
        }
    }
}
